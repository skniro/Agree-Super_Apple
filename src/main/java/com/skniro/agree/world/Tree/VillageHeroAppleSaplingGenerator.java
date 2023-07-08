package com.skniro.agree.world.Tree;

import com.skniro.agree.world.AgreeTreeConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class VillageHeroAppleSaplingGenerator extends SaplingGenerator {
        @Nullable
        @Override
        protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
            return AgreeTreeConfiguredFeatures.HERO_VILLAGE_APPLE_TREE;
        }
    }