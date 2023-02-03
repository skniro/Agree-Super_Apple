package com.skniro.agree.mixin;

import net.minecraft.enchantment.UnbreakingEnchantment;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(UnbreakingEnchantment.class)
public class Mixin_UnbreakingEnchantment {
    public int getMaxLevel() {
        return 6;
    }
}
