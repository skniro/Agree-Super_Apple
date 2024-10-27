package com.skniro.agree.world.Tree;

import com.skniro.agree.world.AgreeTreeConfiguredFeatures;
import java.util.Optional;
import net.minecraft.world.level.block.grower.TreeGrower;

public class HealthBoostAppleSaplingGenerator {
    public static final TreeGrower HealthBoostAppleSapling =
            new TreeGrower("healthboostapplesapling", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(AgreeTreeConfiguredFeatures.HEALTH_BOOST_APPLE_TREE),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());

    }