/*
 * Decompiled with CFR 0.2.0 (FabricMC d28b102d).
 */
package com.skniro.agree.recipe;

import com.skniro.agree.item.Apples.AppleFoodComponents;
import net.minecraft.block.FlowerBlock;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SuspiciousStewItem;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SpecialCraftingRecipe;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class SuspiciousAppleRecipe
extends SpecialCraftingRecipe {
    public SuspiciousAppleRecipe(Identifier identifier) {
        super(identifier);
    }

    @Override
    public boolean matches(CraftingInventory recipeInputInventory, World world) {
        boolean bl = false;
        boolean bl2 = false;
        for (int i = 0; i < recipeInputInventory.size(); ++i) {
            ItemStack itemStack = recipeInputInventory.getStack(i);
            if (itemStack.isEmpty()) continue;
            if (itemStack.isIn(ItemTags.SMALL_FLOWERS) && !bl) {
                bl = true;
                continue;
            }
            if (itemStack.isOf(Items.APPLE) && !bl2) {
                bl2 = true;
                continue;
            }
            return false;
        }
        return bl && bl2;
    }

    @Override
    public ItemStack craft(CraftingInventory craftingInventory) {
        ItemStack itemStack = ItemStack.EMPTY;
        for (int i = 0; i < craftingInventory.size(); ++i) {
            ItemStack itemStack2 = craftingInventory.getStack(i);
            if (itemStack2.isEmpty() || !itemStack2.isIn(ItemTags.SMALL_FLOWERS)) continue;
            itemStack = itemStack2;
            break;
        }
        ItemStack itemStack3 = new ItemStack(AppleFoodComponents.SUSPICIOUS_APPLE, 1);
        if (itemStack.getItem() instanceof BlockItem && ((BlockItem)itemStack.getItem()).getBlock() instanceof FlowerBlock) {
            FlowerBlock flowerBlock = (FlowerBlock)((BlockItem)itemStack.getItem()).getBlock();
            StatusEffect statusEffect = flowerBlock.getEffectInStew();
            SuspiciousStewItem.addEffectToStew(itemStack3, statusEffect, flowerBlock.getEffectInStewDuration());
        }
        return itemStack3;
    }

    @Override
    public boolean fits(int width, int height) {
        return width >= 2 && height >= 2;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return AgreeRecipeSerializer.SUSPICIOUS_APPLE;
    }
}

