package com.skniro.agree.datagen;

import com.skniro.agree.block.AgreeBlocks;
import com.skniro.agree.item.AgreeItems;
import com.skniro.agree.item.Apples.AppleFoodComponents;
import com.skniro.agree.item.init.AgreeEquipmentAssetKeys;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.world.item.Items;

import static net.minecraft.client.data.models.ItemModelGenerators.*;

public class AgreeModelProvider extends FabricModelProvider {
    public AgreeModelProvider(FabricPackOutput dataGenerator){
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator){
        blockStateModelGenerator.createPlantWithDefaultItem(AgreeBlocks.HASTE_APPLE_SAPLING,AgreeBlocks.POTTED_HASTE_APPLE_SAPLING,BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(AgreeBlocks.SPEED_APPLE_SAPLING,AgreeBlocks.POTTED_SPEED_APPLE_SAPLING,BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(AgreeBlocks.STRENGTH_SAPLING,AgreeBlocks.POTTED_STRENGTH_SAPLING,BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(AgreeBlocks.HEALTH_BOOST_SAPLING,AgreeBlocks.POTTED_HEALTH_BOOST_SAPLING,BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(AgreeBlocks.FIRE_RESISTANCE_SAPLING,AgreeBlocks.POTTED_FIRE_RESISTANCE_SAPLING,BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(AgreeBlocks.HERO_VILLAGE_SAPLING,AgreeBlocks.POTTED_HERO_VILLAGE_SAPLING,BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(AgreeBlocks.NIGHT_VISION_SAPLING,AgreeBlocks.POTTED_NIGHT_VISION_SAPLING,BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(AgreeBlocks.JUMP_BOOST_SAPLING,AgreeBlocks.POTTED_JUMP_BOOST_SAPLING,BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.family(AgreeBlocks.Apple_Tree_LEAVES);

        blockStateModelGenerator.createTrivialCube(AgreeBlocks.RUBY_BLOCK);
        blockStateModelGenerator.createTrivialCube(AgreeBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.createTrivialCube(AgreeBlocks.RUBY_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(AgreeItems.RUBY_AXE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateTrimmableItem(AgreeItems.RUBY_BOOTS, AgreeEquipmentAssetKeys.RUBY, TRIM_PREFIX_HELMET, false);
        itemModelGenerator.generateTrimmableItem(AgreeItems.RUBY_CHESTPLATE, AgreeEquipmentAssetKeys.RUBY, TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerator.generateTrimmableItem(AgreeItems.RUBY_HELMET, AgreeEquipmentAssetKeys.RUBY, TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerator.generateTrimmableItem(AgreeItems.RUBY_LEGGINGS, AgreeEquipmentAssetKeys.RUBY, TRIM_PREFIX_BOOTS,false);
        itemModelGenerator.generateFlatItem(AgreeItems.RUBY_HOE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AgreeItems.RUBY_PICKAXE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AgreeItems.RUBY_SHOVEL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AgreeItems.RUBY_SWORD, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(AgreeItems.RUBY, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AppleFoodComponents.HASTE_APPLE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AppleFoodComponents.HEALTH_BOOST_APPLE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AppleFoodComponents.SPEED_APPLE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AppleFoodComponents.STRENGTH_APPLE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AppleFoodComponents.HERO_VILLAGE_APPLE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AppleFoodComponents.JUMP_BOOST_APPLE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AppleFoodComponents.NIGHT_VISION_APPLE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AppleFoodComponents.SUPER_APPLE, AppleFoodComponents.HASTE_APPLE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(AppleFoodComponents.SUSPICIOUS_APPLE, ModelTemplates.FLAT_ITEM);
    }
}
