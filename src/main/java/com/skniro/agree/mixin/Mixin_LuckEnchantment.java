package com.skniro.agree.mixin;

import net.minecraft.enchantment.LuckEnchantment;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(LuckEnchantment.class)
public class Mixin_LuckEnchantment {
    public int getMaxLevel() {
        return 5;
    }
}
