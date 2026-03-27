/*
 * Decompiled with CFR 0.2.0 (FabricMC d28b102d).
 */
package com.skniro.agree.recipe;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.skniro.agree.item.Apples.AppleFoodComponents;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SuspiciousEffectHolder;

public class SuspiciousAppleRecipe
extends CustomRecipe {
    private final CraftingBookCategory category;
    public SuspiciousAppleRecipe(CraftingBookCategory craftingRecipeCategory) {
        this.category = craftingRecipeCategory;
    }

    @Override
    public CraftingBookCategory category() {
        return this.category;
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
    public ItemStack assemble(CraftingInput recipeInputInventory) {
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

    private static final MapCodec<SuspiciousAppleRecipe> CODEC = RecordCodecBuilder.mapCodec(instance ->
            instance.group(
                    CraftingBookCategory.CODEC
                            .fieldOf("category")
                            .orElse(CraftingBookCategory.MISC)
                            .forGetter(CraftingRecipe::category)
            ).apply(instance, SuspiciousAppleRecipe::new)
    );

    private static final StreamCodec<RegistryFriendlyByteBuf, SuspiciousAppleRecipe> STREAM_CODEC =
            StreamCodec.composite(
                    CraftingBookCategory.STREAM_CODEC,
                    CraftingRecipe::category,
                    SuspiciousAppleRecipe::new
            );


    public static final RecipeSerializer<SuspiciousAppleRecipe> SERIALIZER =
            new RecipeSerializer<>(CODEC, STREAM_CODEC);


    public MapCodec<SuspiciousAppleRecipe> codec() {
        return CODEC;
    }

    public StreamCodec<RegistryFriendlyByteBuf, SuspiciousAppleRecipe> streamCodec() {
        return STREAM_CODEC;
    }

}

