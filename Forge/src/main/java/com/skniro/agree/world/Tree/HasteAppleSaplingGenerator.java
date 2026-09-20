package com.skniro.agree.world.Tree;

import com.skniro.agree.world.AgreeTreeConfiguredFeatures;

import net.minecraft.util.random.WeightedList;
import net.minecraft.world.level.block.grower.TreeGrower;

public class HasteAppleSaplingGenerator {
    public static final TreeGrower HasteAppleSapling =
            new TreeGrower("hasteapplesapling",
                    WeightedList.of(AgreeTreeConfiguredFeatures.HASTE_APPLE_TREE),
                    WeightedList.of(),
                    WeightedList.of(),
                    AgreeTreeConfiguredFeatures.HASTE_APPLE_TREE);
    }