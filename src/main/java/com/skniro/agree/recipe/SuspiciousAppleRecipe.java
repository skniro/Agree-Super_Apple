/*
 * Decompiled with CFR 0.2.0 (FabricMC d28b102d).
 */
package com.skniro.agree.recipe;

import com.skniro.agree.item.Apples.AppleFoodComponents;
import net.minecraft.block.Blocks;
import net.minecraft.block.SuspiciousStewIngredient;
import net.minecraft.inventory.RecipeInputInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SuspiciousStewItem;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SpecialCraftingRecipe;
import net.minecraft.recipe.book.CraftingRecipeCategory;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class SuspiciousAppleRecipe
extends SpecialCraftingRecipe {
    public SuspiciousAppleRecipe(Identifier identifier, CraftingRecipeCategory craftingRecipeCategory) {
        super(identifier, craftingRecipeCategory);
    }

    @Override
    public boolean matches(RecipeInputInventory recipeInputInventory, World world) {
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
    public ItemStack craft(RecipeInputInventory recipeInputInventory, DynamicRegistryManager dynamicRegistryManager) {
        ItemStack itemStack = new ItemStack(AppleFoodComponents.SUSPICIOUS_APPLE, 1);
        for (int i = 0; i < recipeInputInventory.size(); ++i) {
            SuspiciousStewIngredient suspiciousAppleIngredient;
            ItemStack itemStack2 = recipeInputInventory.getStack(i);
            if (itemStack2.isEmpty() || (suspiciousAppleIngredient = SuspiciousStewIngredient.of(itemStack2.getItem())) == null) continue;
            SuspiciousStewItem.addEffectToStew(itemStack, suspiciousAppleIngredient.method_53233());
            break;
        }
        return itemStack;
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

