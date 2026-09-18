package com.skniro.agree.world.Tree;

import com.skniro.agree.world.AgreeTreeConfiguredFeatures;
import java.util.Optional;

import net.minecraft.util.random.WeightedList;
import net.minecraft.world.level.block.grower.TreeGrower;

public class VillageHeroAppleSaplingGenerator {
    public static final TreeGrower VillageHeroSapling =
            new TreeGrower("villageheroapplesapling",
                    WeightedList.of(AgreeTreeConfiguredFeatures.HERO_VILLAGE_APPLE_TREE),
                    WeightedList.of(),
                    WeightedList.of(),
                    AgreeTreeConfiguredFeatures.HERO_VILLAGE_APPLE_TREE);
    }