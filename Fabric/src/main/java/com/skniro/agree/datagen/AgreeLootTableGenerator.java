package com.skniro.agree.datagen;

import com.skniro.agree.block.AgreeBlocks;
import com.skniro.agree.item.AgreeItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Blocks;
import java.util.concurrent.CompletableFuture;


public class AgreeLootTableGenerator extends FabricBlockLootSubProvider {
    public AgreeLootTableGenerator(FabricPackOutput dataGenerator, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataGenerator, registryLookup);
    }

    @Override
    public void generate() {
            add(AgreeBlocks.HASTE_APPLE_SAPLING,createSingleItemTable(AgreeBlocks.HASTE_APPLE_SAPLING));
            add(AgreeBlocks.SPEED_APPLE_SAPLING,createSingleItemTable(AgreeBlocks.SPEED_APPLE_SAPLING));
            add(AgreeBlocks.HEALTH_BOOST_SAPLING,createSingleItemTable(AgreeBlocks.HEALTH_BOOST_SAPLING));
            add(AgreeBlocks.FIRE_RESISTANCE_SAPLING,createSingleItemTable(AgreeBlocks.FIRE_RESISTANCE_SAPLING));
            add(AgreeBlocks.HERO_VILLAGE_SAPLING,createSingleItemTable(AgreeBlocks.HERO_VILLAGE_SAPLING));
            add(AgreeBlocks.STRENGTH_SAPLING,createSingleItemTable(AgreeBlocks.STRENGTH_SAPLING));
            add(AgreeBlocks.NIGHT_VISION_SAPLING,createSingleItemTable(AgreeBlocks.NIGHT_VISION_SAPLING));
            add(AgreeBlocks.JUMP_BOOST_SAPLING,createSingleItemTable(AgreeBlocks.JUMP_BOOST_SAPLING));

            add(AgreeBlocks.HASTE_APPLE_LEAVES,createLeavesDrops(AgreeBlocks.HASTE_APPLE_LEAVES,AgreeBlocks.HASTE_APPLE_SAPLING,NORMAL_LEAVES_SAPLING_CHANCES));
            add(AgreeBlocks.SPEED_APPLE_LEAVES,createLeavesDrops(AgreeBlocks.SPEED_APPLE_LEAVES,AgreeBlocks.SPEED_APPLE_SAPLING,NORMAL_LEAVES_SAPLING_CHANCES));
            add(AgreeBlocks.HEALTH_BOOST_LEAVES,createLeavesDrops(AgreeBlocks.HEALTH_BOOST_LEAVES,AgreeBlocks.HEALTH_BOOST_SAPLING,NORMAL_LEAVES_SAPLING_CHANCES));
            add(AgreeBlocks.FIRE_RESISTANCE_LEAVES,createLeavesDrops(AgreeBlocks.FIRE_RESISTANCE_LEAVES,AgreeBlocks.FIRE_RESISTANCE_SAPLING,NORMAL_LEAVES_SAPLING_CHANCES));
            add(AgreeBlocks.HERO_VILLAGE_LEAVES,createLeavesDrops(AgreeBlocks.HERO_VILLAGE_LEAVES,AgreeBlocks.HERO_VILLAGE_SAPLING,NORMAL_LEAVES_SAPLING_CHANCES));
            add(AgreeBlocks.STRENGTH_LEAVES,createLeavesDrops(AgreeBlocks.STRENGTH_LEAVES,AgreeBlocks.STRENGTH_SAPLING,NORMAL_LEAVES_SAPLING_CHANCES));
            add(AgreeBlocks.NIGHT_VISION_LEAVES,createLeavesDrops(AgreeBlocks.NIGHT_VISION_LEAVES,AgreeBlocks.NIGHT_VISION_SAPLING,NORMAL_LEAVES_SAPLING_CHANCES));
            add(AgreeBlocks.JUMP_BOOST_LEAVES ,createLeavesDrops(AgreeBlocks.JUMP_BOOST_LEAVES,AgreeBlocks.JUMP_BOOST_SAPLING,NORMAL_LEAVES_SAPLING_CHANCES));
            add(AgreeBlocks.Apple_Tree_LEAVES ,createLeavesDrops(AgreeBlocks.Apple_Tree_LEAVES, Blocks.OAK_SAPLING,NORMAL_LEAVES_SAPLING_CHANCES));
            add(AgreeBlocks.DEEPSLATE_RUBY_ORE, createOreDrop(AgreeBlocks.DEEPSLATE_RUBY_ORE, AgreeItems.RUBY));
            add(AgreeBlocks.RUBY_ORE, createOreDrop(AgreeBlocks.RUBY_ORE, AgreeItems.RUBY));

            dropSelf(AgreeBlocks.RUBY_BLOCK);
    }

    public static final float[] NORMAL_LEAVES_SAPLING_CHANCES = new float[]{0.028F, 0.0225F, 0.022333336F, 0.1F};
}
