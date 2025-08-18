package com.skniro.agree.client;

import com.skniro.agree.Agree;
import com.skniro.agree.block.AgreeBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = Agree.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AgreeClient {
    @SuppressWarnings({"deprecation","removal"})
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.HASTE_APPLE_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.SPEED_APPLE_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.STRENGTH_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.HEALTH_BOOST_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.FIRE_RESISTANCE_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.HERO_VILLAGE_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.NIGHT_VISION_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.JUMP_BOOST_SAPLING.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.POTTED_HASTE_APPLE_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.POTTED_SPEED_APPLE_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.POTTED_STRENGTH_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.POTTED_HEALTH_BOOST_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.POTTED_FIRE_RESISTANCE_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.POTTED_HERO_VILLAGE_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.POTTED_NIGHT_VISION_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.POTTED_JUMP_BOOST_SAPLING.get(), RenderType.cutout());


        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.HASTE_APPLE_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.SPEED_APPLE_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.STRENGTH_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.HEALTH_BOOST_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.FIRE_RESISTANCE_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.HERO_VILLAGE_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.NIGHT_VISION_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.JUMP_BOOST_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AgreeBlocks.Apple_Tree_LEAVES.get(), RenderType.cutout());
    }
}
