package com.skniro.agree.block;

import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;

public class Gemstone_Block {
    public static final Block RUBY_BLOCK =new Block(AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL));
}
