package com.skniro.agree.world.Tree;

import com.skniro.agree.world.AgreeTreeConfiguredFeatures;
import java.util.Optional;

import net.minecraft.util.random.WeightedList;
import net.minecraft.world.level.block.grower.TreeGrower;

public class FireResistanceAppleSaplingGenerator {
    public static final TreeGrower FireResistanceApple =
            new TreeGrower("fireresistanceapplesapling",
                    WeightedList.of(AgreeTreeConfiguredFeatures.FIRE_RESISTANCE_APPLE_TREE),
                    WeightedList.of(),
                    WeightedList.of(),
                    AgreeTreeConfiguredFeatures.FIRE_RESISTANCE_APPLE_TREE);
    }