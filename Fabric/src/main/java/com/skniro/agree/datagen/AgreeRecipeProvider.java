package com.skniro.agree.datagen;

import com.skniro.agree.block.AgreeBlocks;
import com.skniro.agree.item.AgreeItems;
import com.skniro.agree.item.Apples.AppleFoodComponents;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class AgreeRecipeProvider extends FabricRecipeProvider {
    protected AgreeRecipeProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }


    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            @Override
            public void generate() {
                createShaped(RecipeCategory.COMBAT, AgreeItems.RUBY_HELMET).pattern("bbb").pattern("b b")
                        .input('b', AgreeItems.RUBY)
                        .criterion(hasItem(AgreeItems.RUBY),
                                conditionsFromItem(AgreeItems.RUBY))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.FOOD, AgreeBlocks.FIRE_RESISTANCE_SAPLING)
                        .input(AppleFoodComponents.FIRE_RESISTANCE_APPLE)
                        .input(Blocks.OAK_SAPLING)
                        .criterion(hasItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE),
                                conditionsFromItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .criterion(hasItem(Blocks.OAK_SAPLING),
                                conditionsFromItem(Blocks.OAK_SAPLING))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.FOOD, AgreeBlocks.HASTE_APPLE_SAPLING)
                        .input(AppleFoodComponents.HASTE_APPLE)
                        .input(Blocks.OAK_SAPLING)
                        .criterion(hasItem(AppleFoodComponents.HASTE_APPLE),
                                conditionsFromItem(AppleFoodComponents.HASTE_APPLE))
                        .criterion(hasItem(Blocks.OAK_SAPLING),
                                conditionsFromItem(Blocks.OAK_SAPLING))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.FOOD, AgreeBlocks.HEALTH_BOOST_SAPLING)
                        .input(AppleFoodComponents.HEALTH_BOOST_APPLE)
                        .input(Blocks.OAK_SAPLING)
                        .criterion(hasItem(AppleFoodComponents.HEALTH_BOOST_APPLE),
                                conditionsFromItem(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .criterion(hasItem(Blocks.OAK_SAPLING),
                                conditionsFromItem(Blocks.OAK_SAPLING))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.FOOD, AgreeBlocks.HERO_VILLAGE_SAPLING)
                        .input(AppleFoodComponents.HERO_VILLAGE_APPLE)
                        .input(Blocks.OAK_SAPLING)
                        .criterion(hasItem(AppleFoodComponents.HERO_VILLAGE_APPLE),
                                conditionsFromItem(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .criterion(hasItem(Blocks.OAK_SAPLING),
                                conditionsFromItem(Blocks.OAK_SAPLING))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.FOOD, AgreeBlocks.JUMP_BOOST_SAPLING)
                        .input(AppleFoodComponents.JUMP_BOOST_APPLE)
                        .input(Blocks.OAK_SAPLING)
                        .criterion(hasItem(AppleFoodComponents.JUMP_BOOST_APPLE),
                                conditionsFromItem(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .criterion(hasItem(Blocks.OAK_SAPLING),
                                conditionsFromItem(Blocks.OAK_SAPLING))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.FOOD, AgreeBlocks.NIGHT_VISION_SAPLING)
                        .input(AppleFoodComponents.NIGHT_VISION_APPLE)
                        .input(Blocks.OAK_SAPLING)
                        .criterion(hasItem(AppleFoodComponents.NIGHT_VISION_APPLE),
                                conditionsFromItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .criterion(hasItem(Blocks.OAK_SAPLING),
                                conditionsFromItem(Blocks.OAK_SAPLING))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.FOOD, AgreeBlocks.SPEED_APPLE_SAPLING)
                        .input(AppleFoodComponents.SPEED_APPLE)
                        .input(Blocks.OAK_SAPLING)
                        .criterion(hasItem(AppleFoodComponents.SPEED_APPLE),
                                conditionsFromItem(AppleFoodComponents.SPEED_APPLE))
                        .criterion(hasItem(Blocks.OAK_SAPLING),
                                conditionsFromItem(Blocks.OAK_SAPLING))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.FOOD, AgreeBlocks.STRENGTH_SAPLING)
                        .input(AppleFoodComponents.STRENGTH_APPLE)
                        .input(Blocks.OAK_SAPLING)
                        .criterion(hasItem(AppleFoodComponents.STRENGTH_APPLE),
                                conditionsFromItem(AppleFoodComponents.STRENGTH_APPLE))
                        .criterion(hasItem(Blocks.OAK_SAPLING),
                                conditionsFromItem(Blocks.OAK_SAPLING))
                        .offerTo(exporter);

                createShaped(RecipeCategory.FOOD, AppleFoodComponents.HEALTH_BOOST_APPLE).pattern("###").pattern("#G#").pattern("###")
                        .input('G', Items.GOLDEN_APPLE)
                        .input('#', Items.APPLE)
                        .criterion(hasItem(Items.APPLE),
                                conditionsFromItem(Items.APPLE))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "";
    }
}
