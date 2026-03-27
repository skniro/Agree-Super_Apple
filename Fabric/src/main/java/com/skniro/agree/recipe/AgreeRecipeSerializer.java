package com.skniro.agree.recipe;

import com.skniro.agree.Agree;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;

public class AgreeRecipeSerializer{
    public static final RecipeSerializer<SuspiciousAppleRecipe> SUSPICIOUS_APPLE = Registry.register(
            BuiltInRegistries.RECIPE_SERIALIZER, Identifier.fromNamespaceAndPath(Agree.MOD_ID ,"crafting_special_suspiciousapple"),
            SuspiciousAppleRecipe.SERIALIZER);
    public static void agreerecipeseroalizer(){
        Agree.LOGGER.debug("special recipe" + Agree.MOD_ID);
    }
}
