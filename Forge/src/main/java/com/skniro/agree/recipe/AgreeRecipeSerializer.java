package com.skniro.agree.recipe;

import com.skniro.agree.Agree;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class AgreeRecipeSerializer{
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZER = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Agree.MOD_ID);

    public static final RegistryObject<RecipeSerializer<SuspiciousAppleRecipe>> SUSPICIOUS_APPLE =
            RECIPE_SERIALIZER.register("crafting_special_suspiciousapple",
                    ()-> new CustomRecipe.Serializer<>(SuspiciousAppleRecipe::new));

    public static void agreerecipeseroalizer(BusGroup eventBus) {
        RECIPE_SERIALIZER.register(eventBus);
    }
}
