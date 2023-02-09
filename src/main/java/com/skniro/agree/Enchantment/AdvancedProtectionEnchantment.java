package com.skniro.agree.Enchantment;

import net.minecraft.class_8103;
import net.minecraft.enchantment.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.damage.DamageSource;


public class AdvancedProtectionEnchantment extends ProtectionEnchantment {

    public AdvancedProtectionEnchantment(Rarity rarity, Type type, EquipmentSlot... slots) {
        super(rarity, type, slots);
    }

    public static final EquipmentSlot[] ALL_ARMOR = new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET};

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public int getMinPower(int level) {
        return this.protectionType.getBasePower() + (level - 1) * this.protectionType.getPowerPerLevel();
    }

    @Override
    public int getMaxPower(int level) {
        return this.getMinPower(level) + this.protectionType.getPowerPerLevel();
    }

    @Override
    public int getProtectionAmount(int level, DamageSource source) {
        if (source.method_48789(class_8103.BYPASSES_INVULNERABILITY)) {
            return 0;
        }
        if (this.protectionType == Type.ALL) {
            return level * 2;
        }
        if (this.protectionType == Type.FIRE && source.method_48789(class_8103.IS_FIRE)) {
            return level * 4;
        }
        if (this.protectionType == Type.FALL && source.method_48789(class_8103.IS_FALL)) {
            return level * 5;
        }
        if (this.protectionType == Type.EXPLOSION && source.method_48789(class_8103.IS_EXPLOSION)) {
            return level * 4;
        }
        if (this.protectionType == Type.PROJECTILE && source.method_48789(class_8103.IS_PROJECTILE)) {
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