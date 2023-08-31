package com.skniro.agree.Enchantment;


import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.ProtectionEnchantment;


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
    public int getMinCost(int level) {
        return this.type.getMinCost() + (level - 1) * this.type.getLevelCost();
    }

    @Override
    public int getMaxCost(int level) {
        return this.getMinCost(level) + this.type.getLevelCost();
    }

    @Override
    public int getDamageProtection(int level, DamageSource source) {
        if (source.is(DamageTypeTags.BYPASSES_INVULNERABILITY)) {
            return 0;
        }
        if (this.type == Type.ALL) {
            return level * 2;
        }
        if (this.type == Type.FIRE && source.is(DamageTypeTags.IS_FIRE)) {
            return level * 4;
        }
        if (this.type == Type.FALL && source.is(DamageTypeTags.IS_FALL)) {
            return level * 5;
        }
        if (this.type == Type.EXPLOSION && source.is(DamageTypeTags.IS_EXPLOSION)) {
            return level * 4;
        }
        if (this.type == Type.PROJECTILE && source.is(DamageTypeTags.IS_PROJECTILE)) {
            return level * 4;
        }
        return 0;
    }

    /**
     * Determines if the enchantment passed can be applyied together with this enchantment.
     */
    public boolean checkCompatibility(Enchantment ench) {
        if (this == Enchantments.ALL_DAMAGE_PROTECTION) return ench != this;
        if (this == Enchantments.PROJECTILE_PROTECTION) return ench != this;
        if (ench instanceof ProtectionEnchantment) {
            ProtectionEnchantment pEnch = (ProtectionEnchantment) ench;
            if (this.type == pEnch.type) {
                return false;
            }
            return this.type == Type.FALL || pEnch.type == Type.FALL;
        }
        return ench != this;
    }
}