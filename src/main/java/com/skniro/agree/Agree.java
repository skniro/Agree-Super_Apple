package com.skniro.agree;

import com.skniro.agree.Enchantment.EnchantmentModule;
import com.skniro.agree.recipe.AgreeRecipeSerializer;
import com.skniro.agree.util.ModLootTableModifiers;
import com.skniro.agree.world.ModConfiguredFeatures;
import com.skniro.agree.world.ModOreGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.skniro.agree.item.Apples.AppleFoodComponents.HASTE_APPLE;


public class Agree implements ModInitializer {
    public static final String MOD_ID = "agree";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    public static final ItemGroup Agree_Group = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "test_group"),() -> new ItemStack(HASTE_APPLE));
    @Override
    public void onInitialize() {
        ModContent.registerItem();
        ModContent.registerBlock();
        ModContent.CreativeTab();
                    ModConfiguredFeatures.registerConfiguredFeatures();
                    ModOreGeneration.generateOres();
        EnchantmentModule.registerModEnchantments();
        ModLootTableModifiers.modifyLootTables();
        AgreeRecipeSerializer.agreerecipeseroalizer();
    }
}
