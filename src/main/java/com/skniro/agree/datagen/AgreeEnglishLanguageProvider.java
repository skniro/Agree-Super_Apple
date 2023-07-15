package com.skniro.agree.datagen;

import com.skniro.agree.item.AgreeItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import java.nio.file.Path;

public class AgreeEnglishLanguageProvider extends FabricLanguageProvider {
    public AgreeEnglishLanguageProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(AgreeItems.RUBY_HELMET,"Ruby Helmet");
        translationBuilder.add(AgreeItems.RUBY_BOOTS,"Ruby Boots");
        translationBuilder.add(AgreeItems.RUBY_AXE,"Ruby Axe");
        translationBuilder.add(AgreeItems.RUBY_CHESTPLATE,"Ruby Chestplate");
        translationBuilder.add(AgreeItems.RUBY_HOE,"Ruby Hoe");
        translationBuilder.add(AgreeItems.RUBY_LEGGINGS,"Ruby Leggings");
        translationBuilder.add(AgreeItems.RUBY_PICKAXE,"Ruby Pickaxe");
        translationBuilder.add(AgreeItems.RUBY_SHOVEL,"Ruby Shovel");
        translationBuilder.add(AgreeItems.RUBY_SWORD,"Ruby Sword");

        // Load an existing language file.
        try {
            Path existingFilePath = dataGenerator.getModContainer().findPath("assets/agree/lang/en_us.existing.json").get();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file!", e);
        }
    }
}
