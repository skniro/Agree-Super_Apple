package com.skniro.agree;

import com.skniro.agree.conifg.AgreeConfig;
import com.skniro.agree.conifg.Configuration;
import com.skniro.agree.recipe.AgreeRecipeSerializer;
import com.skniro.agree.util.ModLootTableModifiers;
import com.skniro.agree.world.OreBiomeModifications;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.skniro.agree.item.Apples.AppleFoodComponents.HASTE_APPLE;


public class Agree implements ModInitializer {
    public static final String MOD_ID = "agree";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);




     public static final ResourceKey<CreativeModeTab> Agree_Group = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(MOD_ID, "test_group"));

    @Override
    public void onInitialize() {
        new Configuration(AgreeConfig.class, MOD_ID);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Agree_Group, FabricItemGroup.builder()
                .icon(() -> new ItemStack(HASTE_APPLE))
                .title(Component.translatable("itemGroup.agree.test_group"))
                .build()); // build() no longer registers by itself
        ModContent.registerItem();
        ModContent.registerBlock();
        ModContent.CreativeTab();
                    OreBiomeModifications.addOres();
/*        if (AgreeConfig.Enchantment_Module) {
            EnchantmentModule.registerModEnchantments();
        }*/
        ModLootTableModifiers.modifyLootTables();
        AgreeRecipeSerializer.agreerecipeseroalizer();
    }
}
