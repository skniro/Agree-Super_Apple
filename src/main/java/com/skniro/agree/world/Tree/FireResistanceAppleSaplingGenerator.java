package com.skniro.agree.world.Tree;

import com.skniro.agree.world.AgreeTreeConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class FireResistanceAppleSaplingGenerator {
    public static final TreeGrower FireResistanceApple =
            new TreeGrower("fireresistanceapplesapling", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(AgreeTreeConfiguredFeatures.FIRE_RESISTANCE_APPLE_TREE),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());
}