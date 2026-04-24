package com.skniro.agree.datagen;

import com.skniro.agree.block.AgreeBlocks;
import com.skniro.agree.item.AgreeItems;
import com.skniro.agree.item.Apples.AppleFoodComponents;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import java.util.concurrent.CompletableFuture;

public class AgreeRecipeProvider extends FabricRecipeProvider {
    protected AgreeRecipeProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }


    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput exporter) {
        return new RecipeProvider(registryLookup, exporter) {
            @Override
            public void buildRecipes() {
                shaped(RecipeCategory.COMBAT, AgreeItems.RUBY_HELMET).pattern("bbb").pattern("b b")
                        .define('b', AgreeItems.RUBY)
                        .unlockedBy(getHasName(AgreeItems.RUBY),
                                has(AgreeItems.RUBY))
                        .save(output);

                shapeless(RecipeCategory.FOOD, AgreeBlocks.FIRE_RESISTANCE_SAPLING)
                        .requires(AppleFoodComponents.FIRE_RESISTANCE_APPLE)
                        .requires(Blocks.OAK_SAPLING)
                        .unlockedBy(getHasName(AppleFoodComponents.FIRE_RESISTANCE_APPLE),
                                has(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .unlockedBy(getHasName(Blocks.OAK_SAPLING),
                                has(Blocks.OAK_SAPLING))
                        .save(output);

                shapeless(RecipeCategory.FOOD, AgreeBlocks.HASTE_APPLE_SAPLING)
                        .requires(AppleFoodComponents.HASTE_APPLE)
                        .requires(Blocks.OAK_SAPLING)
                        .unlockedBy(getHasName(AppleFoodComponents.HASTE_APPLE),
                                has(AppleFoodComponents.HASTE_APPLE))
                        .unlockedBy(getHasName(Blocks.OAK_SAPLING),
                                has(Blocks.OAK_SAPLING))
                        .save(output);

                shapeless(RecipeCategory.FOOD, AgreeBlocks.HEALTH_BOOST_SAPLING)
                        .requires(AppleFoodComponents.HEALTH_BOOST_APPLE)
                        .requires(Blocks.OAK_SAPLING)
                        .unlockedBy(getHasName(AppleFoodComponents.HEALTH_BOOST_APPLE),
                                has(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .unlockedBy(getHasName(Blocks.OAK_SAPLING),
                                has(Blocks.OAK_SAPLING))
                        .save(output);

                shapeless(RecipeCategory.FOOD, AgreeBlocks.HERO_VILLAGE_SAPLING)
                        .requires(AppleFoodComponents.HERO_VILLAGE_APPLE)
                        .requires(Blocks.OAK_SAPLING)
                        .unlockedBy(getHasName(AppleFoodComponents.HERO_VILLAGE_APPLE),
                                has(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .unlockedBy(getHasName(Blocks.OAK_SAPLING),
                                has(Blocks.OAK_SAPLING))
                        .save(output);

                shapeless(RecipeCategory.FOOD, AgreeBlocks.JUMP_BOOST_SAPLING)
                        .requires(AppleFoodComponents.JUMP_BOOST_APPLE)
                        .requires(Blocks.OAK_SAPLING)
                        .unlockedBy(getHasName(AppleFoodComponents.JUMP_BOOST_APPLE),
                                has(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .unlockedBy(getHasName(Blocks.OAK_SAPLING),
                                has(Blocks.OAK_SAPLING))
                        .save(output);

                shapeless(RecipeCategory.FOOD, AgreeBlocks.NIGHT_VISION_SAPLING)
                        .requires(AppleFoodComponents.NIGHT_VISION_APPLE)
                        .requires(Blocks.OAK_SAPLING)
                        .unlockedBy(getHasName(AppleFoodComponents.NIGHT_VISION_APPLE),
                                has(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .unlockedBy(getHasName(Blocks.OAK_SAPLING),
                                has(Blocks.OAK_SAPLING))
                        .save(output);

                shapeless(RecipeCategory.FOOD, AgreeBlocks.SPEED_APPLE_SAPLING)
                        .requires(AppleFoodComponents.SPEED_APPLE)
                        .requires(Blocks.OAK_SAPLING)
                        .unlockedBy(getHasName(AppleFoodComponents.SPEED_APPLE),
                                has(AppleFoodComponents.SPEED_APPLE))
                        .unlockedBy(getHasName(Blocks.OAK_SAPLING),
                                has(Blocks.OAK_SAPLING))
                        .save(output);

                shapeless(RecipeCategory.FOOD, AgreeBlocks.STRENGTH_SAPLING)
                        .requires(AppleFoodComponents.STRENGTH_APPLE)
                        .requires(Blocks.OAK_SAPLING)
                        .unlockedBy(getHasName(AppleFoodComponents.STRENGTH_APPLE),
                                has(AppleFoodComponents.STRENGTH_APPLE))
                        .unlockedBy(getHasName(Blocks.OAK_SAPLING),
                                has(Blocks.OAK_SAPLING))
                        .save(output);

                shaped(RecipeCategory.FOOD, AppleFoodComponents.HEALTH_BOOST_APPLE).pattern("###").pattern("#G#").pattern("###")
                        .define('G', Items.GOLDEN_APPLE)
                        .define('#', Items.APPLE)
                        .unlockedBy(getHasName(Items.APPLE),
                                has(Items.APPLE))
                        .save(output);
            }
        };
    }

    @Override
    public String getName() {
        return "";
    }
}
