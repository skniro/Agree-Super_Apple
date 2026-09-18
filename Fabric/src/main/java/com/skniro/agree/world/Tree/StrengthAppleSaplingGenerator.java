package com.skniro.agree.world.Tree;

import com.skniro.agree.world.AgreeTreeConfiguredFeatures;
import java.util.Optional;

import net.minecraft.util.random.WeightedList;
import net.minecraft.world.level.block.grower.TreeGrower;

public class StrengthAppleSaplingGenerator {
    public static final TreeGrower StrengthAppleSapling =
            new TreeGrower("strengtapplesapling",
                    WeightedList.of(AgreeTreeConfiguredFeatures.STRENGTH_APPLE_TREE),
                    WeightedList.of(),
                    WeightedList.of(),
                    AgreeTreeConfiguredFeatures.STRENGTH_APPLE_TREE);
    }