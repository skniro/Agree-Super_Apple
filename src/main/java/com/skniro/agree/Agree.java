package com.skniro.agree;

import com.skniro.agree.Enchantment.EnchantmentModule;
import com.skniro.agree.conifg.AgreeConfig;
import com.skniro.agree.item.AgreeItems;
import com.skniro.agree.item.Gemstone;
import com.skniro.agree.item.ModCreativeModeTabs;
import com.skniro.agree.recipe.AgreeRecipeSerializer;
import com.skniro.agree.util.ModLootTableModifiers;
import com.skniro.agree.world.OreBiomeModifications;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.skniro.agree.item.Apples.AppleFoodComponents.HASTE_APPLE;

@Mod(Agree.MOD_ID)
public class Agree {
    public static final String MOD_ID = "agree";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);




    public Agree() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register the Deferred Register to the mod event bus so blocks get registered
        GrowableOresBlocks.registerMapleBlocks(modEventBus);
        Gemstone.registerModItems(modEventBus);
        AgreeItems.registerModItems(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
}
