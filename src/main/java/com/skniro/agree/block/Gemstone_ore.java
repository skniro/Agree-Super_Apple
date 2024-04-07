package com.skniro.agree.block;

import com.skniro.agree.Agree;
import com.skniro.agree.item.AgreeItems;
import com.skniro.agree.item.ModCreativeModeTabs;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class Gemstone_ore {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BuiltInRegistries.BLOCK, Agree.MOD_ID);

    public static final Supplier<Block> RUBY_ORE = registerBlock("ruby_ore",
            ()-> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 3.0F)), ModCreativeModeTabs.Agree_Group);
    public static final Supplier<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            ()-> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(RUBY_ORE.get()).mapColor(MapColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)), ModCreativeModeTabs.Agree_Group);

    private static <T extends Block> Supplier<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        Supplier<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    private static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block, Supplier<CreativeModeTab> tab) {
        Supplier<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> Supplier<Item> registerBlockItem(String name, Supplier<T> block, Supplier<CreativeModeTab> tab) {
        return AgreeItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void registerAgreeBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}



