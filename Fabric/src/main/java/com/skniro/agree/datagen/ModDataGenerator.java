package com.skniro.agree.datagen;

import com.skniro.agree.Agree;
import com.skniro.agree.world.AgreeTreeConfiguredFeatures;
import com.skniro.agree.world.AgreeTreePlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class ModDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModWorldGenerator::new);
        pack.addProvider(AgreeLootTableGenerator::new);
        pack.addProvider(AgreeModelProvider::new);
        pack.addProvider(AgreeRecipeProvider::new);
        pack.addProvider(AgreeEnglishLanguageProvider::new);
        pack.addProvider(AgreeSimplifiedChineseLanguageProvider::new);
        pack.addProvider(AgreeItemTagGeneration::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, AgreeTreeConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, AgreeTreePlacedFeatures::bootstrap);
    }
}
