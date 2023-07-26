package com.skniro.agree.client;

import com.skniro.agree.Agree;
import com.skniro.agree.block.AgreeBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.MapColor;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class AgreeClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.HASTE_APPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.SPEED_APPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.STRENGTH_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.HEALTH_BOOST_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.FIRE_RESISTANCE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.HERO_VILLAGE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.NIGHT_VISION_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.JUMP_BOOST_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.POTTED_HASTE_APPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.POTTED_SPEED_APPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.POTTED_STRENGTH_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.POTTED_HEALTH_BOOST_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.POTTED_FIRE_RESISTANCE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.POTTED_HERO_VILLAGE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.POTTED_NIGHT_VISION_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.POTTED_JUMP_BOOST_SAPLING, RenderLayer.getCutout());


        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.HASTE_APPLE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.SPEED_APPLE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.STRENGTH_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.HEALTH_BOOST_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.FIRE_RESISTANCE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.HERO_VILLAGE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.NIGHT_VISION_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.JUMP_BOOST_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.Apple_Tree_LEAVES, RenderLayer.getCutout());

    }
}
