package com.skniro.agree.world.Tree;

import com.skniro.agree.world.AgreeTreeConfiguredFeatures;

import net.minecraft.util.random.WeightedList;
import net.minecraft.world.level.block.grower.TreeGrower;

public class JumpBoostAppleSaplingGenerator {
    public static final TreeGrower JumpBoostAppleSapling =
            new TreeGrower("jumpboostapplesapling",
                    WeightedList.of(AgreeTreeConfiguredFeatures.JUMP_BOOST_APPLE_TREE),
                    WeightedList.of(),
                    WeightedList.of(),
                    AgreeTreeConfiguredFeatures.JUMP_BOOST_APPLE_TREE);
    }