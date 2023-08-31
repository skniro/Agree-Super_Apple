package com.skniro.agree.mixin;

import com.skniro.agree.conifg.AgreeConfig;
import net.minecraft.world.item.enchantment.FishingSpeedEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FishingSpeedEnchantment.class)
public class Mixin_LureEnchantment {
    @Inject(method = "getMaxLevel", at = @At("RETURN"), cancellable = true)
    public void maxLevel(CallbackInfoReturnable<Integer> cir){
        if(AgreeConfig.Enchantment_Module.get()) {
            cir.setReturnValue(5);
        }
    }
}
