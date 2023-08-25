package com.skniro.agree;

import com.skniro.agree.Enchantment.EnchantmentModule;
import com.skniro.agree.conifg.AgreeConfig;
import com.skniro.agree.conifg.Configuration;
import com.skniro.agree.recipe.AgreeRecipeSerializer;
import com.skniro.agree.util.ModLootTableModifiers;
import com.skniro.agree.world.OreBiomeModifications;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.skniro.agree.item.Apples.AppleFoodComponents.HASTE_APPLE;


public class Agree implements ModInitializer {
    public static final String MOD_ID = "agree";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    public static final ItemGroup Agree_Group = FabricItemGroup.builder(new Identifier(MOD_ID, "test_group"))
            .icon(() -> new ItemStack(HASTE_APPLE))
            .build();

    @Override
    public void onInitialize() {
        new Configuration(AgreeConfig.class, MOD_ID);
        ModContent.registerItem();
        ModContent.registerBlock();
        ModContent.CreativeTab();
                    OreBiomeModifications.addOres();
        if (AgreeConfig.Enchantment_Module) {
            EnchantmentModule.registerModEnchantments();
        }
        ModLootTableModifiers.modifyLootTables();
        AgreeRecipeSerializer.agreerecipeseroalizer();
    }
}
