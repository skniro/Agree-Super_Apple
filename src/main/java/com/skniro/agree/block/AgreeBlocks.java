package com.skniro.agree.block;

import com.skniro.agree.Agree;
import com.skniro.agree.block.init.LeafCropBlock;
import com.skniro.agree.item.Apples.AppleFoodComponents;
import com.skniro.agree.world.Tree.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class AgreeBlocks {
    public static final Block RUBY_BLOCK =new Block(AbstractBlock.Settings.of(Material.METAL).mapColor(MapColor.DARK_RED).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.WOOD));


    //SAPLING
    public static final Block HASTE_APPLE_SAPLING = registerBlock("haste_apple_sapling",new SaplingBlock(new HasteAppleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block SPEED_APPLE_SAPLING = registerBlock("speed_apple_sapling",new SaplingBlock(new SpeedAppleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block HEALTH_BOOST_SAPLING = registerBlock("health_boost_apple_sapling",new SaplingBlock(new HealthBoostAppleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block FIRE_RESISTANCE_SAPLING = registerBlock("fire_resistance_apple_sapling",new SaplingBlock(new FireResistanceAppleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block HERO_VILLAGE_SAPLING = registerBlock("village_hero_apple_sapling",new SaplingBlock(new VillageHeroAppleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block STRENGTH_SAPLING = registerBlock("strength_apple_sapling",new SaplingBlock(new StrengthAppleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block NIGHT_VISION_SAPLING = registerBlock("night_vision_sapling",new SaplingBlock(new NightVisionAppleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block JUMP_BOOST_SAPLING = registerBlock("jump_boost_sapling",new SaplingBlock(new JumpBoostAppleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));

    //LEAVES
    public static final Block HASTE_APPLE_LEAVES =registerBlock("haste_apple_leave",
            new LeafCropBlock(AbstractBlock.Settings.of(Material.WOOD).mapColor(MapColor.DARK_RED), AppleFoodComponents.HASTE_APPLE));
    public static final Block SPEED_APPLE_LEAVES =registerBlock("speed_apple_leave",
            new LeafCropBlock(AbstractBlock.Settings.of(Material.WOOD).mapColor(MapColor.DARK_RED), AppleFoodComponents.SPEED_APPLE));
    public static final Block HEALTH_BOOST_LEAVES =registerBlock("health_boost_leave",
            new LeafCropBlock(AbstractBlock.Settings.of(Material.WOOD).mapColor(MapColor.DARK_RED), AppleFoodComponents.HEALTH_BOOST_APPLE));
    public static final Block FIRE_RESISTANCE_LEAVES =registerBlock("fire_resistance_leave",
            new LeafCropBlock(AbstractBlock.Settings.of(Material.WOOD).mapColor(MapColor.DARK_RED), AppleFoodComponents.FIRE_RESISTANCE_APPLE));
    public static final Block HERO_VILLAGE_LEAVES =registerBlock("village_hero_leave",
            new LeafCropBlock(AbstractBlock.Settings.of(Material.WOOD).mapColor(MapColor.DARK_RED), AppleFoodComponents.HERO_VILLAGE_APPLE));
    public static final Block STRENGTH_LEAVES =registerBlock("strength_apple_leave",
            new LeafCropBlock(AbstractBlock.Settings.of(Material.WOOD).mapColor(MapColor.DARK_RED), AppleFoodComponents.STRENGTH_APPLE));
    public static final Block NIGHT_VISION_LEAVES =registerBlock("night_vision_leave",
            new LeafCropBlock(AbstractBlock.Settings.of(Material.WOOD).mapColor(MapColor.DARK_RED), AppleFoodComponents.NIGHT_VISION_APPLE));
    public static final Block JUMP_BOOST_LEAVES =registerBlock("jump_boost_leave",
            new LeafCropBlock(AbstractBlock.Settings.of(Material.WOOD).mapColor(MapColor.DARK_RED), AppleFoodComponents.JUMP_BOOST_APPLE));
    public static final Block Apple_Tree_LEAVES =registerBlock("apple_tree_leave",
            new LeavesBlock(AbstractBlock.Settings.of(Material.WOOD).mapColor(MapColor.DARK_RED)));

    //Potted Plant
    public static final Block POTTED_HASTE_APPLE_SAPLING = registerBlockWithoutItem("potted_haste_apple_sapling",
            new FlowerPotBlock(HASTE_APPLE_SAPLING, AbstractBlock.Settings.of(Material.WOOD).breakInstantly().nonOpaque()));
    public static final Block POTTED_SPEED_APPLE_SAPLING = registerBlockWithoutItem("potted_speed_apple_sapling",
            new FlowerPotBlock(SPEED_APPLE_SAPLING, AbstractBlock.Settings.of(Material.WOOD).breakInstantly().nonOpaque()));
    public static final Block POTTED_HEALTH_BOOST_SAPLING = registerBlockWithoutItem("potted_health_boost_apple_sapling",
            new FlowerPotBlock(HEALTH_BOOST_SAPLING, AbstractBlock.Settings.of(Material.WOOD).breakInstantly().nonOpaque()));
    public static final Block POTTED_FIRE_RESISTANCE_SAPLING = registerBlockWithoutItem("potted_fire_resistance_apple_sapling",
            new FlowerPotBlock(FIRE_RESISTANCE_SAPLING, AbstractBlock.Settings.of(Material.WOOD).breakInstantly().nonOpaque()));
    public static final Block POTTED_HERO_VILLAGE_SAPLING = registerBlockWithoutItem("potted_village_hero_apple_sapling",
            new FlowerPotBlock(HERO_VILLAGE_SAPLING, AbstractBlock.Settings.of(Material.WOOD).breakInstantly().nonOpaque()));
    public static final Block POTTED_STRENGTH_SAPLING = registerBlockWithoutItem("potted_strength_apple_sapling",
            new FlowerPotBlock(STRENGTH_SAPLING, AbstractBlock.Settings.of(Material.WOOD).breakInstantly().nonOpaque()));
    public static final Block POTTED_NIGHT_VISION_SAPLING = registerBlockWithoutItem("potted_night_vision_sapling",
            new FlowerPotBlock(NIGHT_VISION_SAPLING, AbstractBlock.Settings.of(Material.WOOD).breakInstantly().nonOpaque()));
    public static final Block POTTED_JUMP_BOOST_SAPLING = registerBlockWithoutItem("potted_jump_boost_sapling",
            new FlowerPotBlock(JUMP_BOOST_SAPLING, AbstractBlock.Settings.of(Material.WOOD).breakInstantly().nonOpaque()));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Agree.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Agree.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(Agree.MOD_ID, name), block);
    }
}
