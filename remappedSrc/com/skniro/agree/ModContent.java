package com.skniro.agree;



import com.skniro.agree.Enchantment.DefEnchant;
import com.skniro.agree.item.Food;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.ProtectionEnchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.skniro.agree.Agree.*;
import static com.skniro.agree.Enchantment.DefEnchant.ALL_ARMOR;
import static com.skniro.agree.item.Food.HASTE_APPLE;
import static com.skniro.agree.item.Gemstone.*;
import static com.skniro.agree.block.Gemstone_Block.*;
import static com.skniro.agree.block.Gemstone_ore.*;



public class ModContent {


    public static void registerItem(){
        Registry.register(Registry.ITEM,new Identifier(MOD_ID,"haste_apple"),HASTE_APPLE);
        Registry.register(Registry.ITEM,new Identifier(MOD_ID,"speed_apple"),SPEED_APPLE);
        Registry.register(Registry.ITEM,new Identifier(MOD_ID,"strength_apple"),STRENGTH_APPLE);
        Registry.register(Registry.ITEM,new Identifier(MOD_ID,"health_boost_apple"),HEALTH_BOOST_APPLE);
        Registry.register(Registry.ITEM,new Identifier(MOD_ID,"fire_resistance_apple"),FIRE_RESISTANCE_APPLE);
        Registry.register(Registry.ITEM,new Identifier(MOD_ID,"village_hero_apple"),HERO_VILLAGE_APPLE);
        Registry.register(Registry.ITEM,new Identifier(MOD_ID,"night_vision_apple"),NIGHT_VISION_APPLE);
        Registry.register(Registry.ITEM,new Identifier(MOD_ID,"jump_boost_apple"),JUMP_BOOST_APPLE);
        Registry.register(Registry.ITEM,new Identifier(MOD_ID,"super_apple"),SUPER_APPLE);
        Registry.register(Registry.ITEM,new Identifier(MOD_ID,"ruby"),RUBY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ruby_ore"), new BlockItem(RUBY_ORE, new FabricItemSettings().group(Agree.Agree_Group)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "deepslate_ruby_ore"), new BlockItem(DEEPSLATE_RUBY_ORE, new FabricItemSettings().group(Agree.Agree_Group)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ruby_block"), new BlockItem(RUBY_BLOCK, new FabricItemSettings().group(Agree.Agree_Group)));

    }
    public static void registerBlock(){
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "ruby_ore"), RUBY_ORE);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "deepslate_ruby_ore"), DEEPSLATE_RUBY_ORE);

    }

    public static Enchantment Advanced_Protection = register("advanced_projection",
            new DefEnchant(Enchantment.Rarity.UNCOMMON, ProtectionEnchantment.Type.ALL, ALL_ARMOR));

    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registry.ENCHANTMENT, new Identifier(Agree.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
        System.out.println("Registering Enchantments for " + Agree.MOD_ID);
    }

    public static void CreativeTab() {
    }
}
