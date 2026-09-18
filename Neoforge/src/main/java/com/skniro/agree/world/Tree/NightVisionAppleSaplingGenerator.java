package com.skniro.agree.world.Tree;

import com.skniro.agree.world.AgreeTreeConfiguredFeatures;

import net.minecraft.util.random.WeightedList;
import net.minecraft.world.level.block.grower.TreeGrower;

public class NightVisionAppleSaplingGenerator {
    public static final TreeGrower NightVisionAppleSapling =
            new TreeGrower("nightvisionapplesapling",
                    WeightedList.of(AgreeTreeConfiguredFeatures.NIGHT_VISION_APPLE_TREE),
                    WeightedList.of(),
                    WeightedList.of(),
                    AgreeTreeConfiguredFeatures.NIGHT_VISION_APPLE_TREE);
    }