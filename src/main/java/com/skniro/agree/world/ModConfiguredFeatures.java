package com.skniro.agree.world;

import com.google.common.collect.ImmutableList;
import com.skniro.agree.Agree;
import com.skniro.agree.block.Gemstone_ore;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = registryKey("ruby_ore");
    public static final ConfiguredFeature<?, ?> RUBY_ORE = register(Feature.ORE.configure(
                    new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, Gemstone_ore.RUBY_ORE.getDefaultState(), 8))
            .range(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.aboveBottom(80), YOffset.fixed(20))))
            .spreadHorizontally().repeat(6), RUBY_ORE_KEY);

    private static ConfiguredFeature<?, ?> register(ConfiguredFeature<?, ?> configuredFeature,
                                                    RegistryKey<ConfiguredFeature<?, ?>> key) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, key.getValue(), configuredFeature);
    }

    private static RegistryKey<ConfiguredFeature<?, ?>> registryKey(String name) {
        return RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(Agree.MOD_ID, name));
    }

    public static void registerConfiguredFeatures() {
        Agree.LOGGER.debug("Registering the ModConfiguredFeatures for " + Agree.MOD_ID);
    }
}