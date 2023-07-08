package com.skniro.agree.datagen;

import com.skniro.agree.block.AgreeBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.loot.LootTable;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;


public class AgreeLootTableGenerator extends FabricBlockLootTableProvider {
    public AgreeLootTableGenerator(FabricDataOutput dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generate() {
            addDrop(AgreeBlocks.HASTE_APPLE_SAPLING,drops(AgreeBlocks.HASTE_APPLE_SAPLING));
            addDrop(AgreeBlocks.SPEED_APPLE_SAPLING,drops(AgreeBlocks.SPEED_APPLE_SAPLING));
            addDrop(AgreeBlocks.HEALTH_BOOST_SAPLING,drops(AgreeBlocks.HEALTH_BOOST_SAPLING));
            addDrop(AgreeBlocks.FIRE_RESISTANCE_SAPLING,drops(AgreeBlocks.FIRE_RESISTANCE_SAPLING));
            addDrop(AgreeBlocks.HERO_VILLAGE_SAPLING,drops(AgreeBlocks.HERO_VILLAGE_SAPLING));
            addDrop(AgreeBlocks.STRENGTH_SAPLING,drops(AgreeBlocks.STRENGTH_SAPLING));
            addDrop(AgreeBlocks.NIGHT_VISION_SAPLING,drops(AgreeBlocks.NIGHT_VISION_SAPLING));
            addDrop(AgreeBlocks.JUMP_BOOST_SAPLING,drops(AgreeBlocks.JUMP_BOOST_SAPLING));

            addDrop(AgreeBlocks.HASTE_APPLE_LEAVES,leavesDrops(AgreeBlocks.HASTE_APPLE_LEAVES,AgreeBlocks.HASTE_APPLE_SAPLING,SAPLING_DROP_CHANCE));
            addDrop(AgreeBlocks.SPEED_APPLE_LEAVES,leavesDrops(AgreeBlocks.SPEED_APPLE_LEAVES,AgreeBlocks.SPEED_APPLE_SAPLING,SAPLING_DROP_CHANCE));
            addDrop(AgreeBlocks.HEALTH_BOOST_LEAVES,leavesDrops(AgreeBlocks.HEALTH_BOOST_LEAVES,AgreeBlocks.HEALTH_BOOST_SAPLING,SAPLING_DROP_CHANCE));
            addDrop(AgreeBlocks.FIRE_RESISTANCE_LEAVES,leavesDrops(AgreeBlocks.FIRE_RESISTANCE_LEAVES,AgreeBlocks.FIRE_RESISTANCE_SAPLING,SAPLING_DROP_CHANCE));
            addDrop(AgreeBlocks.HERO_VILLAGE_LEAVES,leavesDrops(AgreeBlocks.HERO_VILLAGE_LEAVES,AgreeBlocks.HERO_VILLAGE_SAPLING,SAPLING_DROP_CHANCE));
            addDrop(AgreeBlocks.STRENGTH_LEAVES,leavesDrops(AgreeBlocks.STRENGTH_LEAVES,AgreeBlocks.STRENGTH_SAPLING,SAPLING_DROP_CHANCE));
            addDrop(AgreeBlocks.NIGHT_VISION_LEAVES,leavesDrops(AgreeBlocks.NIGHT_VISION_LEAVES,AgreeBlocks.NIGHT_VISION_SAPLING,SAPLING_DROP_CHANCE));
            addDrop(AgreeBlocks.JUMP_BOOST_LEAVES ,leavesDrops(AgreeBlocks.JUMP_BOOST_LEAVES,AgreeBlocks.JUMP_BOOST_SAPLING,SAPLING_DROP_CHANCE));
            addDrop(AgreeBlocks.Apple_Tree_LEAVES ,leavesDrops(AgreeBlocks.Apple_Tree_LEAVES, Blocks.OAK_SAPLING,SAPLING_DROP_CHANCE));
    }

    public static final float[] SAPLING_DROP_CHANCE = new float[]{0.028F, 0.0225F, 0.022333336F, 0.1F};
}
