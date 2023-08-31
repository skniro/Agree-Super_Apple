package com.skniro.agree.world;

import com.skniro.agree.Agree;
import com.skniro.agree.block.AgreeBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class AgreeTreePlacedFeatures {
    public static final ResourceKey<PlacedFeature> HASTE_APPLE_TREE_PLACED = registerKey("haste_apple_tree_placed");
    public static final ResourceKey<PlacedFeature> SPEED_APPLE_TREE_PLACED = registerKey("speed_apple_tree_placed");
    public static final ResourceKey<PlacedFeature> HEALTH_BOOST_APPLE_TREE_PLACED = registerKey("health_boost_apple_tree_placed");
    public static final ResourceKey<PlacedFeature> FIRE_RESISTANCE_APPLE_TREE_PLACED = registerKey("fire_resistance_apple_tree_placed");
    public static final ResourceKey<PlacedFeature> HERO_VILLAGE_APPLE_TREE_PLACED = registerKey("village_hero_apple_tree_placed");
    public static final ResourceKey<PlacedFeature> STRENGTH_APPLE_TREE_PLACED = registerKey("strength_apple_tree_placed");
    public static final ResourceKey<PlacedFeature> NIGHT_VISION_APPLE_TREE_PLACED = registerKey("night_vision_apple_tree_placed");
    public static final ResourceKey<PlacedFeature> JUMP_BOOST_APPLE_TREE_PLACED = registerKey("jump_boost_tree_placed");
    public static final ResourceKey<PlacedFeature> Ruby_PLACED = registerKey("ruby_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, HASTE_APPLE_TREE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(AgreeTreeConfiguredFeatures.HASTE_APPLE_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 2), AgreeBlocks.HASTE_APPLE_SAPLING.get()));
        register(context, SPEED_APPLE_TREE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(AgreeTreeConfiguredFeatures.SPEED_APPLE_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 2), AgreeBlocks.SPEED_APPLE_SAPLING.get()));
        register(context, HEALTH_BOOST_APPLE_TREE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(AgreeTreeConfiguredFeatures.HEALTH_BOOST_APPLE_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 2), AgreeBlocks.HEALTH_BOOST_SAPLING.get()));
        register(context, FIRE_RESISTANCE_APPLE_TREE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(AgreeTreeConfiguredFeatures.FIRE_RESISTANCE_APPLE_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 2), AgreeBlocks.FIRE_RESISTANCE_SAPLING.get()));
        register(context, HERO_VILLAGE_APPLE_TREE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(AgreeTreeConfiguredFeatures.HERO_VILLAGE_APPLE_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 2), AgreeBlocks.HERO_VILLAGE_SAPLING.get()));
        register(context, STRENGTH_APPLE_TREE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(AgreeTreeConfiguredFeatures.STRENGTH_APPLE_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 2), AgreeBlocks.STRENGTH_SAPLING.get()));
        register(context, NIGHT_VISION_APPLE_TREE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(AgreeTreeConfiguredFeatures.NIGHT_VISION_APPLE_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 2), AgreeBlocks.NIGHT_VISION_SAPLING.get()));
        register(context, JUMP_BOOST_APPLE_TREE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(AgreeTreeConfiguredFeatures.JUMP_BOOST_APPLE_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 2), AgreeBlocks.JUMP_BOOST_SAPLING.get()));
        register(context, Ruby_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(AgreeTreeConfiguredFeatures.OVERWORLD_Ruby_ORE),
                OreBiomeModifications.modifiersWithCount(16, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(80))));

    }

    public static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(Agree.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}