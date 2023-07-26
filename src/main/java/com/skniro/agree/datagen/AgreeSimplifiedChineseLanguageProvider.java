package com.skniro.agree.datagen;

import com.skniro.agree.block.AgreeBlocks;
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

        //SAPLING
        translationBuilder.add(AgreeBlocks.HASTE_APPLE_SAPLING,"急迫苹果树苗");
        translationBuilder.add(AgreeBlocks.SPEED_APPLE_SAPLING,"速度苹果树苗");
        translationBuilder.add(AgreeBlocks.HEALTH_BOOST_SAPLING,"生命提升苹果树苗");
        translationBuilder.add(AgreeBlocks.FIRE_RESISTANCE_SAPLING,"抗火苹果树苗");
        translationBuilder.add(AgreeBlocks.HERO_VILLAGE_SAPLING,"村庄英雄苹果树苗");
        translationBuilder.add(AgreeBlocks.STRENGTH_SAPLING,"力量苹果树苗");
        translationBuilder.add(AgreeBlocks.NIGHT_VISION_SAPLING,"夜视苹果树苗");
        translationBuilder.add(AgreeBlocks.JUMP_BOOST_SAPLING,"跳跃提升苹果树苗");

        //LEAVES
        translationBuilder.add(AgreeBlocks.HASTE_APPLE_LEAVES,"急迫苹果树叶");
        translationBuilder.add(AgreeBlocks.SPEED_APPLE_LEAVES,"速度苹果树叶");
        translationBuilder.add(AgreeBlocks.HEALTH_BOOST_LEAVES,"生命提升苹果树叶");
        translationBuilder.add(AgreeBlocks.FIRE_RESISTANCE_LEAVES,"抗火苹果树叶");
        translationBuilder.add(AgreeBlocks.HERO_VILLAGE_LEAVES,"村庄英雄苹果树叶");
        translationBuilder.add(AgreeBlocks.STRENGTH_LEAVES,"力量苹果树叶");
        translationBuilder.add(AgreeBlocks.NIGHT_VISION_LEAVES,"夜视苹果树叶");
        translationBuilder.add(AgreeBlocks.JUMP_BOOST_LEAVES,"跳跃提升苹果树叶");
        translationBuilder.add(AgreeBlocks.Apple_Tree_LEAVES,"苹果树叶");

        //Potted Plant
        translationBuilder.add(AgreeBlocks.POTTED_HASTE_APPLE_SAPLING,"急迫苹果盆栽");
        translationBuilder.add(AgreeBlocks.POTTED_SPEED_APPLE_SAPLING,"速度苹果盆栽");
        translationBuilder.add(AgreeBlocks.POTTED_HEALTH_BOOST_SAPLING,"生命提升苹果盆栽");
        translationBuilder.add(AgreeBlocks.POTTED_FIRE_RESISTANCE_SAPLING,"抗火苹果盆栽");
        translationBuilder.add(AgreeBlocks.POTTED_HERO_VILLAGE_SAPLING,"村庄英雄苹果盆栽");
        translationBuilder.add(AgreeBlocks.POTTED_STRENGTH_SAPLING,"力量苹果盆栽");
        translationBuilder.add(AgreeBlocks.POTTED_NIGHT_VISION_SAPLING,"夜视苹果盆栽");
        translationBuilder.add(AgreeBlocks.POTTED_JUMP_BOOST_SAPLING,"跳跃提升苹果盆栽");

        // Load an existing language file.
        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/agree/lang/zh_cn.existing.json").get();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file!", e);
        }
    }
}
