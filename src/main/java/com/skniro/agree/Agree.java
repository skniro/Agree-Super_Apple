package com.skniro.agree;

import com.skniro.agree.Enchantment.DefEnchant;
import com.skniro.agree.item.Food;
import com.skniro.agree.util.ModLootTableModifiers;
import com.skniro.agree.world.OreBiomeModifications;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.ProtectionEnchantment;
import net.minecraft.item.EnchantedGoldenAppleItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.skniro.agree.Enchantment.DefEnchant.ALL_ARMOR;


public class Agree implements ModInitializer {
    public static final String MOD_ID = "agree";
    public static final Logger LOGGER = LoggerFactory.getLogger("modid");
    public static final Item HASTE_APPLE = new Item((new Item.Settings().rarity(Rarity.RARE).food(Food.HASTE_APPLE)));
    public static final Item HEALTH_BOOST_APPLE = new Item((new Item.Settings().rarity(Rarity.RARE).food(Food.HEALTH_BOOST_APPLE)));
    public static final Item FIRE_RESISTANCE_APPLE = new Item((new Item.Settings().rarity(Rarity.RARE).food(Food.FIRE_RESISTANCE_APPLE)));
    public static final Item HERO_VILLAGE_APPLE = new Item((new Item.Settings().rarity(Rarity.RARE).food(Food.HERO_VILLAGE_APPLE)));
    public static final Item NIGHT_VISION_APPLE = new Item((new Item.Settings().rarity(Rarity.RARE).food(Food.NIGHT_VISION_APPLE)));
    public static final Item JUMP_BOOST_APPLE = new Item((new Item.Settings().rarity(Rarity.RARE).food(Food.JUMP_BOOST_APPLE)));
    public static final Item SPEED_APPLE = new Item((new Item.Settings().rarity(Rarity.RARE).food(Food.SPEED_APPLE)));
    public static final Item STRENGTH_APPLE = new Item((new Item.Settings().rarity(Rarity.RARE).food(Food.STRENGTH_APPLE)));
    public static final Item SUPER_APPLE = new EnchantedGoldenAppleItem((new Item.Settings().food(Food.SUPER_APPLE).rarity(Rarity.EPIC)));

    public static final ItemGroup Agree_Group = FabricItemGroup.builder(new Identifier(MOD_ID, "test_group"))
            .icon(() -> new ItemStack(HASTE_APPLE))
            .build();

    @Override
    public void onInitialize() {
        ModContent.registerItem();
        ModContent.registerBlock();
        ModContent.CreativeTab();
                    OreBiomeModifications.addOres();
        ModContent.registerModEnchantments();
        ModLootTableModifiers.modifyLootTables();
    }
}
