package com.skniro.agree.item.init;

import com.skniro.agree.item.Gemstone;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.function.Supplier;

public enum AgreeToolMaterials implements Tier {
    RUBY(3, 3231, 12.0F, 3.0F, 22, () -> {
        return Ingredient.of(new ItemLike[]{Gemstone.RUBY.get()});
    });

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private AgreeToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new LazyLoadedValue(repairIngredient);
    }

    @Override
    public int getUses() {
        return this.itemDurability;
    }

    @Override
    public float getSpeed() {
        return this.miningSpeed;
    }
    @Override
    public float getAttackDamageBonus() {
        return this.attackDamage;
    }
    @Override
    public int getLevel() {
        return this.miningLevel;
    }
    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
