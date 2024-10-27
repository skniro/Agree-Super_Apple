package com.skniro.agree;


import com.skniro.agree.block.AgreeBlocks;
import com.skniro.agree.item.AgreeItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.*;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static com.skniro.agree.Agree.Agree_Group;
import static com.skniro.agree.block.AgreeBlocks.*;
import static com.skniro.agree.item.AgreeItems.*;
import static com.skniro.agree.item.Apples.AppleFoodComponents.*;


public class ModContent {


    public static void registerItem(){
        AgreeItems.registerModItems();
    }
    public static void registerBlock(){
        AgreeBlocks.registerAgreeBlocks();
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
        Iterator var4 = list.iterator();

        while(var4.hasNext()) {
            SuspiciousStewIngredient suspiciousStewIngredient = (SuspiciousStewIngredient)var4.next();
            ItemStack itemStack = new ItemStack(SUSPICIOUS_APPLE);
            itemStack.set(DataComponentTypes.SUSPICIOUS_STEW_EFFECTS, suspiciousStewIngredient.getStewEffects());
            set.add(itemStack);
        }

        entries.addAll(set, visibility);
    }
}
