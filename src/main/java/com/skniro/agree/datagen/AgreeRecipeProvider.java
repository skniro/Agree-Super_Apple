package com.skniro.agree.datagen;

import com.skniro.agree.item.AgreeItems;
import com.skniro.agree.item.Gemstone;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;

import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class AgreeRecipeProvider extends FabricRecipeProvider {
    protected AgreeRecipeProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, AgreeItems.RUBY_HELMET).pattern("bbb").pattern("b b")
                .input('b', Gemstone.RUBY)
                .criterion(FabricRecipeProvider.hasItem(Gemstone.RUBY),
                        FabricRecipeProvider.conditionsFromItem(Gemstone.RUBY))
                .offerTo(exporter);
    }

}
