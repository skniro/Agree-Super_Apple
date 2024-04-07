package com.skniro.agree.conifg;


import net.neoforged.fml.config.IConfigSpec;
import net.neoforged.neoforge.common.ModConfigSpec;

public class AgreeConfig {
    public static final ModConfigSpec GENERAL_SPEC;

    static {
        ModConfigSpec.Builder configBuilder = new ModConfigSpec.Builder();
        setupConfig(configBuilder);
        GENERAL_SPEC = configBuilder.build();
    }

    public static ModConfigSpec.BooleanValue Enchantment_Module;
    private static void setupConfig(ModConfigSpec.Builder builder) {
        Enchantment_Module = builder.comment("Disable Enchantment Module.")
                .define("Enable Enchantment Module",true);

    }

}
