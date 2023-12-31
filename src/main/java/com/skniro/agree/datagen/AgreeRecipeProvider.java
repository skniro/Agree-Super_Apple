package com.skniro.agree.datagen;

import com.skniro.agree.block.AgreeBlocks;
import com.skniro.agree.item.AgreeItems;
import com.skniro.agree.item.Apples.AppleFoodComponents;
import com.skniro.agree.item.Gemstone;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class AgreeRecipeProvider extends FabricRecipeProvider {
    protected AgreeRecipeProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }


    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, AgreeItems.RUBY_HELMET).pattern("bbb").pattern("b b")
                .input('b', Gemstone.RUBY)
                .criterion(FabricRecipeProvider.hasItem(Gemstone.RUBY),
                        FabricRecipeProvider.conditionsFromItem(Gemstone.RUBY))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, AgreeBlocks.FIRE_RESISTANCE_SAPLING)
                .input(AppleFoodComponents.FIRE_RESISTANCE_APPLE)
                .input(Blocks.OAK_SAPLING)
                .criterion(FabricRecipeProvider.hasItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE),
                        FabricRecipeProvider.conditionsFromItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                .criterion(FabricRecipeProvider.hasItem(Blocks.OAK_SAPLING),
                        FabricRecipeProvider.conditionsFromItem(Blocks.OAK_SAPLING))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, AgreeBlocks.HASTE_APPLE_SAPLING)
                .input(AppleFoodComponents.HASTE_APPLE)
                .input(Blocks.OAK_SAPLING)
                .criterion(FabricRecipeProvider.hasItem(AppleFoodComponents.HASTE_APPLE),
                        FabricRecipeProvider.conditionsFromItem(AppleFoodComponents.HASTE_APPLE))
                .criterion(FabricRecipeProvider.hasItem(Blocks.OAK_SAPLING),
                        FabricRecipeProvider.conditionsFromItem(Blocks.OAK_SAPLING))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, AgreeBlocks.HEALTH_BOOST_SAPLING)
                .input(AppleFoodComponents.HEALTH_BOOST_APPLE)
                .input(Blocks.OAK_SAPLING)
                .criterion(FabricRecipeProvider.hasItem(AppleFoodComponents.HEALTH_BOOST_APPLE),
                        FabricRecipeProvider.conditionsFromItem(AppleFoodComponents.HEALTH_BOOST_APPLE))
                .criterion(FabricRecipeProvider.hasItem(Blocks.OAK_SAPLING),
                        FabricRecipeProvider.conditionsFromItem(Blocks.OAK_SAPLING))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, AgreeBlocks.HERO_VILLAGE_SAPLING)
                .input(AppleFoodComponents.HERO_VILLAGE_APPLE)
                .input(Blocks.OAK_SAPLING)
                .criterion(FabricRecipeProvider.hasItem(AppleFoodComponents.HERO_VILLAGE_APPLE),
                        FabricRecipeProvider.conditionsFromItem(AppleFoodComponents.HERO_VILLAGE_APPLE))
                .criterion(FabricRecipeProvider.hasItem(Blocks.OAK_SAPLING),
                        FabricRecipeProvider.conditionsFromItem(Blocks.OAK_SAPLING))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, AgreeBlocks.JUMP_BOOST_SAPLING)
                .input(AppleFoodComponents.JUMP_BOOST_APPLE)
                .input(Blocks.OAK_SAPLING)
                .criterion(FabricRecipeProvider.hasItem(AppleFoodComponents.JUMP_BOOST_APPLE),
                        FabricRecipeProvider.conditionsFromItem(AppleFoodComponents.JUMP_BOOST_APPLE))
                .criterion(FabricRecipeProvider.hasItem(Blocks.OAK_SAPLING),
                        FabricRecipeProvider.conditionsFromItem(Blocks.OAK_SAPLING))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, AgreeBlocks.NIGHT_VISION_SAPLING)
                .input(AppleFoodComponents.NIGHT_VISION_APPLE)
                .input(Blocks.OAK_SAPLING)
                .criterion(FabricRecipeProvider.hasItem(AppleFoodComponents.NIGHT_VISION_APPLE),
                        FabricRecipeProvider.conditionsFromItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                .criterion(FabricRecipeProvider.hasItem(Blocks.OAK_SAPLING),
                        FabricRecipeProvider.conditionsFromItem(Blocks.OAK_SAPLING))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, AgreeBlocks.SPEED_APPLE_SAPLING)
                .input(AppleFoodComponents.NIGHT_VISION_APPLE)
                .input(Blocks.OAK_SAPLING)
                .criterion(FabricRecipeProvider.hasItem(AppleFoodComponents.SPEED_APPLE),
                        FabricRecipeProvider.conditionsFromItem(AppleFoodComponents.SPEED_APPLE))
                .criterion(FabricRecipeProvider.hasItem(Blocks.OAK_SAPLING),
                        FabricRecipeProvider.conditionsFromItem(Blocks.OAK_SAPLING))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, AgreeBlocks.STRENGTH_SAPLING)
                .input(AppleFoodComponents.NIGHT_VISION_APPLE)
                .input(Blocks.OAK_SAPLING)
                .criterion(FabricRecipeProvider.hasItem(AppleFoodComponents.STRENGTH_APPLE),
                        FabricRecipeProvider.conditionsFromItem(AppleFoodComponents.STRENGTH_APPLE))
                .criterion(FabricRecipeProvider.hasItem(Blocks.OAK_SAPLING),
                        FabricRecipeProvider.conditionsFromItem(Blocks.OAK_SAPLING))
                .offerTo(exporter);

    }
}
