package com.skniro.agree.recipe;

import com.skniro.agree.Agree;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SimpleCraftingRecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class AgreeRecipeSerializer{
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZER = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Agree.MOD_ID);

    public static final RegistryObject<RecipeSerializer<SuspiciousAppleRecipe>> SUSPICIOUS_APPLE =
            RECIPE_SERIALIZER.register("crafting_special_suspiciousapple",
                    ()-> new SimpleCraftingRecipeSerializer<>(SuspiciousAppleRecipe::new));

    public static void agreerecipeseroalizer(IEventBus eventBus) {
        RECIPE_SERIALIZER.register(eventBus);
    }
}
