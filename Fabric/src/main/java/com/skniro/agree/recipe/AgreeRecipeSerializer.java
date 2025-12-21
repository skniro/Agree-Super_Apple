package com.skniro.agree.recipe;

import com.skniro.agree.Agree;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;

public class AgreeRecipeSerializer{
    public static final RecipeSerializer<SuspiciousAppleRecipe> SUSPICIOUS_APPLE = RecipeSerializer.register("crafting_special_suspiciousapple", new
            CustomRecipe.Serializer<SuspiciousAppleRecipe>(SuspiciousAppleRecipe::new));
    public static void agreerecipeseroalizer(){
        Agree.LOGGER.debug("special recipe" + Agree.MOD_ID);
    }
}
