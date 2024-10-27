package com.skniro.agree.datagen;

import com.skniro.agree.block.AgreeBlocks;
import com.skniro.agree.item.AgreeItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;

public class AgreeModelProvider extends FabricModelProvider {
    public AgreeModelProvider(FabricDataOutput dataGenerator){
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator){
        blockStateModelGenerator.createPlant(AgreeBlocks.HASTE_APPLE_SAPLING,AgreeBlocks.POTTED_HASTE_APPLE_SAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createPlant(AgreeBlocks.SPEED_APPLE_SAPLING,AgreeBlocks.POTTED_SPEED_APPLE_SAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createPlant(AgreeBlocks.STRENGTH_SAPLING,AgreeBlocks.POTTED_STRENGTH_SAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createPlant(AgreeBlocks.HEALTH_BOOST_SAPLING,AgreeBlocks.POTTED_HEALTH_BOOST_SAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createPlant(AgreeBlocks.FIRE_RESISTANCE_SAPLING,AgreeBlocks.POTTED_FIRE_RESISTANCE_SAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createPlant(AgreeBlocks.HERO_VILLAGE_SAPLING,AgreeBlocks.POTTED_HERO_VILLAGE_SAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createPlant(AgreeBlocks.NIGHT_VISION_SAPLING,AgreeBlocks.POTTED_NIGHT_VISION_SAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createPlant(AgreeBlocks.JUMP_BOOST_SAPLING,AgreeBlocks.POTTED_JUMP_BOOST_SAPLING,BlockModelGenerators.TintState.NOT_TINTED);

        blockStateModelGenerator.family(AgreeBlocks.Apple_Tree_LEAVES);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(AgreeItems.RUBY_AXE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AgreeItems.RUBY_BOOTS, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AgreeItems.RUBY_CHESTPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AgreeItems.RUBY_HELMET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AgreeItems.RUBY_LEGGINGS, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AgreeItems.RUBY_HOE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AgreeItems.RUBY_PICKAXE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AgreeItems.RUBY_SHOVEL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AgreeItems.RUBY_SWORD, ModelTemplates.FLAT_ITEM);
    }
}
