package com.skniro.agree.event;

import com.skniro.agree.block.init.LeafCropBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockSource;
import net.minecraft.core.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.gameevent.GameEvent;

public class GoldenAppleDispenserBehaviors {
    public static void register() {
        DispenserBlock.registerBehavior(Items.SHEARS, new ShearsDispenserBehavior());
    }

    private static class ShearsDispenserBehavior extends DefaultDispenseItemBehavior {
        @Override
        protected ItemStack execute(BlockSource source, ItemStack stack) {
            ServerLevel world = source.getLevel();
            BlockPos targetPos = source.getPos().relative(source.getBlockState().getValue(DispenserBlock.FACING));
            BlockState state = world.getBlockState(targetPos);
            if (tryShearBlock(world, targetPos, state, stack)) {
                return stack;
            }
            return super.execute(source, stack);
        }

        private static boolean tryShearBlock(ServerLevel world, BlockPos pos, BlockState state, ItemStack stack) {
            if (state.getBlock() instanceof LeafCropBlock leafCrop) {
                int age = state.getValue(LeafCropBlock.AGE);
                if (age > 1) {
                    world.playSound(null, pos, SoundEvents.BEEHIVE_SHEAR, SoundSource.BLOCKS, 1.0F, 1.0F);
                    Block.popResource(world, pos, new ItemStack(leafCrop.fruitItem.get(), 1));
                    BlockState newState = state.setValue(LeafCropBlock.AGE, 1);
                    world.setBlock(pos, newState, 2);
                    world.gameEvent(null, GameEvent.SHEAR, pos);
                    stack.hurt(1, world.getRandom(), null);
                    return true;
                }
            }
            return false;
        }
    }
}
