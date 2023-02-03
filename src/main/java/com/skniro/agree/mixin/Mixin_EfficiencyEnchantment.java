package com.skniro.agree.mixin;

import net.minecraft.enchantment.EfficiencyEnchantment;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(EfficiencyEnchantment.class)
public class Mixin_EfficiencyEnchantment {
    public int getMaxLevel() {
        return 10;
    }
}
