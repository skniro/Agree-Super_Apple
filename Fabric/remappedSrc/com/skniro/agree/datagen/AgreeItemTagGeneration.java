package com.skniro.agree.datagen;

import com.skniro.agree.item.AgreeItems;
import com.skniro.agree.tags.AgreeItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import java.util.concurrent.CompletableFuture;


public class AgreeItemTagGeneration extends FabricTagProvider<Item> {
    public AgreeItemTagGeneration(FabricDataOutput dataGenerator, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(dataGenerator, Registries.ITEM, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        tag(AgreeItemTags.REPAIRS_RUBY_ARMOR)
                .add(AgreeItems.RUBY);
        tag(AgreeItemTags.RUBY_TOOL_MATERIALS)
                .add(AgreeItems.RUBY);
    }

}
