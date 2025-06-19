package com.skniro.agree;

import com.skniro.agree.block.AgreeBlocks;
import com.skniro.agree.item.AgreeItems;
import com.skniro.agree.item.Apples.AppleFoodComponents;
import com.skniro.agree.item.ModCreativeModeTabs;
import com.skniro.agree.recipe.AgreeRecipeSerializer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(Agree.MOD_ID)
public class Agree {
    public static final String MOD_ID = "agree";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public Agree(FMLJavaModLoadingContext context) {
        var modEventBus = context.getModBusGroup();
        //ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, AgreeConfig.GENERAL_SPEC, "agree_config.toml");
        // Register the commonSetup method for modloading
        FMLCommonSetupEvent.getBus(modEventBus).addListener(this::commonSetup);

        // Register the Deferred Register to the mod event bus so blocks get registered
        AppleFoodComponents.registerModItems(modEventBus);
        AgreeRecipeSerializer.agreerecipeseroalizer(modEventBus);
        AgreeItems.registerModItems(modEventBus);
        AgreeBlocks.registerAgreeBlocks(modEventBus);
        ModCreativeModeTabs.register(modEventBus);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
