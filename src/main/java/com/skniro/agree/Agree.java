package com.skniro.agree;

import com.skniro.agree.Enchantment.EnchantmentModule;
import com.skniro.agree.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.skniro.agree.item.Apples.AppleFoodComponents.HASTE_APPLE;


public class Agree implements ModInitializer {
    public static final String MOD_ID = "agree";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);


    public static final ItemGroup Agree_Group = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "test_group"),() -> new ItemStack(HASTE_APPLE));


    @Override
    public void onInitialize() {
        ModContent.registerItem();
        ModContent.registerBlock();
        ModContent.CreativeTab();
        EnchantmentModule.registerModEnchantments();
        ModLootTableModifiers.modifyLootTables();
        ModContent.AgreeWorldGen();
    }
}
