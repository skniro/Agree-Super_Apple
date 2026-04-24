package com.skniro.agree.world.Tree;

import com.skniro.agree.world.AgreeTreeConfiguredFeatures;
import java.util.Optional;
import net.minecraft.world.level.block.grower.TreeGrower;

public class StrengthAppleSaplingGenerator {
    public static final TreeGrower StrengthAppleSapling =
            new TreeGrower("strengtapplesapling", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(AgreeTreeConfiguredFeatures.STRENGTH_APPLE_TREE),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());
    }