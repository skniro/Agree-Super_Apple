package com.skniro.agree.mixin;

import com.skniro.agree.block.init.LeafCropBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.dispenser.ShearsDispenseItemBehavior;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ShearsDispenseItemBehavior.class)
public abstract class ShearsDispenseItemBehaviorMixin {
    @Shadow
    private static boolean shadow$tryShearBeehive(ServerLevel p_123577_, BlockPos p_123578_) {
        return false;
    }

    @Redirect(
            method = "execute",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/core/dispenser/ShearsDispenseItemBehavior;tryShearBeehive(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)Z"
            )
    )
    private boolean tryShearBlock(ServerLevel world, BlockPos pos){
        return shadow$tryShearBeehive(world, pos) || tryShearBlock(world, pos);
    }


    @Unique
    private static boolean goldenApple$tryShearLeaves(ServerLevel world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        if (state.getBlock() instanceof LeafCropBlock leafCrop) {
            int age = state.getValue(LeafCropBlock.AGE);
            if (age > 1) {
                world.playSound(null, pos, SoundEvents.BEEHIVE_SHEAR, SoundSource.BLOCKS, 1.0F, 1.0F);
                Block.popResource(world, pos, new ItemStack(leafCrop.fruitItem.get(), 1));
                BlockState newState = state.setValue(LeafCropBlock.AGE, 1);
                world.setBlock(pos, newState, 2);
                world.gameEvent(null, GameEvent.SHEAR, pos);
                return true;
            }
        }
        return false;
    }
}
