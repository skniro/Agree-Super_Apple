package com.skniro.agree.datagen;

import com.skniro.agree.Agree;
import com.skniro.agree.block.AgreeBlocks;
import com.skniro.agree.item.AgreeItems;
import com.skniro.agree.item.Apples.AppleFoodComponents;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class AgreeSimplifiedChineseLanguageProvider extends FabricLanguageProvider {
    public AgreeSimplifiedChineseLanguageProvider(FabricPackOutput dataGenerator, CompletableFuture<HolderLookup.Provider> registryLookup){
        super(dataGenerator,"zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
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

        translationBuilder.add(AppleFoodComponents.HASTE_APPLE, "急迫苹果");
        translationBuilder.add(AppleFoodComponents.SUPER_APPLE, "超级苹果");
        translationBuilder.add(AppleFoodComponents.SPEED_APPLE, "速度苹果");
        translationBuilder.add(AppleFoodComponents.NIGHT_VISION_APPLE, "夜视苹果");
        translationBuilder.add(AppleFoodComponents.STRENGTH_APPLE, "力量苹果");
        translationBuilder.add(AppleFoodComponents.HEALTH_BOOST_APPLE, "生命提升苹果");
        translationBuilder.add(AppleFoodComponents.FIRE_RESISTANCE_APPLE, "抗火苹果");
        translationBuilder.add(AppleFoodComponents.HERO_VILLAGE_APPLE, "村庄英雄苹果");
        translationBuilder.add(AppleFoodComponents.JUMP_BOOST_APPLE, "跳跃提升苹果");
        translationBuilder.add(AppleFoodComponents.SUSPICIOUS_APPLE, "可疑苹果");
        translationBuilder.add(AgreeItems.RUBY, "红宝石");

        translationBuilder.add(AgreeBlocks.RUBY_ORE, "红宝石矿");
        translationBuilder.add(AgreeBlocks.DEEPSLATE_RUBY_ORE, "深板岩红宝石矿");
        translationBuilder.add(AgreeBlocks.RUBY_BLOCK, "红宝石块");

        translationBuilder.add(Agree.Agree_Group, "超级苹果");

        translationBuilder.add("config.jade.plugin_agree.apple_progress", "苹果生长进度");

        // Load an existing language file.
/*        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/agree/lang/zh_cn.existing.json").get();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file!", e);
        }*/
    }
}
