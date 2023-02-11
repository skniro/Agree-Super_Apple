package com.skniro.agree.mixin;

import net.minecraft.enchantment.LuckEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LuckEnchantment.class)
public class Mixin_LuckEnchantment {
    @Inject(method = "getMaxLevel", at = @At("RETURN"), cancellable = true)
    public void maxLevel(CallbackInfoReturnable<Integer> cir){
        cir.setReturnValue(5);
    }
}
