package com.skniro.agree.datagen;

import com.skniro.agree.item.AgreeItems;
import com.skniro.agree.tags.AgreeItemTags;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import java.util.concurrent.CompletableFuture;


public class AgreeItemTagGeneration extends FabricTagProvider.ItemTagProvider {
    public AgreeItemTagGeneration(FabricDataOutput dataGenerator, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(dataGenerator, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        valueLookupBuilder(AgreeItemTags.REPAIRS_RUBY_ARMOR)
                .add(AgreeItems.RUBY);
        valueLookupBuilder(AgreeItemTags.RUBY_TOOL_MATERIALS)
                .add(AgreeItems.RUBY);
        valueLookupBuilder(ItemTags.HEAD_ARMOR)
                .add(AgreeItems.RUBY_HELMET);
        valueLookupBuilder(ItemTags.CHEST_ARMOR)
                .add(AgreeItems.RUBY_CHESTPLATE);
        valueLookupBuilder(ItemTags.LEG_ARMOR)
                .add(AgreeItems.RUBY_LEGGINGS);
        valueLookupBuilder(ItemTags.FOOT_ARMOR)
                .add(AgreeItems.RUBY_BOOTS);
        valueLookupBuilder(ItemTags.SWORDS)
                .add(AgreeItems.RUBY_SWORD);
        valueLookupBuilder(ItemTags.AXES)
                .add(AgreeItems.RUBY_AXE);
        valueLookupBuilder(ItemTags.PICKAXES)
                .add(AgreeItems.RUBY_PICKAXE);
        valueLookupBuilder(ItemTags.HOES)
                .add(AgreeItems.RUBY_HOE);
        valueLookupBuilder(ItemTags.SHOVELS)
                .add(AgreeItems.RUBY_SHOVEL);
    }

}
