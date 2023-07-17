package com.skniro.agree;

import com.skniro.agree.item.Food;
import com.skniro.agree.util.ModLootTableModifiers;
import com.skniro.agree.world.ModConfiguredFeatures;
import com.skniro.agree.world.ModOreGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.EnchantedGoldenAppleItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.skniro.agree.item.Food.HASTE_APPLE;


public class Agree implements ModInitializer {
    public static final String MOD_ID = "agree";
    public static final Logger LOGGER = LoggerFactory.getLogger("modid");


    public static final ItemGroup Agree_Group = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "test_group"),() -> new ItemStack(HASTE_APPLE));

    public static final Item HEALTH_BOOST_APPLE = new Item((new Item.Settings().rarity(Rarity.RARE).food(Food.HEALTH_BOOST_APPLE).group(Agree.Agree_Group)));
    public static final Item FIRE_RESISTANCE_APPLE = new Item((new Item.Settings().rarity(Rarity.RARE).food(Food.FIRE_RESISTANCE_APPLE).group(Agree.Agree_Group)));
    public static final Item HERO_VILLAGE_APPLE = new Item((new Item.Settings().rarity(Rarity.RARE).food(Food.HERO_VILLAGE_APPLE).group(Agree.Agree_Group)));
    public static final Item NIGHT_VISION_APPLE = new Item((new Item.Settings().rarity(Rarity.RARE).food(Food.NIGHT_VISION_APPLE).group(Agree.Agree_Group)));
    public static final Item JUMP_BOOST_APPLE = new Item((new Item.Settings().rarity(Rarity.RARE).food(Food.JUMP_BOOST_APPLE).group(Agree.Agree_Group)));
    public static final Item SPEED_APPLE = new Item((new Item.Settings().rarity(Rarity.RARE).food(Food.SPEED_APPLE).group(Agree.Agree_Group)));
    public static final Item STRENGTH_APPLE = new Item((new Item.Settings().rarity(Rarity.RARE).food(Food.STRENGTH_APPLE).group(Agree.Agree_Group)));
    public static final Item SUPER_APPLE = new EnchantedGoldenAppleItem((new Item.Settings().food(Food.SUPER_APPLE).rarity(Rarity.EPIC).group(Agree.Agree_Group)));

    @Override
    public void onInitialize() {
        ModContent.registerItem();
        ModContent.registerBlock();
        ModContent.CreativeTab();
                    ModConfiguredFeatures.registerConfiguredFeatures();
                    ModOreGeneration.generateOres();
        ModContent.registerModEnchantments();
        ModLootTableModifiers.modifyLootTables();
    }
}
