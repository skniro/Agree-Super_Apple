package com.skniro.agree.mixin;

import net.minecraft.enchantment.SweepingEnchantment;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(SweepingEnchantment.class)
public class Mixin_SweepingEnchantment {
    public int getMaxLevel() {
        return 5;
    }
}
