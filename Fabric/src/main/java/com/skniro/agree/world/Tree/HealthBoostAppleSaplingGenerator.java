package com.skniro.agree.world.Tree;

import com.skniro.agree.world.AgreeTreeConfiguredFeatures;
import java.util.Optional;

import net.minecraft.util.random.WeightedList;
import net.minecraft.world.level.block.grower.TreeGrower;

public class HealthBoostAppleSaplingGenerator {
    public static final TreeGrower HealthBoostAppleSapling =
            new TreeGrower("healthboostapplesapling",
                    WeightedList.of(AgreeTreeConfiguredFeatures.HEALTH_BOOST_APPLE_TREE),
                    WeightedList.of(),
                    WeightedList.of(),
                    AgreeTreeConfiguredFeatures.HEALTH_BOOST_APPLE_TREE);
    }