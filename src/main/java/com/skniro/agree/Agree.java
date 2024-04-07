package com.skniro.agree;

import com.mojang.datafixers.kinds.App;
import com.skniro.agree.Enchantment.EnchantmentModule;
import com.skniro.agree.block.AgreeBlocks;
import com.skniro.agree.block.Gemstone_ore;
import com.skniro.agree.conifg.AgreeConfig;
import com.skniro.agree.item.AgreeItems;
import com.skniro.agree.item.Apples.AppleFoodComponents;
import com.skniro.agree.item.Gemstone;
import com.skniro.agree.item.ModCreativeModeTabs;
import com.skniro.agree.recipe.AgreeRecipeSerializer;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Supplier;

@Mod(Agree.MOD_ID)
public class Agree {
    public static final String MOD_ID = "agree";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public Agree(IEventBus modEventBus) {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, AgreeConfig.GENERAL_SPEC, "agree_config.toml");
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register the Deferred Register to the mod event bus so blocks get registered
        AppleFoodComponents.registerModItems(modEventBus);
        AgreeRecipeSerializer.agreerecipeseroalizer(modEventBus);
        Gemstone.registerModItems(modEventBus);
        AgreeItems.registerModItems(modEventBus);
        AgreeBlocks.registerAgreeBlocks(modEventBus);
        Gemstone_ore.registerAgreeBlocks(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
        EnchantmentModule.register(modEventBus);
        // Register ourselves for server and other game events we are interested in
        NeoForge.EVENT_BUS.register(this);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
