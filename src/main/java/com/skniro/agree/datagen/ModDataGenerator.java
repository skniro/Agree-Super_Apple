package com.skniro.agree.datagen;

//import com.skniro.agree.world.AgreeTreeConfiguredFeatures;
//import com.skniro.agree.world.AgreeTreePlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.apache.http.config.RegistryBuilder;

public class ModDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        //pack.addProvider(ModWorldGenerator::new);
        //pack.addProvider(AgreeLootTableGenerator::new);
        fabricDataGenerator.addProvider(AgreeModelProvider::new);
        fabricDataGenerator.addProvider(AgreeEnglishLanguageProvider::new);
        fabricDataGenerator.addProvider(AgreeSimplifiedChineseLanguageProvider::new);
    }


    public void buildRegistry(RegistryBuilder registryBuilder) {
        //registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, AgreeTreeConfiguredFeatures::bootstrap);
        //registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, AgreeTreePlacedFeatures::bootstrap);
    }
}
