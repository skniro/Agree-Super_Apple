package com.skniro.agree.Enchantment;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.DamageEnchantment;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class AdvancedDamageEnchantment
    extends Enchantment {
        public static final int ALL_INDEX = 0;
        public static final int UNDEAD_INDEX = 1;
        public static final int ARTHROPODS_INDEX = 2;
        private static final String[] TYPE_NAMES = new String[]{"all", "undead", "arthropods"};
        private static final int[] BASE_POWERS = new int[]{5, 5, 5};
        private static final int[] POWERS_PER_LEVEL = new int[]{13, 8, 8};
        private static final int[] MIN_MAX_POWER_DIFFERENCES = new int[]{20, 20, 20};
        public final int typeIndex;

    public AdvancedDamageEnchantment(Enchantment.Rarity weight, int typeIndex, EquipmentSlot... slots) {
            super(weight, EnchantmentCategory.WEAPON, slots);
            this.typeIndex = typeIndex;
        }

        @Override
        public int getMinCost(int level) {
            return BASE_POWERS[this.typeIndex] + (level - 1) * POWERS_PER_LEVEL[this.typeIndex];
        }

        @Override
        public int getMaxCost(int level) {
            return this.getMinCost(level) + MIN_MAX_POWER_DIFFERENCES[this.typeIndex];
        }

        @Override
        public int getMaxLevel() {
            return 5;
        }

        @Override
        public float getDamageBonus(int level, MobType group) {
            if (this.typeIndex == 0) {
                return 1.5f + (float)Math.max(0, level - 1) * 2.0f;
            }
            if (this.typeIndex == 1 && group == MobType.UNDEAD) {
                return (float)level * 2.5f;
            }
            if (this.typeIndex == 2 && group == MobType.ARTHROPOD) {
                return (float)level * 2.5f;
            }
            return 0.0f;
        }

        @Override
        public boolean checkCompatibility(Enchantment other) {
            return !(other instanceof DamageEnchantment);
        }

        @Override
        public boolean canEnchant(ItemStack stack) {
            if (stack.getItem() instanceof AxeItem) {
                return true;
            }
            return super.canEnchant(stack);
        }

        @Override
        public void doPostAttack(LivingEntity user, Entity target, int level) {
            if (target instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity)target;
                if (this.typeIndex == 2 && level > 0 && livingEntity.getMobType() == MobType.ARTHROPOD) {
                    int i = 20 + user.getRandom().nextInt(10 * level);
                    livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, i, 3));
                }
            }
        }
}
