package com.skniro.agree.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.skniro.agree.block.init.LeafCropBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.dispenser.ShearsDispenserBehavior;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.event.GameEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ShearsDispenserBehavior.class)
public class ShearsDispenserBehaviorMixin {
    @ModifyReturnValue(
            method = "tryShearBlock",
            at = @At("TAIL")
    )
    private static boolean tryShearAppleLeaves(boolean original, @Local(argsOnly = true) ServerWorld world, @Local(argsOnly = true) BlockPos pos) {
        BlockState blockState = world.getBlockState(pos);
        if (blockState.getBlock() instanceof LeafCropBlock leafCrop) {
            int age = blockState.get(LeafCropBlock.AGE);
            if (age > 1) {
                world.playSound((Entity)null, pos, SoundEvents.BLOCK_BEEHIVE_SHEAR, SoundCategory.BLOCKS, 1.0F, 1.0F);
                ItemStack drop = new ItemStack(leafCrop.fruitItem, 1);
                Block.dropStack(world, pos, drop);
                BlockState newState = blockState.with(LeafCropBlock.AGE, 1);
                world.setBlockState(pos, newState, 2);
                world.emitGameEvent(null, GameEvent.SHEAR, pos);
                return true;
            }
        }

        return false;
    }
}
