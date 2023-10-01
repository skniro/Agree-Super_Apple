/*
 * Decompiled with CFR 0.2.0 (FabricMC d28b102d).
 */
package com.skniro.agree.recipe;

import com.skniro.agree.item.Apples.AppleFoodComponents;
import net.minecraft.core.RegistryAccess;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SuspiciousStewItem;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SuspiciousEffectHolder;

public class SuspiciousAppleRecipe
extends CustomRecipe {
    public SuspiciousAppleRecipe(CraftingBookCategory craftingRecipeCategory) {
        super(craftingRecipeCategory);
    }

    @Override
    public boolean matches(CraftingContainer recipeInputInventory, Level world) {
        boolean bl = false;
        boolean bl2 = false;
        for (int i = 0; i < recipeInputInventory.getContainerSize(); ++i) {
            ItemStack itemStack = recipeInputInventory.getItem(i);
            if (itemStack.isEmpty()) continue;
            if (itemStack.is(ItemTags.SMALL_FLOWERS) && !bl) {
                bl = true;
                continue;
            }
            if (itemStack.is(Items.APPLE) && !bl2) {
                bl2 = true;
                continue;
            }
            return false;
        }
        return bl && bl2;
    }

    @Override
    public ItemStack assemble(CraftingContainer recipeInputInventory,  RegistryAccess dynamicRegistryManager) {
        ItemStack itemStack = new ItemStack(AppleFoodComponents.SUSPICIOUS_APPLE.get(), 1);
        for (int i = 0; i < recipeInputInventory.getContainerSize(); ++i) {
            SuspiciousEffectHolder suspiciousAppleIngredient;
            ItemStack itemStack2 = recipeInputInventory.getItem(i);
            if (itemStack2.isEmpty() || (suspiciousAppleIngredient = SuspiciousEffectHolder.tryGet(itemStack2.getItem())) == null) continue;
            SuspiciousStewItem.saveMobEffects(itemStack, suspiciousAppleIngredient.getSuspiciousEffects());
            break;
        }
        return itemStack;
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return width >= 2 && height >= 2;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return AgreeRecipeSerializer.SUSPICIOUS_APPLE.get();
    }
}

