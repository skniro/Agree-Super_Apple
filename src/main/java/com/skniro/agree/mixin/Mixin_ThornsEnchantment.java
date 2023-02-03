package com.skniro.agree.mixin;

import net.minecraft.enchantment.ThornsEnchantment;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ThornsEnchantment.class)
public class Mixin_ThornsEnchantment {
    public int getMaxLevel() {
        return 5;
    }
}
