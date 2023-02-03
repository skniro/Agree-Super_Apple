package com.skniro.agree.mixin;

import net.minecraft.enchantment.PowerEnchantment;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(PowerEnchantment.class)
public class Mixin_PowerEnchantment {
    public int getMaxLevel() {
        return 8;
    }
}
