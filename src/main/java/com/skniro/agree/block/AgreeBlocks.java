package com.skniro.agree.block;

import com.skniro.agree.Agree;
import com.skniro.agree.block.init.LeafCropBlock;
import com.skniro.agree.item.AgreeItems;
import com.skniro.agree.item.Apples.AppleFoodComponents;
import com.skniro.agree.item.ModCreativeModeTabs;
import com.skniro.agree.world.Tree.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.*;

import java.util.function.Supplier;

public class AgreeBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Agree.MOD_ID);

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            ()-> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_RED).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)),ModCreativeModeTabs.Agree_Group);


    //SAPLING
    public static final RegistryObject<Block> HASTE_APPLE_SAPLING = registerBlock("haste_apple_sapling",
            ()-> new SaplingBlock(HasteAppleSaplingGenerator.HasteAppleSapling, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)), ModCreativeModeTabs.Agree_Group);
    public static final RegistryObject<Block> SPEED_APPLE_SAPLING = registerBlock("speed_apple_sapling",
            ()-> new SaplingBlock(SpeedAppleSaplingGenerator.SpeedAppleSapling, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)), ModCreativeModeTabs.Agree_Group);
    public static final RegistryObject<Block> HEALTH_BOOST_SAPLING = registerBlock("health_boost_apple_sapling",
            ()-> new SaplingBlock(HealthBoostAppleSaplingGenerator.HealthBoostAppleSapling, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)), ModCreativeModeTabs.Agree_Group);
    public static final RegistryObject<Block> FIRE_RESISTANCE_SAPLING = registerBlock("fire_resistance_apple_sapling",
            ()-> new SaplingBlock(FireResistanceAppleSaplingGenerator.FireResistanceApple, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)), ModCreativeModeTabs.Agree_Group);
    public static final RegistryObject<Block> HERO_VILLAGE_SAPLING = registerBlock("village_hero_apple_sapling",
            ()-> new SaplingBlock(VillageHeroAppleSaplingGenerator.VillageHeroSapling, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)), ModCreativeModeTabs.Agree_Group);
    public static final RegistryObject<Block> STRENGTH_SAPLING = registerBlock("strength_apple_sapling",
            ()-> new SaplingBlock(StrengthAppleSaplingGenerator.StrengthAppleSapling, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)), ModCreativeModeTabs.Agree_Group);
    public static final RegistryObject<Block> NIGHT_VISION_SAPLING = registerBlock("night_vision_sapling",
            ()-> new SaplingBlock(NightVisionAppleSaplingGenerator.NightVisionAppleSapling, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)), ModCreativeModeTabs.Agree_Group);
    public static final RegistryObject<Block> JUMP_BOOST_SAPLING = registerBlock("jump_boost_sapling",
            ()-> new SaplingBlock(JumpBoostAppleSaplingGenerator.JumpBoostAppleSapling, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)), ModCreativeModeTabs.Agree_Group);

    //LEAVES
    public static final RegistryObject<Block> HASTE_APPLE_LEAVES =registerBlock("haste_apple_leave",
            ()-> new LeafCropBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN), AppleFoodComponents.HASTE_APPLE),ModCreativeModeTabs.Agree_Group);
    public static final RegistryObject<Block> SPEED_APPLE_LEAVES =registerBlock("speed_apple_leave",
            ()-> new LeafCropBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN), AppleFoodComponents.SPEED_APPLE),ModCreativeModeTabs.Agree_Group);
    public static final RegistryObject<Block> HEALTH_BOOST_LEAVES =registerBlock("health_boost_leave",
            ()-> new LeafCropBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN), AppleFoodComponents.HEALTH_BOOST_APPLE),ModCreativeModeTabs.Agree_Group);
    public static final RegistryObject<Block> FIRE_RESISTANCE_LEAVES =registerBlock("fire_resistance_leave",
            ()-> new LeafCropBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN), AppleFoodComponents.FIRE_RESISTANCE_APPLE),ModCreativeModeTabs.Agree_Group);
    public static final RegistryObject<Block> HERO_VILLAGE_LEAVES =registerBlock("village_hero_leave",
            ()-> new LeafCropBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN), AppleFoodComponents.HERO_VILLAGE_APPLE),ModCreativeModeTabs.Agree_Group);
    public static final RegistryObject<Block> STRENGTH_LEAVES =registerBlock("strength_apple_leave",
            ()-> new LeafCropBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN), AppleFoodComponents.STRENGTH_APPLE),ModCreativeModeTabs.Agree_Group);
    public static final RegistryObject<Block> NIGHT_VISION_LEAVES =registerBlock("night_vision_leave",
            ()-> new LeafCropBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN), AppleFoodComponents.NIGHT_VISION_APPLE),ModCreativeModeTabs.Agree_Group);
    public static final RegistryObject<Block> JUMP_BOOST_LEAVES =registerBlock("jump_boost_leave",
            ()-> new LeafCropBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN), AppleFoodComponents.JUMP_BOOST_APPLE), ModCreativeModeTabs.Agree_Group);
    public static final RegistryObject<Block> Apple_Tree_LEAVES =registerBlock("apple_tree_leave",
            ()-> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN)),ModCreativeModeTabs.Agree_Group);

    //Potted Plant
    public static final RegistryObject<Block> POTTED_HASTE_APPLE_SAPLING = registerBlockWithoutItem("potted_haste_apple_sapling",
            ()-> new FlowerPotBlock(HASTE_APPLE_SAPLING.get(), BlockBehaviour.Properties.of().instabreak().noOcclusion()));
    public static final RegistryObject<Block> POTTED_SPEED_APPLE_SAPLING = registerBlockWithoutItem("potted_speed_apple_sapling",
            ()-> new FlowerPotBlock(SPEED_APPLE_SAPLING.get(), BlockBehaviour.Properties.of().instabreak().noOcclusion()));
    public static final RegistryObject<Block> POTTED_HEALTH_BOOST_SAPLING = registerBlockWithoutItem("potted_health_boost_apple_sapling",
            ()-> new FlowerPotBlock(HEALTH_BOOST_SAPLING.get(), BlockBehaviour.Properties.of().instabreak().noOcclusion()));
    public static final RegistryObject<Block> POTTED_FIRE_RESISTANCE_SAPLING = registerBlockWithoutItem("potted_fire_resistance_apple_sapling",
            ()-> new FlowerPotBlock(FIRE_RESISTANCE_SAPLING.get(), BlockBehaviour.Properties.of().instabreak().noOcclusion()));
    public static final RegistryObject<Block> POTTED_HERO_VILLAGE_SAPLING = registerBlockWithoutItem("potted_village_hero_apple_sapling",
            ()-> new FlowerPotBlock(HERO_VILLAGE_SAPLING.get(), BlockBehaviour.Properties.of().instabreak().noOcclusion()));
    public static final RegistryObject<Block> POTTED_STRENGTH_SAPLING = registerBlockWithoutItem("potted_strength_apple_sapling",
            ()-> new FlowerPotBlock(STRENGTH_SAPLING.get(), BlockBehaviour.Properties.of().instabreak().noOcclusion()));
    public static final RegistryObject<Block> POTTED_NIGHT_VISION_SAPLING = registerBlockWithoutItem("potted_night_vision_sapling",
            ()-> new FlowerPotBlock(NIGHT_VISION_SAPLING.get(), BlockBehaviour.Properties.of().instabreak().noOcclusion()));
    public static final RegistryObject<Block> POTTED_JUMP_BOOST_SAPLING = registerBlockWithoutItem("potted_jump_boost_sapling",
            ()-> new FlowerPotBlock(JUMP_BOOST_SAPLING.get(), BlockBehaviour.Properties.of().instabreak().noOcclusion()));


    private static <T extends Block> RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,RegistryObject<CreativeModeTab> tab) {
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
