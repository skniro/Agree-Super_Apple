/*
 * Decompiled with CFR 0.2.0 (FabricMC d28b102d).
 */
package com.skniro.agree.recipe;

import com.skniro.agree.item.Apples.AppleFoodComponents;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.DataComponents;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.CraftingInput;
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
    public boolean matches(CraftingInput recipeInputInventory, Level world) {
        boolean bl = false;
        boolean bl2 = false;
        for (int i = 0; i < recipeInputInventory.size(); ++i) {
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
    public ItemStack assemble(CraftingInput recipeInputInventory,  HolderLookup.Provider dynamicRegistryManager) {
        ItemStack itemStack = new ItemStack(AppleFoodComponents.SUSPICIOUS_APPLE.get(), 1);
        for (int i = 0; i < recipeInputInventory.size(); ++i) {
            ItemStack itemstack1 = recipeInputInventory.getItem(i);
            if (!itemstack1.isEmpty()) {
                SuspiciousEffectHolder suspiciouseffectholder = SuspiciousEffectHolder.tryGet(itemstack1.getItem());
                if (suspiciouseffectholder != null) {
                    itemStack.set(DataComponents.SUSPICIOUS_STEW_EFFECTS, suspiciouseffectholder.getSuspiciousEffects());
                    break;
                }
            }
        }
        return itemStack;
    }

    @Override
    public RecipeSerializer<? extends CustomRecipe> getSerializer() {
        return AgreeRecipeSerializer.SUSPICIOUS_APPLE.get();
    }
}

