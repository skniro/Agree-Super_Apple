package com.skniro.agree.world;

import com.skniro.agree.Agree;
import com.skniro.agree.block.Gemstone_ore;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.decorator.ConfiguredDecorator;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = registryKey("ruby_ore");
    public static final ConfiguredFeature<?, ?> RUBY_ORE = register(Feature.ORE.configure(
                    new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, Gemstone_ore.RUBY_ORE.getDefaultState(), 8))
            .decorate(Decorators.RUBY_ORE)
            .spreadHorizontally().repeat(6), RUBY_ORE_KEY);

    private static ConfiguredFeature<?, ?> register(ConfiguredFeature<?, ?> configuredFeature,
                                                    RegistryKey<ConfiguredFeature<?, ?>> key) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, key.getValue(), configuredFeature);
    }

    private static RegistryKey<ConfiguredFeature<?, ?>> registryKey(String name) {
        return RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(Agree.MOD_ID, name));
    }

    public static void registerConfiguredFeatures() {
        Agree.LOGGER.debug("Registering the ModConfiguredFeatures for " + Agree.MOD_ID);
    }
    public static final class Decorators {
        public static final ConfiguredDecorator<RangeDecoratorConfig> RUBY_ORE = Decorator.RANGE.configure(new RangeDecoratorConfig(20, 80, 128));

    }
}