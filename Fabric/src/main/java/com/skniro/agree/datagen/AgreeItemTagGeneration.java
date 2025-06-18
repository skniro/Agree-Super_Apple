package com.skniro.agree.datagen;

import com.skniro.agree.item.AgreeItems;
import com.skniro.agree.tags.AgreeItemTags;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;


public class AgreeItemTagGeneration extends FabricTagProvider<Item> {
    public AgreeItemTagGeneration(FabricDataOutput dataGenerator, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(dataGenerator, RegistryKeys.ITEM, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
      /*  getOrCreateTagBuilder(AgreeItemTags.REPAIRS_RUBY_ARMOR)
                .add(AgreeItems.RUBY);
        getOrCreateTagBuilder(AgreeItemTags.RUBY_TOOL_MATERIALS)
                .add(AgreeItems.RUBY);
        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(AgreeItems.RUBY_HELMET);
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(AgreeItems.RUBY_CHESTPLATE);
        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(AgreeItems.RUBY_LEGGINGS);
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(AgreeItems.RUBY_BOOTS);
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(AgreeItems.RUBY_SWORD);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(AgreeItems.RUBY_AXE);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(AgreeItems.RUBY_PICKAXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(AgreeItems.RUBY_HOE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(AgreeItems.RUBY_SHOVEL);
*/
    }

}
