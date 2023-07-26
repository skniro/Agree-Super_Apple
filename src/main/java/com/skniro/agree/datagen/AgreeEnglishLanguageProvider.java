package com.skniro.agree.datagen;

import com.skniro.agree.block.AgreeBlocks;
import com.skniro.agree.item.AgreeItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import java.nio.file.Path;

public class AgreeEnglishLanguageProvider extends FabricLanguageProvider {
    public AgreeEnglishLanguageProvider(FabricDataOutput dataGenerator) {
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

        //SAPLING
        translationBuilder.add(AgreeBlocks.HASTE_APPLE_SAPLING,"Haste Apple Sapling");
        translationBuilder.add(AgreeBlocks.SPEED_APPLE_SAPLING,"Speed Apple Sapling");
        translationBuilder.add(AgreeBlocks.HEALTH_BOOST_SAPLING,"Health Boost Apple Sapling");
        translationBuilder.add(AgreeBlocks.FIRE_RESISTANCE_SAPLING,"Fire Resistance Apple Sapling");
        translationBuilder.add(AgreeBlocks.HERO_VILLAGE_SAPLING,"Hero Village Apple Sapling");
        translationBuilder.add(AgreeBlocks.STRENGTH_SAPLING,"Strength Apple Sapling");
        translationBuilder.add(AgreeBlocks.NIGHT_VISION_SAPLING,"Night Vision Apple Sapling");
        translationBuilder.add(AgreeBlocks.JUMP_BOOST_SAPLING,"Jump boost Apple Sapling");

        //LEAVES
        translationBuilder.add(AgreeBlocks.HASTE_APPLE_LEAVES,"Haste Apple Leaves");
        translationBuilder.add(AgreeBlocks.SPEED_APPLE_LEAVES,"Speed Apple Leaves");
        translationBuilder.add(AgreeBlocks.HEALTH_BOOST_LEAVES,"Health Boost Apple Leaves");
        translationBuilder.add(AgreeBlocks.FIRE_RESISTANCE_LEAVES,"Fire Resistance Apple Leaves");
        translationBuilder.add(AgreeBlocks.HERO_VILLAGE_LEAVES,"Hero Village Apple Leaves");
        translationBuilder.add(AgreeBlocks.STRENGTH_LEAVES,"Strength Apple Leaves");
        translationBuilder.add(AgreeBlocks.NIGHT_VISION_LEAVES,"Night Vision Apple Leaves");
        translationBuilder.add(AgreeBlocks.JUMP_BOOST_LEAVES,"Jump boost Apple Leaves");
        translationBuilder.add(AgreeBlocks.Apple_Tree_LEAVES,"Apple Tree Leaves");

        //Potted Plant
        translationBuilder.add(AgreeBlocks.POTTED_HASTE_APPLE_SAPLING,"Potted Haste Apple Sapling");
        translationBuilder.add(AgreeBlocks.POTTED_SPEED_APPLE_SAPLING,"Potted Speed Apple Sapling");
        translationBuilder.add(AgreeBlocks.POTTED_HEALTH_BOOST_SAPLING,"Potted Health Boost Apple Sapling");
        translationBuilder.add(AgreeBlocks.POTTED_FIRE_RESISTANCE_SAPLING,"Potted Fire Resistance Apple Sapling");
        translationBuilder.add(AgreeBlocks.POTTED_HERO_VILLAGE_SAPLING,"Potted Hero Village Apple Sapling");
        translationBuilder.add(AgreeBlocks.POTTED_STRENGTH_SAPLING,"Potted Strength Apple Sapling");
        translationBuilder.add(AgreeBlocks.POTTED_NIGHT_VISION_SAPLING, "Potted Night Vision Apple Sapling");
        translationBuilder.add(AgreeBlocks.POTTED_JUMP_BOOST_SAPLING,"Potted Jump boost Apple Sapling");



        // Load an existing language file.
        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/agree/lang/en_us.existing.json").get();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file!", e);
        }
    }
}
