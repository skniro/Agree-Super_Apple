package com.skniro.agree.block;

import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class Gemstone_ore {
    public static final Block RUBY_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.create().requiresTool().strength(3.0F, 3.0F));
    public static final Block DEEPSLATE_RUBY_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(RUBY_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE));
}
