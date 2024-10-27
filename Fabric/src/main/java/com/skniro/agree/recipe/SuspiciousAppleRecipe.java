/*
 * Decompiled with CFR 0.2.0 (FabricMC d28b102d).
 */
package com.skniro.agree.recipe;

import com.skniro.agree.item.Apples.AppleFoodComponents;
import net.minecraft.block.SuspiciousStewIngredient;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SpecialCraftingRecipe;
import net.minecraft.recipe.book.CraftingRecipeCategory;
import net.minecraft.recipe.input.CraftingRecipeInput;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.world.World;

public class SuspiciousAppleRecipe
extends SpecialCraftingRecipe {
    public SuspiciousAppleRecipe(CraftingRecipeCategory craftingRecipeCategory) {
        super(craftingRecipeCategory);
    }

    @Override
    public boolean matches(CraftingRecipeInput craftingRecipeInput, World world) {
        boolean bl = false;
        boolean bl2 = false;
        for (int i = 0; i < craftingRecipeInput.size(); ++i) {
            ItemStack itemStack = craftingRecipeInput.getStackInSlot(i);
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
    public ItemStack craft(CraftingRecipeInput craftingRecipeInput, RegistryWrapper.WrapperLookup wrapperLookup) {
        ItemStack itemStack = new ItemStack(AppleFoodComponents.SUSPICIOUS_APPLE, 1);
        for(int i = 0; i < craftingRecipeInput.size(); ++i) {
            ItemStack itemStack2 = craftingRecipeInput.getStackInSlot(i);
            if (!itemStack2.isEmpty()) {
                SuspiciousStewIngredient suspiciousStewIngredient = SuspiciousStewIngredient.of(itemStack2.getItem());
                if (suspiciousStewIngredient != null) {
                    itemStack.set(DataComponentTypes.SUSPICIOUS_STEW_EFFECTS, suspiciousStewIngredient.getStewEffects());
                    break;
                }
            }
        }
        return itemStack;
    }


    @Override
    public RecipeSerializer<? extends SpecialCraftingRecipe> getSerializer() {
        return AgreeRecipeSerializer.SUSPICIOUS_APPLE;
    }
}

