package com.skniro.agree.block;

import com.skniro.agree.Agree;
import com.skniro.agree.block.init.LeafCropBlock;
import com.skniro.agree.item.Apples.AppleFoodComponents;
import com.skniro.agree.world.Tree.AppleSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class AgreeBlocks {
    public static final Block RUBY_BLOCK =new Block(AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL));


    //SAPLING
    public static final Block HASTE_APPLE_SAPLING = registerBlock("haste_apple_sapling",new SaplingBlock(new AppleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), Agree.Agree_Group);


    //LEAVES
    public static final Block HASTE_APPLE_LEAVES =registerBlock("haste_apple_leave",
            new LeafCropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED), AppleFoodComponents.HASTE_APPLE),Agree.Agree_Group);



    private static Block registerBlock(String name, Block block, RegistryKey<ItemGroup> tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registries.BLOCK, new Identifier(Agree.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, RegistryKey<ItemGroup> tab) {
        return Registry.register(Registries.ITEM, new Identifier(Agree.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
}
