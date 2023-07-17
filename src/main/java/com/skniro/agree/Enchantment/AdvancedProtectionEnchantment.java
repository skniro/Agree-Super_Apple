package com.skniro.agree.Enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.ProtectionEnchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.util.Rarity;


public class AdvancedProtectionEnchantment extends ProtectionEnchantment {

    public AdvancedProtectionEnchantment(Weight weight, Type type, EquipmentSlot... slots) {
        super(weight, type, slots);
    }

    public static final EquipmentSlot[] ALL_ARMOR = new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET};

    @Override
    public int getMaximumLevel() {
        return 5;
    }

    @Override
    public int getMinimumPower(int level) {
        return this.protectionType.getBasePower() + (level - 1) * this.protectionType.getPowerPerLevel();
    }

    @Override
    public int getMaximumPower(int level) {
        return this.getMinimumPower(level) + this.protectionType.getPowerPerLevel();
    }

    @Override
    public int getProtectionAmount(int level, DamageSource source) {
        if (source.isOutOfWorld()) {
            return 0;
        }
        if (this.protectionType == Type.ALL) {
            return level * 2;
        }
        if (this.protectionType == Type.FIRE && source.isFire()) {
            return level * 4;
        }
        if (this.protectionType == Type.FALL && source == DamageSource.FALL) {
            return level * 5;
        }
        if (this.protectionType == Type.EXPLOSION && source.isExplosive()) {
            return level * 4;
        }
        if (this.protectionType == Type.PROJECTILE && source.isProjectile()) {
            return level * 4;
        }
        return 0;
    }

    /**
     * Determines if the enchantment passed can be applyied together with this enchantment.
     */
    public boolean checkCompatibility(Enchantment ench) {
        if (this == Enchantments.PROTECTION) return ench != this;
        if (this == Enchantments.PROJECTILE_PROTECTION) return ench != this;
        if (ench instanceof ProtectionEnchantment) {
            ProtectionEnchantment pEnch = (ProtectionEnchantment) ench;
            if (this.protectionType == pEnch.protectionType) {
                return false;
            }
            return this.protectionType == Type.FALL || pEnch.protectionType == Type.FALL;
        }
        return ench != this;
    }
}