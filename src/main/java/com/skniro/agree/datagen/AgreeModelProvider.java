package com.skniro.agree.datagen;

import com.skniro.agree.item.AgreeItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class AgreeModelProvider extends FabricModelProvider {
    public AgreeModelProvider(FabricDataOutput dataGenerator){
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator){

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
