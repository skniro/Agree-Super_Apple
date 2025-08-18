package com.skniro.agree.event;


import com.skniro.agree.block.init.LeafCropBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.dispenser.FallibleItemDispenserBehavior;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPointer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.event.GameEvent;

public class GoldenAppleDispenserBehaviors {

    public static void register() {
        DispenserBlock.registerBehavior(Items.SHEARS, new ShearsDispenserBehavior());
    }

    private static class ShearsDispenserBehavior extends FallibleItemDispenserBehavior {
        protected ItemStack dispenseSilently(BlockPointer pointer, ItemStack stack) {
            ServerWorld serverWorld = pointer.world();
            if (!serverWorld.isClient()) {
                BlockPos blockPos = pointer.pos().offset((Direction)pointer.state().get(DispenserBlock.FACING));
                this.setSuccess(tryShearBlock(serverWorld, blockPos));
                if (this.isSuccess()) {
                    stack.damage(1, serverWorld.getRandom(), (ServerPlayerEntity) null);
                }
            }

            return stack;
        }

        private static boolean tryShearBlock(ServerWorld world, BlockPos pos) {
            BlockState blockState = world.getBlockState(pos);
            if (blockState.getBlock() instanceof LeafCropBlock leafCrop) {
                int age = blockState.get(LeafCropBlock.AGE);
                if (age > 1) {
                    world.playSound((Entity)null, pos, SoundEvents.BLOCK_BEEHIVE_SHEAR, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    ItemStack drop = new ItemStack(leafCrop.fruitItem, 1);
                    Block.dropStack(world, pos, drop);
                    BlockState newState = blockState.with(LeafCropBlock.AGE, 1);
                    world.setBlockState(pos, newState, 2);
                    world.emitGameEvent((Entity)null, GameEvent.SHEAR, pos);
                    return true;
                }
            }

            return false;
        }
    }
}