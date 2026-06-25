package com.skniro.agree.datagen;

import com.skniro.agree.item.AgreeItems;
import com.skniro.agree.tags.AgreeItemTags;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import java.util.concurrent.CompletableFuture;


public class AgreeItemTagGeneration extends FabricTagsProvider.ItemTagsProvider {
    public AgreeItemTagGeneration(FabricPackOutput dataGenerator, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(dataGenerator, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        builder(AgreeItemTags.REPAIRS_RUBY_ARMOR)
                .add(AgreeItems.RUBY.builtInRegistryHolder().key());
        builder(AgreeItemTags.RUBY_TOOL_MATERIALS)
                .add(AgreeItems.RUBY.builtInRegistryHolder().key());
        builder(ItemTags.HEAD_ARMOR)
                .add(AgreeItems.RUBY_HELMET.builtInRegistryHolder().key());
        builder(ItemTags.CHEST_ARMOR)
                .add(AgreeItems.RUBY_CHESTPLATE.builtInRegistryHolder().key());
        builder(ItemTags.LEG_ARMOR)
                .add(AgreeItems.RUBY_LEGGINGS.builtInRegistryHolder().key());
        builder(ItemTags.FOOT_ARMOR)
                .add(AgreeItems.RUBY_BOOTS.builtInRegistryHolder().key());
        builder(ItemTags.SWORDS)
                .add(AgreeItems.RUBY_SWORD.builtInRegistryHolder().key());
        builder(ItemTags.AXES)
                .add(AgreeItems.RUBY_AXE.builtInRegistryHolder().key());
        builder(ItemTags.PICKAXES)
                .add(AgreeItems.RUBY_PICKAXE.builtInRegistryHolder().key());
        builder(ItemTags.HOES)
                .add(AgreeItems.RUBY_HOE.builtInRegistryHolder().key());
        builder(ItemTags.SHOVELS)
                .add(AgreeItems.RUBY_SHOVEL.builtInRegistryHolder().key());
        builder(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(AgreeItems.RUBY.builtInRegistryHolder().key());
        builder(ItemTags.TRIMMABLE_ARMOR)
                .add(AgreeItems.RUBY_BOOTS.builtInRegistryHolder().key())
                .add(AgreeItems.RUBY_HELMET.builtInRegistryHolder().key())
                .add(AgreeItems.RUBY_LEGGINGS.builtInRegistryHolder().key())
                .add(AgreeItems.RUBY_CHESTPLATE.builtInRegistryHolder().key());
    }

}
