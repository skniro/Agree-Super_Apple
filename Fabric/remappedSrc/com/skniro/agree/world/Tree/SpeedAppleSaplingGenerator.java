package com.skniro.agree.world.Tree;

import com.skniro.agree.world.AgreeTreeConfiguredFeatures;
import java.util.Optional;
import net.minecraft.world.level.block.grower.TreeGrower;

public class SpeedAppleSaplingGenerator {
    public static final TreeGrower SpeedAppleSapling =
            new TreeGrower("speedapplesapling", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(AgreeTreeConfiguredFeatures.SPEED_APPLE_TREE),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());
    }