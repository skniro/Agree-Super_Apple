package com.skniro.agree.block;

import com.skniro.agree.Agree;
import com.skniro.agree.block.init.LeafCropBlock;
import com.skniro.agree.item.AgreeItems;
import com.skniro.agree.item.Apples.AppleFoodComponents;
import com.skniro.agree.world.Tree.*;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class AgreeBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Agree.MOD_ID);

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL)));


    //SAPLING
    public static final RegistryObject<Block> HASTE_APPLE_SAPLING = registerBlock("haste_apple_sapling",
            new SaplingBlock(new HasteAppleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), Agree.Agree_Group);
    public static final RegistryObject<Block> SPEED_APPLE_SAPLING = registerBlock("speed_apple_sapling",new SaplingBlock(new SpeedAppleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), Agree.Agree_Group);
    public static final RegistryObject<Block> HEALTH_BOOST_SAPLING = registerBlock("health_boost_apple_sapling",new SaplingBlock(new HealthBoostAppleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), Agree.Agree_Group);
    public static final RegistryObject<Block> FIRE_RESISTANCE_SAPLING = registerBlock("fire_resistance_apple_sapling",new SaplingBlock(new FireResistanceAppleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), Agree.Agree_Group);
    public static final RegistryObject<Block> HERO_VILLAGE_SAPLING = registerBlock("village_hero_apple_sapling",new SaplingBlock(new VillageHeroAppleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), Agree.Agree_Group);
    public static final RegistryObject<Block> STRENGTH_SAPLING = registerBlock("strength_apple_sapling",new SaplingBlock(new StrengthAppleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), Agree.Agree_Group);
    public static final RegistryObject<Block> NIGHT_VISION_SAPLING = registerBlock("night_vision_sapling",new SaplingBlock(new NightVisionAppleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), Agree.Agree_Group);
    public static final RegistryObject<Block> JUMP_BOOST_SAPLING = registerBlock("jump_boost_sapling",new SaplingBlock(new JumpBoostAppleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), Agree.Agree_Group);

    //LEAVES
    public static final RegistryObject<Block> HASTE_APPLE_LEAVES =registerBlock("haste_apple_leave",
            new LeafCropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED), AppleFoodComponents.HASTE_APPLE),Agree.Agree_Group);
    public static final RegistryObject<Block> SPEED_APPLE_LEAVES =registerBlock("speed_apple_leave",
            new LeafCropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED), AppleFoodComponents.SPEED_APPLE),Agree.Agree_Group);
    public static final RegistryObject<Block> HEALTH_BOOST_LEAVES =registerBlock("health_boost_leave",
            new LeafCropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED), AppleFoodComponents.HEALTH_BOOST_APPLE),Agree.Agree_Group);
    public static final RegistryObject<Block> FIRE_RESISTANCE_LEAVES =registerBlock("fire_resistance_leave",
            new LeafCropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED), AppleFoodComponents.FIRE_RESISTANCE_APPLE),Agree.Agree_Group);
    public static final RegistryObject<Block> HERO_VILLAGE_LEAVES =registerBlock("village_hero_leave",
            new LeafCropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED), AppleFoodComponents.HERO_VILLAGE_APPLE),Agree.Agree_Group);
    public static final RegistryObject<Block> STRENGTH_LEAVES =registerBlock("strength_apple_leave",
            new LeafCropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED), AppleFoodComponents.STRENGTH_APPLE),Agree.Agree_Group);
    public static final RegistryObject<Block> NIGHT_VISION_LEAVES =registerBlock("night_vision_leave",
            new LeafCropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED), AppleFoodComponents.NIGHT_VISION_APPLE),Agree.Agree_Group);
    public static final RegistryObject<Block> JUMP_BOOST_LEAVES =registerBlock("jump_boost_leave",
            new LeafCropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED), AppleFoodComponents.JUMP_BOOST_APPLE),Agree.Agree_Group);
    public static final RegistryObject<Block> Apple_Tree_LEAVES =registerBlock("apple_tree_leave",
            new LeavesBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED)),Agree.Agree_Group);

    //Potted Plant
    public static final RegistryObject<Block> POTTED_HASTE_APPLE_SAPLING = registerBlockWithoutItem("potted_haste_apple_sapling",
            new FlowerPotBlock(HASTE_APPLE_SAPLING, AbstractBlock.Settings.create().breakInstantly().nonOpaque()));
    public static final RegistryObject<Block> POTTED_SPEED_APPLE_SAPLING = registerBlockWithoutItem("potted_speed_apple_sapling",
            new FlowerPotBlock(SPEED_APPLE_SAPLING, AbstractBlock.Settings.create().breakInstantly().nonOpaque()));
    public static final RegistryObject<Block> POTTED_HEALTH_BOOST_SAPLING = registerBlockWithoutItem("potted_health_boost_apple_sapling",
            new FlowerPotBlock(HEALTH_BOOST_SAPLING, AbstractBlock.Settings.create().breakInstantly().nonOpaque()));
    public static final RegistryObject<Block> POTTED_FIRE_RESISTANCE_SAPLING = registerBlockWithoutItem("potted_fire_resistance_apple_sapling",
            new FlowerPotBlock(FIRE_RESISTANCE_SAPLING, AbstractBlock.Settings.create().breakInstantly().nonOpaque()));
    public static final RegistryObject<Block> POTTED_HERO_VILLAGE_SAPLING = registerBlockWithoutItem("potted_village_hero_apple_sapling",
            new FlowerPotBlock(HERO_VILLAGE_SAPLING, AbstractBlock.Settings.create().breakInstantly().nonOpaque()));
    public static final RegistryObject<Block> POTTED_STRENGTH_SAPLING = registerBlockWithoutItem("potted_strength_apple_sapling",
            new FlowerPotBlock(STRENGTH_SAPLING, AbstractBlock.Settings.create().breakInstantly().nonOpaque()));
    public static final RegistryObject<Block> POTTED_NIGHT_VISION_SAPLING = registerBlockWithoutItem("potted_night_vision_sapling",
            new FlowerPotBlock(NIGHT_VISION_SAPLING, AbstractBlock.Settings.create().breakInstantly().nonOpaque()));
    public static final RegistryObject<Block> POTTED_JUMP_BOOST_SAPLING = registerBlockWithoutItem("potted_jump_boost_sapling",
            new FlowerPotBlock(JUMP_BOOST_SAPLING, AbstractBlock.Settings.create().breakInstantly().nonOpaque()));


    private static <T extends Block> RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, RegistryObject<CreativeModeTab> tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, RegistryObject<CreativeModeTab> tab) {
        return AgreeItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void registerAgreeBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
