package com.skniro.agree.datagen;

import com.skniro.agree.block.AgreeBlocks;
import com.skniro.agree.item.AgreeItems;
import com.skniro.agree.tags.AgreeItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;


public class AgreeBlockTagGeneration extends FabricTagsProvider.BlockTagsProvider {
    public AgreeBlockTagGeneration(FabricPackOutput dataGenerator, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(dataGenerator, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        valueLookupBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(AgreeBlocks.RUBY_BLOCK);
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(AgreeBlocks.RUBY_BLOCK)
                .add(AgreeBlocks.DEEPSLATE_RUBY_ORE)
                .add(AgreeBlocks.RUBY_ORE);
        valueLookupBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(AgreeBlocks.RUBY_BLOCK)
                .add(AgreeBlocks.DEEPSLATE_RUBY_ORE)
                .add(AgreeBlocks.RUBY_ORE);

    }

}
