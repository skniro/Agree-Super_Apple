package com.skniro.agree.datagen;

import com.skniro.agree.block.AgreeBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
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
            addDrop(AgreeBlocks.HASTE_APPLE_LEAVES,leavesDrops(AgreeBlocks.HASTE_APPLE_LEAVES,AgreeBlocks.HASTE_APPLE_SAPLING,SAPLING_DROP_CHANCE));
    }

    public static final float[] SAPLING_DROP_CHANCE = new float[]{0.028F, 0.0225F, 0.022333336F, 0.1F};
}
