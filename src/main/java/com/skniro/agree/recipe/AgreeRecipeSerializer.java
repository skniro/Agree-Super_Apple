package com.skniro.agree.recipe;

import com.skniro.agree.Agree;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;


public class AgreeRecipeSerializer{
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZER = DeferredRegister.create(BuiltInRegistries.RECIPE_SERIALIZER, Agree.MOD_ID);

    public static final Supplier<RecipeSerializer<SuspiciousAppleRecipe>>
            SUSPICIOUS_APPLE = RECIPE_SERIALIZER.register("crafting_special_suspiciousapple",
            () -> new SimpleCraftingRecipeSerializer<>(SuspiciousAppleRecipe::new));

    public static void agreerecipeseroalizer(IEventBus eventBus) {
        RECIPE_SERIALIZER.register(eventBus);
    }
}
