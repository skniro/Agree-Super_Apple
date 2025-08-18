package com.skniro.agree.client;

import com.skniro.agree.Agree;
import com.skniro.agree.block.AgreeBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Agree.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AgreeClient{
    @SuppressWarnings({"deprecation","removal"})
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.HASTE_APPLE_SAPLING.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.SPEED_APPLE_SAPLING.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.STRENGTH_SAPLING.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.HEALTH_BOOST_SAPLING.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.FIRE_RESISTANCE_SAPLING.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.HERO_VILLAGE_SAPLING.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.NIGHT_VISION_SAPLING.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.JUMP_BOOST_SAPLING.get(), ChunkSectionLayer.CUTOUT);

        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.POTTED_HASTE_APPLE_SAPLING.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.POTTED_SPEED_APPLE_SAPLING.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.POTTED_STRENGTH_SAPLING.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.POTTED_HEALTH_BOOST_SAPLING.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.POTTED_FIRE_RESISTANCE_SAPLING.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.POTTED_HERO_VILLAGE_SAPLING.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.POTTED_NIGHT_VISION_SAPLING.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.POTTED_JUMP_BOOST_SAPLING.get(), ChunkSectionLayer.CUTOUT);


        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.HASTE_APPLE_LEAVES.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.SPEED_APPLE_LEAVES.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.STRENGTH_LEAVES.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.HEALTH_BOOST_LEAVES.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.FIRE_RESISTANCE_LEAVES.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.HERO_VILLAGE_LEAVES.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.NIGHT_VISION_LEAVES.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.JUMP_BOOST_LEAVES.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.Apple_Tree_LEAVES.get(), ChunkSectionLayer.CUTOUT);
    }
}
