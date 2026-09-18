package com.skniro.agree.world;

import com.skniro.agree.Agree;
import com.skniro.agree.block.AgreeBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BlockStateProviders;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.random.WeightedList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.BlockReplacement;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.TreeFeature;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class AgreeTreeConfiguredFeatures {
    public static final ResourceKey<Feature> HASTE_APPLE_TREE = registerKey("haste_apple_tree");
    public static final ResourceKey<Feature> SPEED_APPLE_TREE = registerKey("speed_apple_tree");
    public static final ResourceKey<Feature> HEALTH_BOOST_APPLE_TREE = registerKey("health_boost_apple_tree");
    public static final ResourceKey<Feature> FIRE_RESISTANCE_APPLE_TREE = registerKey("fire_resistance_apple_tree");
    public static final ResourceKey<Feature> HERO_VILLAGE_APPLE_TREE = registerKey("village_hero_apple_tree");
    public static final ResourceKey<Feature> STRENGTH_APPLE_TREE = registerKey("strength_apple_tree");
    public static final ResourceKey<Feature> NIGHT_VISION_APPLE_TREE = registerKey("night_vision_apple_tree");
    public static final ResourceKey<Feature> JUMP_BOOST_APPLE_TREE = registerKey("jump_boost_apple_tree");
    public static final ResourceKey<Feature> OVERWORLD_Ruby_ORE = registerKey("overworld_ruby_ore");

    static WeightedList.Builder<BlockState> pool() {
        return WeightedList.builder();
    }

    public static void bootstrap(BootstrapContext<Feature> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endstoneReplaceables = new BlockMatchTest(Blocks.END_STONE);

        List<BlockReplacement> overworldRubyOres = List.of(BlockReplacement.replace(stoneReplaceables,
                        AgreeBlocks.RUBY_ORE.defaultBlockState()),
                BlockReplacement.replace(deepslateReplaceables, AgreeBlocks.DEEPSLATE_RUBY_ORE.defaultBlockState()));

        HolderGetter<BlockStateProvider> blockStateProviders = context.lookup(Registries.BLOCK_STATE_PROVIDER);
        Holder<BlockStateProvider> belowTrunkProvider = blockStateProviders.getOrThrow(BlockStateProviders.SOIL_BENEATH_TREE);
        context.register(HASTE_APPLE_TREE,
                new TreeFeature.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new StraightTrunkPlacer(4, 2, 0),
                        new WeightedStateProvider(pool().add(AgreeBlocks.Apple_Tree_LEAVES.defaultBlockState(), 3).add(AgreeBlocks.HASTE_APPLE_LEAVES.defaultBlockState(), 1)),
                        new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1),
                        belowTrunkProvider).build());
        context.register(SPEED_APPLE_TREE,
                new TreeFeature.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new StraightTrunkPlacer(4, 2, 0),
                        new WeightedStateProvider(pool().add(AgreeBlocks.Apple_Tree_LEAVES.defaultBlockState(), 3).add(AgreeBlocks.SPEED_APPLE_LEAVES.defaultBlockState(), 1)),
                        new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1),
                        belowTrunkProvider).build());
        context.register(FIRE_RESISTANCE_APPLE_TREE,
                new TreeFeature.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new StraightTrunkPlacer(4, 2, 0),
                        new WeightedStateProvider(pool().add(AgreeBlocks.Apple_Tree_LEAVES.defaultBlockState(), 3).add(AgreeBlocks.FIRE_RESISTANCE_LEAVES.defaultBlockState(), 1)),
                        new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1),
                        belowTrunkProvider).build());
        context.register(HERO_VILLAGE_APPLE_TREE,
                new TreeFeature.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new StraightTrunkPlacer(4, 2, 0),
                        new WeightedStateProvider(pool().add(AgreeBlocks.Apple_Tree_LEAVES.defaultBlockState(), 3).add(AgreeBlocks.HERO_VILLAGE_LEAVES.defaultBlockState(), 1)),
                        new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1),
                        belowTrunkProvider).build());
        context.register(STRENGTH_APPLE_TREE,
                new TreeFeature.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new StraightTrunkPlacer(4, 2, 0),
                        new WeightedStateProvider(pool().add(AgreeBlocks.Apple_Tree_LEAVES.defaultBlockState(), 3).add(AgreeBlocks.STRENGTH_LEAVES.defaultBlockState(), 1)),
                        new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1),
                        belowTrunkProvider).build());
        context.register(NIGHT_VISION_APPLE_TREE,
                new TreeFeature.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new StraightTrunkPlacer(4, 2, 0),
                        new WeightedStateProvider(pool().add(AgreeBlocks.Apple_Tree_LEAVES.defaultBlockState(), 3).add(AgreeBlocks.NIGHT_VISION_LEAVES.defaultBlockState(), 1)),
                        new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1),
                        belowTrunkProvider).build());
        context.register(JUMP_BOOST_APPLE_TREE,
                new TreeFeature.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new StraightTrunkPlacer(4, 2, 0),
                        new WeightedStateProvider(pool().add(AgreeBlocks.Apple_Tree_LEAVES.defaultBlockState(), 3).add(AgreeBlocks.JUMP_BOOST_LEAVES.defaultBlockState(), 1)),
                        new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1),
                        belowTrunkProvider).build());
        context.register(HEALTH_BOOST_APPLE_TREE,
                new TreeFeature.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new StraightTrunkPlacer(4, 2, 0),
                        new WeightedStateProvider(pool().add(AgreeBlocks.Apple_Tree_LEAVES.defaultBlockState(), 3).add(AgreeBlocks.HEALTH_BOOST_LEAVES.defaultBlockState(), 1)),
                        new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1),
                        belowTrunkProvider).build());

        context.register(OVERWORLD_Ruby_ORE, new OreFeature(overworldRubyOres, 12));
    }

    public static ResourceKey<Feature> registerKey(String name) {
        return ResourceKey.create(Registries.FEATURE, Identifier.fromNamespaceAndPath(Agree.MOD_ID, name));
    }
}
