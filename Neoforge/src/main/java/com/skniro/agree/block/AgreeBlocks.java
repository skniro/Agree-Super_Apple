package com.skniro.agree.block;

import com.skniro.agree.Agree;
import com.skniro.agree.block.init.LeafCropBlock;
import com.skniro.agree.item.AgreeItems;
import com.skniro.agree.item.Apples.AppleFoodComponents;
import com.skniro.agree.world.Tree.*;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;
import java.util.function.Supplier;

public class AgreeBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Agree.MOD_ID);

    public static final Supplier<Block> RUBY_BLOCK = registerBlock("ruby_block",
            Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_RED).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL));

    //Ore
    public static final Supplier<Block> RUBY_ORE = registerBlock("ruby_ore",
            (properties)-> new DropExperienceBlock(UniformInt.of(3, 7), properties), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 3.0F));
    public static final Supplier<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            (properties)-> new DropExperienceBlock(UniformInt.of(3, 7), properties), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().mapColor(MapColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE));


    //SAPLING
    public static final Supplier<Block> HASTE_APPLE_SAPLING = registerBlock("haste_apple_sapling",
            (properties)-> new SaplingBlock(HasteAppleSaplingGenerator.HasteAppleSapling,properties), BlockBehaviour.Properties.ofLegacyCopy(Blocks.OAK_SAPLING));
    public static final Supplier<Block> SPEED_APPLE_SAPLING = registerBlock("speed_apple_sapling",
            (properties)-> new SaplingBlock(SpeedAppleSaplingGenerator.SpeedAppleSapling,properties), BlockBehaviour.Properties.ofLegacyCopy(Blocks.OAK_SAPLING));
    public static final Supplier<Block> HEALTH_BOOST_SAPLING = registerBlock("health_boost_apple_sapling",
            (properties)-> new SaplingBlock(HealthBoostAppleSaplingGenerator.HealthBoostAppleSapling,properties), BlockBehaviour.Properties.ofLegacyCopy(Blocks.OAK_SAPLING));
    public static final Supplier<Block> FIRE_RESISTANCE_SAPLING = registerBlock("fire_resistance_apple_sapling",
            (properties)-> new SaplingBlock(FireResistanceAppleSaplingGenerator.FireResistanceApple,properties), BlockBehaviour.Properties.ofLegacyCopy(Blocks.OAK_SAPLING));
    public static final Supplier<Block> HERO_VILLAGE_SAPLING = registerBlock("village_hero_apple_sapling",
            (properties)-> new SaplingBlock(VillageHeroAppleSaplingGenerator.VillageHeroSapling,properties), BlockBehaviour.Properties.ofLegacyCopy(Blocks.OAK_SAPLING));
    public static final Supplier<Block> STRENGTH_SAPLING = registerBlock("strength_apple_sapling",
            (properties)-> new SaplingBlock(StrengthAppleSaplingGenerator.StrengthAppleSapling,properties), BlockBehaviour.Properties.ofLegacyCopy(Blocks.OAK_SAPLING));
    public static final Supplier<Block> NIGHT_VISION_SAPLING = registerBlock("night_vision_sapling",
            (properties)-> new SaplingBlock(NightVisionAppleSaplingGenerator.NightVisionAppleSapling,properties), BlockBehaviour.Properties.ofLegacyCopy(Blocks.OAK_SAPLING));
    public static final Supplier<Block> JUMP_BOOST_SAPLING = registerBlock("jump_boost_sapling",
            (properties)-> new SaplingBlock(JumpBoostAppleSaplingGenerator.JumpBoostAppleSapling,properties), BlockBehaviour.Properties.ofLegacyCopy(Blocks.OAK_SAPLING));

    //LEAVES
    public static final Supplier<Block> HASTE_APPLE_LEAVES =registerBlock("haste_apple_leave",
            (properties)-> new LeafCropBlock(properties, AppleFoodComponents.HASTE_APPLE), BlockBehaviour.Properties.of().noOcclusion().mapColor(MapColor.NETHER));
    public static final Supplier<Block> SPEED_APPLE_LEAVES =registerBlock("speed_apple_leave",
            (properties)-> new LeafCropBlock(properties, AppleFoodComponents.SPEED_APPLE), BlockBehaviour.Properties.of().noOcclusion().mapColor(MapColor.NETHER));
    public static final Supplier<Block> HEALTH_BOOST_LEAVES =registerBlock("health_boost_leave",
            (properties)-> new LeafCropBlock(properties, AppleFoodComponents.HEALTH_BOOST_APPLE), BlockBehaviour.Properties.of().noOcclusion().mapColor(MapColor.NETHER));
    public static final Supplier<Block> FIRE_RESISTANCE_LEAVES =registerBlock("fire_resistance_leave",
            (properties)-> new LeafCropBlock(properties, AppleFoodComponents.FIRE_RESISTANCE_APPLE), BlockBehaviour.Properties.of().noOcclusion().mapColor(MapColor.NETHER));
    public static final Supplier<Block> HERO_VILLAGE_LEAVES =registerBlock("village_hero_leave",
            (properties)-> new LeafCropBlock(properties, AppleFoodComponents.HERO_VILLAGE_APPLE), BlockBehaviour.Properties.of().noOcclusion().mapColor(MapColor.NETHER));
    public static final Supplier<Block> STRENGTH_LEAVES =registerBlock("strength_apple_leave",
            (properties)-> new LeafCropBlock(properties, AppleFoodComponents.STRENGTH_APPLE), BlockBehaviour.Properties.of().noOcclusion().mapColor(MapColor.NETHER));
    public static final Supplier<Block> NIGHT_VISION_LEAVES =registerBlock("night_vision_leave",
            (properties)-> new LeafCropBlock(properties, AppleFoodComponents.NIGHT_VISION_APPLE), BlockBehaviour.Properties.of().noOcclusion().mapColor(MapColor.NETHER));
    public static final Supplier<Block> JUMP_BOOST_LEAVES =registerBlock("jump_boost_leave",
            (properties)-> new LeafCropBlock(properties, AppleFoodComponents.JUMP_BOOST_APPLE), BlockBehaviour.Properties.of().noOcclusion().mapColor(MapColor.NETHER));
    public static final Supplier<Block> Apple_Tree_LEAVES =registerBlock("apple_tree_leave",
            (properties)-> new TintedParticleLeavesBlock(0.01F, properties), BlockBehaviour.Properties.of().noOcclusion().mapColor(MapColor.NETHER));

    //Potted Plant
    public static final Supplier<Block> POTTED_HASTE_APPLE_SAPLING = registerBlockWithoutItem("potted_haste_apple_sapling",
            (properties)-> new FlowerPotBlock(HASTE_APPLE_SAPLING.get(), properties), BlockBehaviour.Properties.of().instabreak().noOcclusion());
    public static final Supplier<Block> POTTED_SPEED_APPLE_SAPLING = registerBlockWithoutItem("potted_speed_apple_sapling",
            (properties)-> new FlowerPotBlock(SPEED_APPLE_SAPLING.get(), properties), BlockBehaviour.Properties.of().instabreak().noOcclusion());
    public static final Supplier<Block> POTTED_HEALTH_BOOST_SAPLING = registerBlockWithoutItem("potted_health_boost_apple_sapling",
            (properties)-> new FlowerPotBlock(HEALTH_BOOST_SAPLING.get(), properties), BlockBehaviour.Properties.of().instabreak().noOcclusion());
    public static final Supplier<Block> POTTED_FIRE_RESISTANCE_SAPLING = registerBlockWithoutItem("potted_fire_resistance_apple_sapling",
            (properties)-> new FlowerPotBlock(FIRE_RESISTANCE_SAPLING.get(), properties), BlockBehaviour.Properties.of().instabreak().noOcclusion());
    public static final Supplier<Block> POTTED_HERO_VILLAGE_SAPLING = registerBlockWithoutItem("potted_village_hero_apple_sapling",
            (properties)-> new FlowerPotBlock(HERO_VILLAGE_SAPLING.get(), properties), BlockBehaviour.Properties.of().instabreak().noOcclusion());
    public static final Supplier<Block> POTTED_STRENGTH_SAPLING = registerBlockWithoutItem("potted_strength_apple_sapling",
            (properties)-> new FlowerPotBlock(STRENGTH_SAPLING.get(), properties), BlockBehaviour.Properties.of().instabreak().noOcclusion());
    public static final Supplier<Block> POTTED_NIGHT_VISION_SAPLING = registerBlockWithoutItem("potted_night_vision_sapling",
            (properties)-> new FlowerPotBlock(NIGHT_VISION_SAPLING.get(), properties), BlockBehaviour.Properties.of().instabreak().noOcclusion());
    public static final Supplier<Block> POTTED_JUMP_BOOST_SAPLING = registerBlockWithoutItem("potted_jump_boost_sapling",
            (properties)-> new FlowerPotBlock(JUMP_BOOST_SAPLING.get(), properties), BlockBehaviour.Properties.of().instabreak().noOcclusion());



    private static <B extends Block> DeferredBlock<B> registerBlock(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        DeferredBlock<B> bDeferredBlock = registerBlockWithoutItem(name, block, properties);
        registerBlockItem(name, bDeferredBlock);
        return bDeferredBlock;
    }

    private static <B extends Block> DeferredBlock<B> registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        DeferredBlock<B> register = BLOCKS.registerBlock(name, block, properties.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Agree.MOD_ID, name))));
        return register;
    }

    private static <B extends Block> DeferredBlock<B> registerBlockWithoutItemWithEmpty(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        DeferredBlock<B> register = registerBlockWithoutItem(name, block, properties);
        return register;
    }

    private static <T extends Block> Holder<Item> registerBlockItem(String name, DeferredBlock<T> block) {
        return AgreeItems.ITEMS.registerItem(name, (properties) -> new BlockItem(block.get(),
                new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Agree.MOD_ID, name)))));
    }

    public static void registerAgreeBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
