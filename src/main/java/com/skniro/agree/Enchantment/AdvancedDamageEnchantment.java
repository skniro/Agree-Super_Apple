package com.skniro.agree.Enchantment;

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
            super(weight, EnchantmentTarget.WEAPON, slots);
            this.typeIndex = typeIndex;
        }

        @Override
        public int getMinPower(int level) {
            return BASE_POWERS[this.typeIndex] + (level - 1) * POWERS_PER_LEVEL[this.typeIndex];
        }

        @Override
        public int getMaxPower(int level) {
            return this.getMinPower(level) + MIN_MAX_POWER_DIFFERENCES[this.typeIndex];
        }

        @Override
        public int getMaxLevel() {
            return 5;
        }

        @Override
        public float getAttackDamage(int level, EntityGroup group) {
            if (this.typeIndex == 0) {
                return 1.5f + (float)Math.max(0, level - 1) * 2.0f;
            }
            if (this.typeIndex == 1 && group == net.minecraft.entity.EntityGroup.UNDEAD) {
                return (float)level * 2.5f;
            }
            if (this.typeIndex == 2 && group == net.minecraft.entity.EntityGroup.ARTHROPOD) {
                return (float)level * 2.5f;
            }
            return 0.0f;
        }

        @Override
        public boolean canAccept(Enchantment other) {
            return !(other instanceof DamageEnchantment);
        }

        @Override
        public boolean isAcceptableItem(ItemStack stack) {
            if (stack.getItem() instanceof AxeItem) {
                return true;
            }
            return super.isAcceptableItem(stack);
        }

        @Override
        public void onTargetDamaged(LivingEntity user, Entity target, int level) {
            if (target instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity)target;
                if (this.typeIndex == 2 && level > 0 && livingEntity.getGroup() == net.minecraft.entity.EntityGroup.ARTHROPOD) {
                    int i = 20 + user.getRandom().nextInt(10 * level);
                    livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, i, 3));
                }
            }
        }
}
