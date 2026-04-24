package com.skniro.agree.event;


import com.skniro.agree.block.init.LeafCropBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.dispenser.BlockSource;
import net.minecraft.core.dispenser.DispenseItemBehavior;
import net.minecraft.core.dispenser.OptionalDispenseItemBehavior;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;

public class GoldenAppleDispenserBehaviors {

    public static void register() {
        var oldBehavior = DispenserBlock.DISPENSER_REGISTRY.get(Items.SHEARS);
        DispenserBlock.registerBehavior(Items.SHEARS, new ShearsDispenserBehavior(oldBehavior));
    }

    private static class ShearsDispenserBehavior extends OptionalDispenseItemBehavior {
        private final DispenseItemBehavior original;

        public ShearsDispenserBehavior(DispenseItemBehavior original) {
            this.original = original;
        }

        protected ItemStack execute(BlockSource pointer, ItemStack stack) {
            ServerLevel serverWorld = pointer.level();
            if (!serverWorld.isClientSide()) {
                BlockPos blockPos = pointer.pos().relative((Direction)pointer.state().getValue(DispenserBlock.FACING));
                this.setSuccess(tryShearBlock(serverWorld, blockPos));
                if (this.isSuccess()) {
                    stack.hurtAndBreak(1, serverWorld, (ServerPlayer)null, (item) -> {
                    });
                }
            }

            return original != null ? original.dispense(pointer, stack) : super.execute(pointer, stack);
        }

        private static boolean tryShearBlock(ServerLevel world, BlockPos pos) {
            BlockState blockState = world.getBlockState(pos);
            if (blockState.getBlock() instanceof LeafCropBlock leafCrop) {
                int age = blockState.getValue(LeafCropBlock.AGE);
                if (age > 1) {
                    world.playSound((Entity)null, pos, SoundEvents.BEEHIVE_SHEAR, SoundSource.BLOCKS, 1.0F, 1.0F);
                    ItemStack drop = new ItemStack(leafCrop.fruitItem, 1);
                    Block.popResource(world, pos, drop);
                    BlockState newState = blockState.setValue(LeafCropBlock.AGE, 1);
                    world.setBlock(pos, newState, 2);
                    world.gameEvent((Entity)null, GameEvent.SHEAR, pos);
                    return true;
                }
            }

            return false;
        }
    }
}