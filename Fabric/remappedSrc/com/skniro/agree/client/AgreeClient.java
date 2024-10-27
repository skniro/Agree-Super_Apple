package com.skniro.agree.client;

import com.skniro.agree.Agree;
import com.skniro.agree.block.AgreeBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

@Environment(EnvType.CLIENT)
public class AgreeClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.HASTE_APPLE_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.SPEED_APPLE_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.STRENGTH_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.HEALTH_BOOST_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.FIRE_RESISTANCE_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.HERO_VILLAGE_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.NIGHT_VISION_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.JUMP_BOOST_SAPLING, RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.POTTED_HASTE_APPLE_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.POTTED_SPEED_APPLE_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.POTTED_STRENGTH_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.POTTED_HEALTH_BOOST_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.POTTED_FIRE_RESISTANCE_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.POTTED_HERO_VILLAGE_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.POTTED_NIGHT_VISION_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.POTTED_JUMP_BOOST_SAPLING, RenderType.cutout());


        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.HASTE_APPLE_LEAVES, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.SPEED_APPLE_LEAVES, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.STRENGTH_LEAVES, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.HEALTH_BOOST_LEAVES, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.FIRE_RESISTANCE_LEAVES, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.HERO_VILLAGE_LEAVES, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.NIGHT_VISION_LEAVES, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.JUMP_BOOST_LEAVES, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgreeBlocks.Apple_Tree_LEAVES, RenderType.cutout());

    }
}
