package com.skniro.agree.datagen;

import com.skniro.agree.block.AgreeBlocks;
import com.skniro.agree.item.AgreeItems;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.state.property.Properties;

public class AgreeModelProvider extends FabricModelProvider {
    public AgreeModelProvider(FabricDataOutput dataGenerator){
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator){
        blockStateModelGenerator.registerFlowerPotPlant(AgreeBlocks.HASTE_APPLE_SAPLING,AgreeBlocks.POTTED_HASTE_APPLE_SAPLING,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(AgreeBlocks.SPEED_APPLE_SAPLING,AgreeBlocks.POTTED_SPEED_APPLE_SAPLING,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(AgreeBlocks.STRENGTH_SAPLING,AgreeBlocks.POTTED_STRENGTH_SAPLING,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(AgreeBlocks.HEALTH_BOOST_SAPLING,AgreeBlocks.POTTED_HEALTH_BOOST_SAPLING,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(AgreeBlocks.FIRE_RESISTANCE_SAPLING,AgreeBlocks.POTTED_FIRE_RESISTANCE_SAPLING,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(AgreeBlocks.HERO_VILLAGE_SAPLING,AgreeBlocks.POTTED_HERO_VILLAGE_SAPLING,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(AgreeBlocks.NIGHT_VISION_SAPLING,AgreeBlocks.POTTED_NIGHT_VISION_SAPLING,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(AgreeBlocks.JUMP_BOOST_SAPLING,AgreeBlocks.POTTED_JUMP_BOOST_SAPLING,BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerCrop(AgreeBlocks.HASTE_APPLE_LEAVES,  Properties.AGE_2,0,0,2);
        blockStateModelGenerator.registerCrop(AgreeBlocks.SPEED_APPLE_LEAVES,  Properties.AGE_2,0,0,2);
        blockStateModelGenerator.registerCrop(AgreeBlocks.STRENGTH_LEAVES,  Properties.AGE_2,0,0,2);
        blockStateModelGenerator.registerCrop(AgreeBlocks.HEALTH_BOOST_LEAVES,  Properties.AGE_2,0,0,2);
        blockStateModelGenerator.registerCrop(AgreeBlocks.FIRE_RESISTANCE_LEAVES,  Properties.AGE_2,0,0,2);
        blockStateModelGenerator.registerCrop(AgreeBlocks.HERO_VILLAGE_LEAVES,  Properties.AGE_2,0,0,2);
        blockStateModelGenerator.registerCrop(AgreeBlocks.NIGHT_VISION_LEAVES,  Properties.AGE_2,0,0,2);
        blockStateModelGenerator.registerCrop(AgreeBlocks.JUMP_BOOST_LEAVES,  Properties.AGE_2,0,0,2);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(AgreeItems.RUBY_AXE, Models.GENERATED);
        itemModelGenerator.register(AgreeItems.RUBY_BOOTS, Models.GENERATED);
        itemModelGenerator.register(AgreeItems.RUBY_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(AgreeItems.RUBY_HELMET, Models.GENERATED);
        itemModelGenerator.register(AgreeItems.RUBY_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(AgreeItems.RUBY_HOE, Models.GENERATED);
        itemModelGenerator.register(AgreeItems.RUBY_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(AgreeItems.RUBY_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(AgreeItems.RUBY_SWORD, Models.GENERATED);
    }
}
