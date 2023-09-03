package com.skniro.agree.block.init;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.registries.RegistryObject;


import java.util.OptionalInt;

public class LeafCropBlock extends Block {
    public static final IntegerProperty AGE;
    private static final VoxelShape SMALL_SHAPE;
    private static final VoxelShape LARGE_SHAPE;
    private final RegistryObject<Item> fruitItem;
    public static final IntegerProperty DISTANCE;

    public LeafCropBlock(Properties settings, RegistryObject<Item> fruitItem) {
        super(settings);
        this.fruitItem = fruitItem;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        if ((Integer)state.getValue(AGE) == 0) {
            return SMALL_SHAPE;
        } else {
            return (Integer)state.getValue(AGE) < 2 ? LARGE_SHAPE : super.getShape(state, world, pos, context);
        }
    }
    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return (Integer)state.getValue(AGE) < 2;
    }

    @Override
    public void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        int i = (Integer)state.getValue(AGE);
        if (i < 2 && random.nextInt(40) == 0 && world.getRawBrightness(pos.above(), 0) >= 9) {
            BlockState blockState = (BlockState)state.setValue(AGE, i + 1);
            world.setBlock(pos, blockState, 2);
            world.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(blockState));
        }
        if (this.shouldDecay(state)) {
            dropResources(state, world, pos);
            world.removeBlock(pos, false);
        }

    }


    protected boolean shouldDecay(BlockState state) {
        return (Integer)state.getValue(DISTANCE) == 7;
    }
    @Override
    public void tick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        world.setBlock(pos, updateDistance(state, world, pos), 3);
    }
    @Override
    public int getLightBlock(BlockState state, BlockGetter world, BlockPos pos) {
        return 1;
    }
    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor world, BlockPos pos, BlockPos neighborPos) {
        int i = getDistanceFromLog(neighborState) + 1;
        if (i != 1 || (Integer)state.getValue(DISTANCE) != i) {
            world.scheduleTick(pos, this, 1);
        }

        return state;
    }

    @Override
    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        int i = (Integer)state.getValue(AGE);
        boolean bl = i == 2;
        if (i > 1) {
            int j = 1;
            popResource(world, pos, new ItemStack(fruitItem.get(), j ));
            world.playSound((Player)null, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0F, 0.8F + world.random.nextFloat() * 0.4F);
            BlockState blockState = (BlockState)state.setValue(AGE, 1);
            world.setBlock(pos, blockState, 2);
            world.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(player, blockState));
            return InteractionResult.sidedSuccess(world.isClientSide);
        } else {
            return super.use(state, world, pos, player, hand, hit);
        }
    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{AGE, DISTANCE});
    }

    public boolean isBonemealSuccess(Level world, RandomSource random, BlockPos pos, BlockState state) {
        return true;
    }

    public void grow(ServerLevel world, RandomSource random, BlockPos pos, BlockState state) {
        int i = Math.min(2, (Integer)state.getValue(AGE) + 1);
        world.setBlock(pos, (BlockState)state.setValue(AGE, i), 2);
    }

    private static BlockState updateDistance(BlockState state, LevelAccessor world, BlockPos pos) {
        var i = 7;
        BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();

        for(Direction direction : Direction.values()) {
            blockpos$mutableblockpos.setWithOffset(pos, direction);
            i = Math.min(i, getDistanceFromLog(world.getBlockState(blockpos$mutableblockpos)) + 1);
            if (i == 1) {
                break;
            }
        }

        return state.setValue(DISTANCE, i);
    }


    private static int getDistanceFromLog(BlockState state) {
        return getOptionalDistanceFromLog(state).orElse(7);
    }

    public static OptionalInt getOptionalDistanceFromLog(BlockState state) {
        if (state.is(BlockTags.LOGS)) {
            return OptionalInt.of(0);
        } else {
            return state.hasProperty(DISTANCE) ? OptionalInt.of((Integer)state.getValue(DISTANCE)) : OptionalInt.empty();
        }
    }


    static {
        AGE = BlockStateProperties.AGE_2;
        DISTANCE = BlockStateProperties.DISTANCE;
        SMALL_SHAPE = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 8.0D, 13.0D);
        LARGE_SHAPE = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);
    }
}
