package com.skniro.agree.world;

import com.skniro.agree.Agree;
import com.skniro.agree.block.AgreeBlocks;
import com.skniro.agree.block.Gemstone_ore;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
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
    public static final ResourceKey<ConfiguredFeature<?, ?>> HASTE_APPLE_TREE = registerKey("haste_apple_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SPEED_APPLE_TREE = registerKey("speed_apple_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HEALTH_BOOST_APPLE_TREE = registerKey("health_boost_apple_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FIRE_RESISTANCE_APPLE_TREE = registerKey("fire_resistance_apple_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HERO_VILLAGE_APPLE_TREE = registerKey("village_hero_apple_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> STRENGTH_APPLE_TREE = registerKey("strength_apple_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NIGHT_VISION_APPLE_TREE = registerKey("night_vision_apple_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> JUMP_BOOST_APPLE_TREE = registerKey("jump_boost_apple_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_Ruby_ORE = registerKey("overworld_ruby_ore");
    static SimpleWeightedRandomList.Builder<BlockState> pool() {
        return SimpleWeightedRandomList.builder();
    }

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> featureRegisterable) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endstoneReplaceables = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> overworldRubyOres = List.of(OreConfiguration.target(stoneReplaceables,
                        Gemstone_ore.RUBY_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, Gemstone_ore.DEEPSLATE_RUBY_ORE.get().defaultBlockState()));

        register(featureRegisterable, HASTE_APPLE_TREE, Feature.TREE,
                new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.OAK_LOG),
                new StraightTrunkPlacer(4, 2, 0),
                new WeightedStateProvider(pool().add(AgreeBlocks.Apple_Tree_LEAVES.get().defaultBlockState(), 3).add(AgreeBlocks.HASTE_APPLE_LEAVES.get().defaultBlockState(), 1)),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());
        register(featureRegisterable, SPEED_APPLE_TREE, Feature.TREE,
                new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(Blocks.OAK_LOG),
                        new StraightTrunkPlacer(4, 2, 0),
                        new WeightedStateProvider(pool().add(AgreeBlocks.Apple_Tree_LEAVES.get().defaultBlockState(), 3).add(AgreeBlocks.SPEED_APPLE_LEAVES.get().defaultBlockState(), 1)),
                        new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1)).build());
        register(featureRegisterable, FIRE_RESISTANCE_APPLE_TREE, Feature.TREE,
                new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(Blocks.OAK_LOG),
                        new StraightTrunkPlacer(4, 2, 0),
                        new WeightedStateProvider(pool().add(AgreeBlocks.Apple_Tree_LEAVES.get().defaultBlockState(), 3).add(AgreeBlocks.FIRE_RESISTANCE_LEAVES.get().defaultBlockState(), 1)),
                        new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1)).build());
        register(featureRegisterable, HERO_VILLAGE_APPLE_TREE, Feature.TREE,
                new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(Blocks.OAK_LOG),
                        new StraightTrunkPlacer(4, 2, 0),
                        new WeightedStateProvider(pool().add(AgreeBlocks.Apple_Tree_LEAVES.get().defaultBlockState(), 3).add(AgreeBlocks.HERO_VILLAGE_LEAVES.get().defaultBlockState(), 1)),
                        new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1)).build());
        register(featureRegisterable, STRENGTH_APPLE_TREE, Feature.TREE,
                new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(Blocks.OAK_LOG),
                        new StraightTrunkPlacer(4, 2, 0),
                        new WeightedStateProvider(pool().add(AgreeBlocks.Apple_Tree_LEAVES.get().defaultBlockState(), 3).add(AgreeBlocks.STRENGTH_LEAVES.get().defaultBlockState(), 1)),
                        new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1)).build());
        register(featureRegisterable, NIGHT_VISION_APPLE_TREE, Feature.TREE,
                new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(Blocks.OAK_LOG),
                        new StraightTrunkPlacer(4, 2, 0),
                        new WeightedStateProvider(pool().add(AgreeBlocks.Apple_Tree_LEAVES.get().defaultBlockState(), 3).add(AgreeBlocks.NIGHT_VISION_LEAVES.get().defaultBlockState(), 1)),
                        new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1)).build());
        register(featureRegisterable, JUMP_BOOST_APPLE_TREE, Feature.TREE,
                new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(Blocks.OAK_LOG),
                        new StraightTrunkPlacer(4, 2, 0),
                        new WeightedStateProvider(pool().add(AgreeBlocks.Apple_Tree_LEAVES.get().defaultBlockState(), 3).add(AgreeBlocks.JUMP_BOOST_LEAVES.get().defaultBlockState(), 1)),
                        new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1)).build());
        register(featureRegisterable, HEALTH_BOOST_APPLE_TREE, Feature.TREE,
                new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(Blocks.OAK_LOG),
                        new StraightTrunkPlacer(4, 2, 0),
                        new WeightedStateProvider(pool().add(AgreeBlocks.Apple_Tree_LEAVES.get().defaultBlockState(), 3).add(AgreeBlocks.HEALTH_BOOST_LEAVES.get().defaultBlockState(), 1)),
                        new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1)).build());

        register(featureRegisterable, OVERWORLD_Ruby_ORE, Feature.ORE, new OreConfiguration(overworldRubyOres, 12));
    }




    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Agree.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
