package com.skniro.agree.client;

import com.skniro.agree.block.AgreeBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ChunkSectionLayerMap;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;

@Environment(EnvType.CLIENT)
public class AgreeClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ChunkSectionLayerMap.putBlock(AgreeBlocks.HASTE_APPLE_SAPLING, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(AgreeBlocks.SPEED_APPLE_SAPLING, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(AgreeBlocks.STRENGTH_SAPLING, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(AgreeBlocks.HEALTH_BOOST_SAPLING, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(AgreeBlocks.FIRE_RESISTANCE_SAPLING, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(AgreeBlocks.HERO_VILLAGE_SAPLING, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(AgreeBlocks.NIGHT_VISION_SAPLING, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(AgreeBlocks.JUMP_BOOST_SAPLING, ChunkSectionLayer.CUTOUT);

        ChunkSectionLayerMap.putBlock(AgreeBlocks.POTTED_HASTE_APPLE_SAPLING, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(AgreeBlocks.POTTED_SPEED_APPLE_SAPLING, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(AgreeBlocks.POTTED_STRENGTH_SAPLING, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(AgreeBlocks.POTTED_HEALTH_BOOST_SAPLING, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(AgreeBlocks.POTTED_FIRE_RESISTANCE_SAPLING, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(AgreeBlocks.POTTED_HERO_VILLAGE_SAPLING, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(AgreeBlocks.POTTED_NIGHT_VISION_SAPLING, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(AgreeBlocks.POTTED_JUMP_BOOST_SAPLING, ChunkSectionLayer.CUTOUT);


        ChunkSectionLayerMap.putBlock(AgreeBlocks.HASTE_APPLE_LEAVES, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(AgreeBlocks.SPEED_APPLE_LEAVES, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(AgreeBlocks.STRENGTH_LEAVES, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(AgreeBlocks.HEALTH_BOOST_LEAVES, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(AgreeBlocks.FIRE_RESISTANCE_LEAVES, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(AgreeBlocks.HERO_VILLAGE_LEAVES, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(AgreeBlocks.NIGHT_VISION_LEAVES, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(AgreeBlocks.JUMP_BOOST_LEAVES, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(AgreeBlocks.Apple_Tree_LEAVES, ChunkSectionLayer.CUTOUT);

    }
}
