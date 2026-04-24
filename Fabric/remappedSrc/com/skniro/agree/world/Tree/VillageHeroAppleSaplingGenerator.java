package com.skniro.agree.world.Tree;

import com.skniro.agree.world.AgreeTreeConfiguredFeatures;
import java.util.Optional;
import net.minecraft.world.level.block.grower.TreeGrower;

public class VillageHeroAppleSaplingGenerator {
    public static final TreeGrower VillageHeroSapling =
            new TreeGrower("villageheroapplesapling", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(AgreeTreeConfiguredFeatures.HERO_VILLAGE_APPLE_TREE),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());
    }