package com.skniro.agree.client;

import com.skniro.agree.block.AgreeBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;

@Environment(EnvType.CLIENT)
public class AgreeClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModItemBlockRenderTypes.setRenderLayer(AgreeBlocks.HASTE_APPLE_SAPLING, ChunkSectionLayer.CUTOUT);
        ModItemBlockRenderTypes.setRenderLayer(AgreeBlocks.SPEED_APPLE_SAPLING, ChunkSectionLayer.CUTOUT);
        ModItemBlockRenderTypes.setRenderLayer(AgreeBlocks.STRENGTH_SAPLING, ChunkSectionLayer.CUTOUT);
        ModItemBlockRenderTypes.setRenderLayer(AgreeBlocks.HEALTH_BOOST_SAPLING, ChunkSectionLayer.CUTOUT);
        ModItemBlockRenderTypes.setRenderLayer(AgreeBlocks.FIRE_RESISTANCE_SAPLING, ChunkSectionLayer.CUTOUT);
        ModItemBlockRenderTypes.setRenderLayer(AgreeBlocks.HERO_VILLAGE_SAPLING, ChunkSectionLayer.CUTOUT);
        ModItemBlockRenderTypes.setRenderLayer(AgreeBlocks.NIGHT_VISION_SAPLING, ChunkSectionLayer.CUTOUT);
        ModItemBlockRenderTypes.setRenderLayer(AgreeBlocks.JUMP_BOOST_SAPLING, ChunkSectionLayer.CUTOUT);

        ModItemBlockRenderTypes.setRenderLayer(AgreeBlocks.POTTED_HASTE_APPLE_SAPLING, ChunkSectionLayer.CUTOUT);
        ModItemBlockRenderTypes.setRenderLayer(AgreeBlocks.POTTED_SPEED_APPLE_SAPLING, ChunkSectionLayer.CUTOUT);
        ModItemBlockRenderTypes.setRenderLayer(AgreeBlocks.POTTED_STRENGTH_SAPLING, ChunkSectionLayer.CUTOUT);
        ModItemBlockRenderTypes.setRenderLayer(AgreeBlocks.POTTED_HEALTH_BOOST_SAPLING, ChunkSectionLayer.CUTOUT);
        ModItemBlockRenderTypes.setRenderLayer(AgreeBlocks.POTTED_FIRE_RESISTANCE_SAPLING, ChunkSectionLayer.CUTOUT);
        ModItemBlockRenderTypes.setRenderLayer(AgreeBlocks.POTTED_HERO_VILLAGE_SAPLING, ChunkSectionLayer.CUTOUT);
        ModItemBlockRenderTypes.setRenderLayer(AgreeBlocks.POTTED_NIGHT_VISION_SAPLING, ChunkSectionLayer.CUTOUT);
        ModItemBlockRenderTypes.setRenderLayer(AgreeBlocks.POTTED_JUMP_BOOST_SAPLING, ChunkSectionLayer.CUTOUT);


        ModItemBlockRenderTypes.setRenderLayer(AgreeBlocks.HASTE_APPLE_LEAVES, ChunkSectionLayer.CUTOUT);
        ModItemBlockRenderTypes.setRenderLayer(AgreeBlocks.SPEED_APPLE_LEAVES, ChunkSectionLayer.CUTOUT);
        ModItemBlockRenderTypes.setRenderLayer(AgreeBlocks.STRENGTH_LEAVES, ChunkSectionLayer.CUTOUT);
        ModItemBlockRenderTypes.setRenderLayer(AgreeBlocks.HEALTH_BOOST_LEAVES, ChunkSectionLayer.CUTOUT);
        ModItemBlockRenderTypes.setRenderLayer(AgreeBlocks.FIRE_RESISTANCE_LEAVES, ChunkSectionLayer.CUTOUT);
        ModItemBlockRenderTypes.setRenderLayer(AgreeBlocks.HERO_VILLAGE_LEAVES, ChunkSectionLayer.CUTOUT);
        ModItemBlockRenderTypes.setRenderLayer(AgreeBlocks.NIGHT_VISION_LEAVES, ChunkSectionLayer.CUTOUT);
        ModItemBlockRenderTypes.setRenderLayer(AgreeBlocks.JUMP_BOOST_LEAVES, ChunkSectionLayer.CUTOUT);
        ModItemBlockRenderTypes.setRenderLayer(AgreeBlocks.Apple_Tree_LEAVES, ChunkSectionLayer.CUTOUT);

    }
}
