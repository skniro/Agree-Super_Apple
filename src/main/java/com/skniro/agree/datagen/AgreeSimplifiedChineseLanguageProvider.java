package com.skniro.agree.datagen;

import com.skniro.agree.item.AgreeItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import java.nio.file.Path;

public class AgreeSimplifiedChineseLanguageProvider extends FabricLanguageProvider {
    public AgreeSimplifiedChineseLanguageProvider(FabricDataOutput dataGenerator){
        super(dataGenerator,"zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder){
        translationBuilder.add(AgreeItems.RUBY_HELMET,"红宝石头盔");
        translationBuilder.add(AgreeItems.RUBY_BOOTS,"红宝石靴子");
        translationBuilder.add(AgreeItems.RUBY_AXE,"红宝石斧");
        translationBuilder.add(AgreeItems.RUBY_CHESTPLATE,"红宝石胸甲");
        translationBuilder.add(AgreeItems.RUBY_HOE,"红宝石锄");
        translationBuilder.add(AgreeItems.RUBY_LEGGINGS,"红宝石护腿");
        translationBuilder.add(AgreeItems.RUBY_PICKAXE,"红宝石稿");
        translationBuilder.add(AgreeItems.RUBY_SHOVEL,"红宝石铲");
        translationBuilder.add(AgreeItems.RUBY_SWORD,"红宝石剑");

        // Load an existing language file.
        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/agree/lang/zh_cn.existing.json").get();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file!", e);
        }
    }
}
