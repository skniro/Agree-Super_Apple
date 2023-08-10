package com.skniro.agree;


import com.skniro.agree.block.init.LeafCropBlock;
import com.skniro.agree.item.AgreeItems;
import com.skniro.agree.item.Apples.AppleFoodComponents;
import com.skniro.agree.item.init.SuspiciousAppleItem;
import com.skniro.agree.world.Tree.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.Set;

import static com.skniro.agree.Agree.Agree_Group;
import static com.skniro.agree.Agree.MOD_ID;
import static com.skniro.agree.block.AgreeBlocks.*;
import static com.skniro.agree.block.Gemstone_ore.DEEPSLATE_RUBY_ORE;
import static com.skniro.agree.block.Gemstone_ore.RUBY_ORE;
import static com.skniro.agree.item.AgreeItems.*;
import static com.skniro.agree.item.Apples.AppleFoodComponents.*;
import static com.skniro.agree.item.Gemstone.RUBY;


public class ModContent {


    public static void registerItem(){
        Registry.register(Registries.ITEM,new Identifier(MOD_ID,"haste_apple"),HASTE_APPLE);
        Registry.register(Registries.ITEM,new Identifier(MOD_ID,"speed_apple"),SPEED_APPLE);
        Registry.register(Registries.ITEM,new Identifier(MOD_ID,"strength_apple"),STRENGTH_APPLE);
        Registry.register(Registries.ITEM,new Identifier(MOD_ID,"health_boost_apple"),HEALTH_BOOST_APPLE);
        Registry.register(Registries.ITEM,new Identifier(MOD_ID,"fire_resistance_apple"),FIRE_RESISTANCE_APPLE);
        Registry.register(Registries.ITEM,new Identifier(MOD_ID,"village_hero_apple"),HERO_VILLAGE_APPLE);
        Registry.register(Registries.ITEM,new Identifier(MOD_ID,"night_vision_apple"),NIGHT_VISION_APPLE);
        Registry.register(Registries.ITEM,new Identifier(MOD_ID,"jump_boost_apple"),JUMP_BOOST_APPLE);
        Registry.register(Registries.ITEM,new Identifier(MOD_ID,"super_apple"),SUPER_APPLE);
        Registry.register(Registries.ITEM,new Identifier(MOD_ID,"ruby"),RUBY);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ruby_ore"), new BlockItem(RUBY_ORE, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "deepslate_ruby_ore"), new BlockItem(DEEPSLATE_RUBY_ORE, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ruby_block"), new BlockItem(RUBY_BLOCK, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier(MOD_ID,"suspicious_apple"),SUSPICIOUS_APPLE);
        AgreeItems.registerModItems();
    }
    public static void registerBlock(){

        Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "ruby_ore"), RUBY_ORE);
        Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "deepslate_ruby_ore"), DEEPSLATE_RUBY_ORE);

    }

    public static void CreativeTab() {
        ItemGroupEvents.modifyEntriesEvent(Agree_Group).register(content -> {
            content.add(HASTE_APPLE);
            content.add(STRENGTH_APPLE);
            content.add(SPEED_APPLE);
            content.add(HEALTH_BOOST_APPLE);
            content.add(HERO_VILLAGE_APPLE);
            content.add(FIRE_RESISTANCE_APPLE);
            content.add(NIGHT_VISION_APPLE);
            content.add(JUMP_BOOST_APPLE);
            content.add(SUPER_APPLE);
            content.add(RUBY);
            content.add(RUBY_ORE);
            content.add(DEEPSLATE_RUBY_ORE);
            content.add(RUBY_BLOCK);
            content.add(SUSPICIOUS_APPLE);
            content.add(HASTE_APPLE_SAPLING);
            content.add(SPEED_APPLE_SAPLING);
            content.add(HEALTH_BOOST_SAPLING);
            content.add(FIRE_RESISTANCE_SAPLING);
            content.add(HERO_VILLAGE_SAPLING);
            content.add(STRENGTH_SAPLING);
            content.add(NIGHT_VISION_SAPLING);
            content.add(JUMP_BOOST_SAPLING);
            content.add(HASTE_APPLE_LEAVES);
            content.add(SPEED_APPLE_LEAVES);
            content.add(HEALTH_BOOST_LEAVES);
            content.add(FIRE_RESISTANCE_LEAVES);
            content.add(HERO_VILLAGE_LEAVES);
            content.add(STRENGTH_LEAVES);
            content.add(NIGHT_VISION_LEAVES);
            content.add(JUMP_BOOST_LEAVES);
            content.add(Apple_Tree_LEAVES);
            content.add(RUBY_BLOCK);
            content.add(RUBY_HELMET);
            content.add(RUBY_CHESTPLATE);
            content.add(RUBY_LEGGINGS);
            content.add(RUBY_BOOTS);
            content.add(RUBY_SWORD);
            content.add(RUBY_AXE);
            content.add(RUBY_PICKAXE);
            content.add(RUBY_SHOVEL);
            content.add(RUBY_HOE);
            addSuspiciousApples(content, ItemGroup.StackVisibility.PARENT_AND_SEARCH_TABS);
        });
    }

    private static void addSuspiciousApples(ItemGroup.Entries entries, ItemGroup.StackVisibility visibility) {
        List<SuspiciousStewIngredient> list = SuspiciousStewIngredient.getAll();
        Set<ItemStack> set = ItemStackSet.create();
        for (SuspiciousStewIngredient suspiciousStewIngredient : list) {
            ItemStack itemStack = new ItemStack(SUSPICIOUS_APPLE);
            SuspiciousAppleItem.addEffectToStew(itemStack, suspiciousStewIngredient.method_53233());
            set.add(itemStack);
        }
        entries.addAll(set, visibility);
    }
}
