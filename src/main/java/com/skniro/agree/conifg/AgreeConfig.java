package com.skniro.agree.conifg;

import net.minecraftforge.common.ForgeConfigSpec;

public class AgreeConfig {
    public static final ForgeConfigSpec GENERAL_SPEC;

    static {
        ForgeConfigSpec.Builder configBuilder = new ForgeConfigSpec.Builder();
        setupConfig(configBuilder);
        GENERAL_SPEC = configBuilder.build();
    }

    public static ForgeConfigSpec.BooleanValue Enchantment_Module;
    private static void setupConfig(ForgeConfigSpec.Builder builder) {
        Enchantment_Module = builder.comment("Disable Enchantment Module.")
                .define("Enable Enchantment Module",true);

    }

}
