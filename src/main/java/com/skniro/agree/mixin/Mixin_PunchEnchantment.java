package com.skniro.agree.mixin;

import net.minecraft.enchantment.PunchEnchantment;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(PunchEnchantment.class)
public class Mixin_PunchEnchantment {
    public int getMaxLevel() {
        return 4;
    }
}
