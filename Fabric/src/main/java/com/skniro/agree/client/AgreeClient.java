package com.skniro.agree.client;

import com.skniro.agree.block.AgreeBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.render.BlockRenderLayer;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class AgreeClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.putBlock(AgreeBlocks.HASTE_APPLE_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(AgreeBlocks.SPEED_APPLE_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(AgreeBlocks.STRENGTH_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(AgreeBlocks.HEALTH_BOOST_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(AgreeBlocks.FIRE_RESISTANCE_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(AgreeBlocks.HERO_VILLAGE_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(AgreeBlocks.NIGHT_VISION_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(AgreeBlocks.JUMP_BOOST_SAPLING, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(AgreeBlocks.POTTED_HASTE_APPLE_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(AgreeBlocks.POTTED_SPEED_APPLE_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(AgreeBlocks.POTTED_STRENGTH_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(AgreeBlocks.POTTED_HEALTH_BOOST_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(AgreeBlocks.POTTED_FIRE_RESISTANCE_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(AgreeBlocks.POTTED_HERO_VILLAGE_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(AgreeBlocks.POTTED_NIGHT_VISION_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(AgreeBlocks.POTTED_JUMP_BOOST_SAPLING, BlockRenderLayer.CUTOUT);


        BlockRenderLayerMap.putBlock(AgreeBlocks.HASTE_APPLE_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(AgreeBlocks.SPEED_APPLE_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(AgreeBlocks.STRENGTH_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(AgreeBlocks.HEALTH_BOOST_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(AgreeBlocks.FIRE_RESISTANCE_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(AgreeBlocks.HERO_VILLAGE_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(AgreeBlocks.NIGHT_VISION_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(AgreeBlocks.JUMP_BOOST_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(AgreeBlocks.Apple_Tree_LEAVES, BlockRenderLayer.CUTOUT);

    }
}
