package com.skniro.agree.block;

import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class Gemstone_ore {
    public static final Block RUBY_ORE = new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F), UniformIntProvider.create(3, 7));
    public static final Block DEEPSLATE_RUBY_ORE = new OreBlock(AbstractBlock.Settings.copy(RUBY_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7));
}
