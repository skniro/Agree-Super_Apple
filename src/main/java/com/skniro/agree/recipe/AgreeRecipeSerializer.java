package com.skniro.agree.recipe;

import com.skniro.agree.Agree;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SpecialRecipeSerializer;

public class AgreeRecipeSerializer{
    public static final RecipeSerializer<SuspiciousAppleRecipe> SUSPICIOUS_APPLE = RecipeSerializer.register("crafting_special_suspiciousapple", new
            SpecialRecipeSerializer<SuspiciousAppleRecipe>(SuspiciousAppleRecipe::new));
    public static void agreerecipeseroalizer(){
        Agree.LOGGER.debug("special recipe" + Agree.MOD_ID);
    }
}
