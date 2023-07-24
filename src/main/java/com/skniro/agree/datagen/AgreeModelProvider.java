package com.skniro.agree.datagen;

import com.skniro.agree.block.AgreeBlocks;
import com.skniro.agree.item.AgreeItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
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

        blockStateModelGenerator.registerCubeAllModelTexturePool(AgreeBlocks.Apple_Tree_LEAVES);
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
