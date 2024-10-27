package com.skniro.agree.block;

import com.skniro.agree.Agree;
import com.skniro.agree.block.init.LeafCropBlock;
import com.skniro.agree.item.Apples.AppleFoodComponents;
import com.skniro.agree.world.Tree.*;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import java.util.function.Function;
import java.util.logging.Logger;

public class AgreeBlocks {
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            Block::new, AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL));

    //Ore
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            (settings)-> new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), settings), AbstractBlock.Settings.create().requiresTool().strength(3.0F, 3.0F));
    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            (settings)-> new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), settings), AbstractBlock.Settings.copy(RUBY_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE));



    //SAPLING
    public static final Block HASTE_APPLE_SAPLING = registerBlock("haste_apple_sapling",
            (settings)-> new SaplingBlock(HasteAppleSaplingGenerator.HasteAppleSapling,settings), AbstractBlock.Settings.copyShallow(Blocks.OAK_SAPLING));
    public static final Block SPEED_APPLE_SAPLING = registerBlock("speed_apple_sapling",
            (settings)-> new SaplingBlock(SpeedAppleSaplingGenerator.SpeedAppleSapling,settings), AbstractBlock.Settings.copyShallow(Blocks.OAK_SAPLING));
    public static final Block HEALTH_BOOST_SAPLING = registerBlock("health_boost_apple_sapling",
            (settings)-> new SaplingBlock(HealthBoostAppleSaplingGenerator.HealthBoostAppleSapling,settings), AbstractBlock.Settings.copyShallow(Blocks.OAK_SAPLING));
    public static final Block FIRE_RESISTANCE_SAPLING = registerBlock("fire_resistance_apple_sapling",
            (settings)-> new SaplingBlock(FireResistanceAppleSaplingGenerator.FireResistanceApple,settings), AbstractBlock.Settings.copyShallow(Blocks.OAK_SAPLING));
    public static final Block HERO_VILLAGE_SAPLING = registerBlock("village_hero_apple_sapling",
            (settings)-> new SaplingBlock(VillageHeroAppleSaplingGenerator.VillageHeroSapling,settings), AbstractBlock.Settings.copyShallow(Blocks.OAK_SAPLING));
    public static final Block STRENGTH_SAPLING = registerBlock("strength_apple_sapling",
            (settings)-> new SaplingBlock(StrengthAppleSaplingGenerator.StrengthAppleSapling,settings), AbstractBlock.Settings.copyShallow(Blocks.OAK_SAPLING));
    public static final Block NIGHT_VISION_SAPLING = registerBlock("night_vision_sapling",
            (settings)-> new SaplingBlock(NightVisionAppleSaplingGenerator.NightVisionAppleSapling,settings), AbstractBlock.Settings.copyShallow(Blocks.OAK_SAPLING));
    public static final Block JUMP_BOOST_SAPLING = registerBlock("jump_boost_sapling",
            (settings)-> new SaplingBlock(JumpBoostAppleSaplingGenerator.JumpBoostAppleSapling,settings), AbstractBlock.Settings.copyShallow(Blocks.OAK_SAPLING));

    //LEAVES
    public static final Block HASTE_APPLE_LEAVES =registerBlock("haste_apple_leave",
            (settings)-> new LeafCropBlock(settings, AppleFoodComponents.HASTE_APPLE), AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED));
    public static final Block SPEED_APPLE_LEAVES =registerBlock("speed_apple_leave",
            (settings)-> new LeafCropBlock(settings, AppleFoodComponents.SPEED_APPLE), AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED));
    public static final Block HEALTH_BOOST_LEAVES =registerBlock("health_boost_leave",
            (settings)-> new LeafCropBlock(settings, AppleFoodComponents.HEALTH_BOOST_APPLE), AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED));
    public static final Block FIRE_RESISTANCE_LEAVES =registerBlock("fire_resistance_leave",
            (settings)-> new LeafCropBlock(settings, AppleFoodComponents.FIRE_RESISTANCE_APPLE), AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED));
    public static final Block HERO_VILLAGE_LEAVES =registerBlock("village_hero_leave",
            (settings)-> new LeafCropBlock(settings, AppleFoodComponents.HERO_VILLAGE_APPLE), AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED));
    public static final Block STRENGTH_LEAVES =registerBlock("strength_apple_leave",
            (settings)-> new LeafCropBlock(settings, AppleFoodComponents.STRENGTH_APPLE), AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED));
    public static final Block NIGHT_VISION_LEAVES =registerBlock("night_vision_leave",
            (settings)-> new LeafCropBlock(settings, AppleFoodComponents.NIGHT_VISION_APPLE), AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED));
    public static final Block JUMP_BOOST_LEAVES =registerBlock("jump_boost_leave",
            (settings)-> new LeafCropBlock(settings, AppleFoodComponents.JUMP_BOOST_APPLE), AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED));
    public static final Block Apple_Tree_LEAVES =registerBlock("apple_tree_leave",
            LeavesBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED));

    //Potted Plant
    public static final Block POTTED_HASTE_APPLE_SAPLING = registerBlockWithoutItem("potted_haste_apple_sapling",
            (settings)-> new FlowerPotBlock(HASTE_APPLE_SAPLING, settings), AbstractBlock.Settings.create().breakInstantly().nonOpaque());
    public static final Block POTTED_SPEED_APPLE_SAPLING = registerBlockWithoutItem("potted_speed_apple_sapling",
            (settings)-> new FlowerPotBlock(SPEED_APPLE_SAPLING, settings), AbstractBlock.Settings.create().breakInstantly().nonOpaque());
    public static final Block POTTED_HEALTH_BOOST_SAPLING = registerBlockWithoutItem("potted_health_boost_apple_sapling",
            (settings)-> new FlowerPotBlock(HEALTH_BOOST_SAPLING, settings), AbstractBlock.Settings.create().breakInstantly().nonOpaque());
    public static final Block POTTED_FIRE_RESISTANCE_SAPLING = registerBlockWithoutItem("potted_fire_resistance_apple_sapling",
            (settings)-> new FlowerPotBlock(FIRE_RESISTANCE_SAPLING, settings), AbstractBlock.Settings.create().breakInstantly().nonOpaque());
    public static final Block POTTED_HERO_VILLAGE_SAPLING = registerBlockWithoutItem("potted_village_hero_apple_sapling",
            (settings)-> new FlowerPotBlock(HERO_VILLAGE_SAPLING, settings), AbstractBlock.Settings.create().breakInstantly().nonOpaque());
    public static final Block POTTED_STRENGTH_SAPLING = registerBlockWithoutItem("potted_strength_apple_sapling",
            (settings)-> new FlowerPotBlock(STRENGTH_SAPLING, settings), AbstractBlock.Settings.create().breakInstantly().nonOpaque());
    public static final Block POTTED_NIGHT_VISION_SAPLING = registerBlockWithoutItem("potted_night_vision_sapling",
            (settings)-> new FlowerPotBlock(NIGHT_VISION_SAPLING, settings), AbstractBlock.Settings.create().breakInstantly().nonOpaque());
    public static final Block POTTED_JUMP_BOOST_SAPLING = registerBlockWithoutItem("potted_jump_boost_sapling",
            (settings)-> new FlowerPotBlock(JUMP_BOOST_SAPLING, settings), AbstractBlock.Settings.create().breakInstantly().nonOpaque());


    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        Block block = (Block)factory.apply(settings.registryKey(keyOf(name)));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, keyOf(name), block);
    }


    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Agree.MOD_ID, name)),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Agree.MOD_ID, name)))));
    }

    private static Block registerBlockWithoutItem(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        Block block = (Block)factory.apply(settings.registryKey(keyOf(name)));
        return Registry.register(Registries.BLOCK, keyOf(name), block);
    }

    private static RegistryKey<Block> keyOf(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Agree.MOD_ID, name));
    }

    public static void registerAgreeBlocks() {
        Logger.getLogger("register mod blocks" + Agree.MOD_ID);
    }
}
