package com.skniro.agree.world;

import com.skniro.agree.Agree;
import com.skniro.agree.block.AgreeBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class AgreeTreeConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> HASTE_APPLE_TREE = registerKey("haste_apple_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SPEED_APPLE_TREE = registerKey("speed_apple_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HEALTH_BOOST_APPLE_TREE = registerKey("health_boost_apple_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FIRE_RESISTANCE_APPLE_TREE = registerKey("fire_resistance_apple_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HERO_VILLAGE_APPLE_TREE = registerKey("village_hero_apple_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> STRENGTH_APPLE_TREE = registerKey("strength_apple_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NIGHT_VISION_APPLE_TREE = registerKey("night_vision_apple_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> JUMP_BOOST_APPLE_TREE = registerKey("jump_boost_apple_tree");

    static DataPool.Builder<BlockState> pool() {
        return DataPool.builder();
    }

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {
        register(featureRegisterable, HASTE_APPLE_TREE, Feature.TREE,
                new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.OAK_LOG),
                new StraightTrunkPlacer(4, 2, 0),
                new WeightedBlockStateProvider(pool().add(AgreeBlocks.Apple_Tree_LEAVES.getDefaultState(), 3).add(AgreeBlocks.HASTE_APPLE_LEAVES.getDefaultState(), 1)),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());
        register(featureRegisterable, SPEED_APPLE_TREE, Feature.TREE,
                new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new StraightTrunkPlacer(4, 2, 0),
                        new WeightedBlockStateProvider(pool().add(AgreeBlocks.Apple_Tree_LEAVES.getDefaultState(), 3).add(AgreeBlocks.SPEED_APPLE_LEAVES.getDefaultState(), 1)),
                        new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1)).build());
        register(featureRegisterable, FIRE_RESISTANCE_APPLE_TREE, Feature.TREE,
                new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new StraightTrunkPlacer(4, 2, 0),
                        new WeightedBlockStateProvider(pool().add(AgreeBlocks.Apple_Tree_LEAVES.getDefaultState(), 3).add(AgreeBlocks.FIRE_RESISTANCE_LEAVES.getDefaultState(), 1)),
                        new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1)).build());
        register(featureRegisterable, HERO_VILLAGE_APPLE_TREE, Feature.TREE,
                new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new StraightTrunkPlacer(4, 2, 0),
                        new WeightedBlockStateProvider(pool().add(AgreeBlocks.Apple_Tree_LEAVES.getDefaultState(), 3).add(AgreeBlocks.HERO_VILLAGE_LEAVES.getDefaultState(), 1)),
                        new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1)).build());
        register(featureRegisterable, STRENGTH_APPLE_TREE, Feature.TREE,
                new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new StraightTrunkPlacer(4, 2, 0),
                        new WeightedBlockStateProvider(pool().add(AgreeBlocks.Apple_Tree_LEAVES.getDefaultState(), 3).add(AgreeBlocks.STRENGTH_LEAVES.getDefaultState(), 1)),
                        new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1)).build());
        register(featureRegisterable, NIGHT_VISION_APPLE_TREE, Feature.TREE,
                new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new StraightTrunkPlacer(4, 2, 0),
                        new WeightedBlockStateProvider(pool().add(AgreeBlocks.Apple_Tree_LEAVES.getDefaultState(), 3).add(AgreeBlocks.NIGHT_VISION_LEAVES.getDefaultState(), 1)),
                        new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1)).build());
        register(featureRegisterable, JUMP_BOOST_APPLE_TREE, Feature.TREE,
                new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new StraightTrunkPlacer(4, 2, 0),
                        new WeightedBlockStateProvider(pool().add(AgreeBlocks.Apple_Tree_LEAVES.getDefaultState(), 3).add(AgreeBlocks.JUMP_BOOST_LEAVES.getDefaultState(), 1)),
                        new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1)).build());
        register(featureRegisterable, HEALTH_BOOST_APPLE_TREE, Feature.TREE,
                new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new StraightTrunkPlacer(4, 2, 0),
                        new WeightedBlockStateProvider(pool().add(AgreeBlocks.Apple_Tree_LEAVES.getDefaultState(), 3).add(AgreeBlocks.HEALTH_BOOST_LEAVES.getDefaultState(), 1)),
                        new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1)).build());
    }




    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Agree.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
