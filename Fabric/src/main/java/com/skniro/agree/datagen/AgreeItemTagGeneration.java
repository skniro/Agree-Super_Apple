package com.skniro.agree.datagen;

import com.skniro.agree.item.Gemstone;
import com.skniro.agree.tags.AgreeItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;


public class AgreeItemTagGeneration extends FabricTagProvider<Item> {
    public AgreeItemTagGeneration(FabricDataOutput dataGenerator, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(dataGenerator, RegistryKeys.ITEM, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(AgreeItemTags.REPAIRS_RUBY_ARMOR)
                .add(Gemstone.RUBY);
        getOrCreateTagBuilder(AgreeItemTags.RUBY_TOOL_MATERIALS)
                .add(Gemstone.RUBY);
    }

}
