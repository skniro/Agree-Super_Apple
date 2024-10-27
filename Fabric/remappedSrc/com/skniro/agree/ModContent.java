package com.skniro.agree;


import com.skniro.agree.block.AgreeBlocks;
import com.skniro.agree.item.AgreeItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.core.component.DataComponents;
import net.minecraft.item.*;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackLinkedSet;
import net.minecraft.world.level.block.SuspiciousEffectHolder;
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
            content.accept(HASTE_APPLE);
            content.accept(STRENGTH_APPLE);
            content.accept(SPEED_APPLE);
            content.accept(HEALTH_BOOST_APPLE);
            content.accept(HERO_VILLAGE_APPLE);
            content.accept(FIRE_RESISTANCE_APPLE);
            content.accept(NIGHT_VISION_APPLE);
            content.accept(JUMP_BOOST_APPLE);
            content.accept(SUPER_APPLE);
            content.accept(RUBY);
            content.accept(RUBY_ORE);
            content.accept(DEEPSLATE_RUBY_ORE);
            content.accept(RUBY_BLOCK);
            content.accept(SUSPICIOUS_APPLE);
            content.accept(HASTE_APPLE_SAPLING);
            content.accept(SPEED_APPLE_SAPLING);
            content.accept(HEALTH_BOOST_SAPLING);
            content.accept(FIRE_RESISTANCE_SAPLING);
            content.accept(HERO_VILLAGE_SAPLING);
            content.accept(STRENGTH_SAPLING);
            content.accept(NIGHT_VISION_SAPLING);
            content.accept(JUMP_BOOST_SAPLING);
            content.accept(HASTE_APPLE_LEAVES);
            content.accept(SPEED_APPLE_LEAVES);
            content.accept(HEALTH_BOOST_LEAVES);
            content.accept(FIRE_RESISTANCE_LEAVES);
            content.accept(HERO_VILLAGE_LEAVES);
            content.accept(STRENGTH_LEAVES);
            content.accept(NIGHT_VISION_LEAVES);
            content.accept(JUMP_BOOST_LEAVES);
            content.accept(Apple_Tree_LEAVES);
            content.accept(RUBY_BLOCK);
            content.accept(RUBY_HELMET);
            content.accept(RUBY_CHESTPLATE);
            content.accept(RUBY_LEGGINGS);
            content.accept(RUBY_BOOTS);
            content.accept(RUBY_SWORD);
            content.accept(RUBY_AXE);
            content.accept(RUBY_PICKAXE);
            content.accept(RUBY_SHOVEL);
            content.accept(RUBY_HOE);
            addSuspiciousApples(content, CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        });
    }

    private static void addSuspiciousApples(CreativeModeTab.Output entries, CreativeModeTab.TabVisibility visibility) {
        List<SuspiciousEffectHolder> list = SuspiciousEffectHolder.getAllEffectHolders();
        Set<ItemStack> set = ItemStackLinkedSet.createTypeAndComponentsSet();
        Iterator var4 = list.iterator();

        while(var4.hasNext()) {
            SuspiciousEffectHolder suspiciousStewIngredient = (SuspiciousEffectHolder)var4.next();
            ItemStack itemStack = new ItemStack(SUSPICIOUS_APPLE);
            itemStack.set(DataComponents.SUSPICIOUS_STEW_EFFECTS, suspiciousStewIngredient.getSuspiciousEffects());
            set.add(itemStack);
        }

        entries.acceptAll(set, visibility);
    }
}
