package com.skniro.agree.world.Tree;

import com.skniro.agree.world.AgreeTreeConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class HealthBoostAppleSaplingGenerator {
    public static final SaplingGenerator HealthBoostAppleSapling =
            new SaplingGenerator("healthboostapplesapling", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(AgreeTreeConfiguredFeatures.HEALTH_BOOST_APPLE_TREE),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());

    }