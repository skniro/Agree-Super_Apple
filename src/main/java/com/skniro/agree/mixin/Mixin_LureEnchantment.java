package com.skniro.agree.mixin;

import net.minecraft.enchantment.LureEnchantment;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(LureEnchantment.class)
public class Mixin_LureEnchantment {
    public int getMaxLevel() {
        return 5;
    }
}
