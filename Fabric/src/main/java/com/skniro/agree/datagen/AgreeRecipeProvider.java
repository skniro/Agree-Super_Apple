package com.skniro.agree.datagen;

import com.skniro.agree.block.AgreeBlocks;
import com.skniro.agree.item.AgreeItems;
import com.skniro.agree.item.Apples.AppleFoodComponents;
import com.skniro.agree.tags.AgreeItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import java.util.concurrent.CompletableFuture;

public class AgreeRecipeProvider extends FabricRecipeProvider {
    protected AgreeRecipeProvider(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }


    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput exporter) {
        return new RecipeProvider(registryLookup, exporter) {
            @Override
            public void buildRecipes() {
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
                        .unlockedBy(getHasName(Items.GOLDEN_APPLE),
                                has(Items.GOLDEN_APPLE))
                        .save(output);

                shaped(RecipeCategory.FOOD, AppleFoodComponents.NIGHT_VISION_APPLE).pattern("###").pattern("#G#").pattern("###")
                        .define('G', Items.GOLDEN_APPLE)
                        .define('#', Items.LAPIS_LAZULI)
                        .unlockedBy(getHasName(Items.GOLDEN_APPLE),
                                has(Items.GOLDEN_APPLE))
                        .save(output);

                shaped(RecipeCategory.FOOD, AppleFoodComponents.FIRE_RESISTANCE_APPLE).pattern("###").pattern("#G#").pattern("###")
                        .define('G', Items.GOLDEN_APPLE)
                        .define('#', Items.OBSIDIAN)
                        .unlockedBy(getHasName(Items.GOLDEN_APPLE),
                                has(Items.GOLDEN_APPLE))
                        .save(output);

                shaped(RecipeCategory.FOOD, AppleFoodComponents.JUMP_BOOST_APPLE).pattern("###").pattern("#G#").pattern("###")
                        .define('G', Items.GOLDEN_APPLE)
                        .define('#', Items.COPPER_BLOCK)
                        .unlockedBy(getHasName(Items.GOLDEN_APPLE),
                                has(Items.GOLDEN_APPLE))
                        .save(output);

                shaped(RecipeCategory.FOOD, AppleFoodComponents.SPEED_APPLE).pattern("###").pattern("#G#").pattern("###")
                        .define('G', Items.GOLDEN_APPLE)
                        .define('#', Items.FEATHER)
                        .unlockedBy(getHasName(Items.GOLDEN_APPLE),
                                has(Items.GOLDEN_APPLE))
                        .save(output);

                shaped(RecipeCategory.FOOD, AppleFoodComponents.STRENGTH_APPLE).pattern("###").pattern("#G#").pattern("###")
                        .define('G', Items.GOLDEN_APPLE)
                        .define('#', Items.IRON_BLOCK)
                        .unlockedBy(getHasName(Items.GOLDEN_APPLE),
                                has(Items.GOLDEN_APPLE))
                        .save(output);

                shaped(RecipeCategory.FOOD, AppleFoodComponents.HERO_VILLAGE_APPLE).pattern("###").pattern("#G#").pattern("###")
                        .define('G', Items.GOLDEN_APPLE)
                        .define('#', Items.EMERALD_BLOCK)
                        .unlockedBy(getHasName(Items.GOLDEN_APPLE),
                                has(Items.GOLDEN_APPLE))
                        .save(output);

                shaped(RecipeCategory.FOOD, Items.ENCHANTED_GOLDEN_APPLE).pattern("###").pattern("#G#").pattern("###")
                        .define('G', Items.GOLDEN_APPLE)
                        .define('#', Items.GOLD_BLOCK)
                        .unlockedBy(getHasName(Items.GOLDEN_APPLE),
                                has(Items.GOLDEN_APPLE))
                        .save(output);

                shaped(RecipeCategory.FOOD, AgreeBlocks.RUBY_BLOCK).pattern("###").pattern("###").pattern("###")
                        .define('#', AgreeItems.RUBY)
                        .unlockedBy(getHasName(AgreeItems.RUBY),
                                has(AgreeItems.RUBY))
                        .save(output);

                shaped(RecipeCategory.FOOD, AppleFoodComponents.SUPER_APPLE)
                        .pattern("IRD")
                        .pattern("GAB")
                        .pattern("LEN")
                        .define('I', Items.IRON_BLOCK)
                        .define('R', Items.REDSTONE_BLOCK)
                        .define('D', Items.DIAMOND_BLOCK)
                        .define('G', Items.GOLD_BLOCK)
                        .define('A', Items.ENCHANTED_GOLDEN_APPLE)
                        .define('B', AgreeBlocks.RUBY_BLOCK)
                        .define('L', Items.LAPIS_BLOCK)
                        .define('E', Items.EMERALD_BLOCK)
                        .define('N', Items.NETHERITE_INGOT)
                        .unlockedBy(getHasName(Items.ENCHANTED_GOLDEN_APPLE),
                                has(Items.ENCHANTED_GOLDEN_APPLE))
                        .save(output);

                shapeless(RecipeCategory.FOOD, AgreeItems.RUBY,9)
                        .requires(AgreeBlocks.RUBY_BLOCK)
                        .unlockedBy(getHasName(AgreeBlocks.RUBY_BLOCK), has(AgreeBlocks.RUBY_BLOCK))
                        .save(this.output);

                shaped(RecipeCategory.COMBAT, AgreeItems.RUBY_BOOTS).pattern("X X").pattern("X X")
                        .define('X', AgreeItems.RUBY)
                        .unlockedBy(getHasName(AgreeItems.RUBY),
                                has(AgreeItems.RUBY))
                        .save(this.output);

                shaped(RecipeCategory.COMBAT, AgreeItems.RUBY_CHESTPLATE).pattern("X X").pattern("XXX").pattern("XXX")
                        .define('X', AgreeItems.RUBY)
                        .unlockedBy(getHasName(AgreeItems.RUBY), has(AgreeItems.RUBY))
                        .save(this.output);

                shaped(RecipeCategory.COMBAT, AgreeItems.RUBY_HELMET).pattern("XXX").pattern("X X")
                        .define('X', AgreeItems.RUBY)
                        .unlockedBy(getHasName(AgreeItems.RUBY), has(AgreeItems.RUBY))
                        .save(this.output);

                shaped(RecipeCategory.COMBAT, AgreeItems.RUBY_LEGGINGS).pattern("XXX").pattern("X X").pattern("X X")
                        .define('X', AgreeItems.RUBY)
                        .unlockedBy(getHasName(AgreeItems.RUBY), has(AgreeItems.RUBY))
                        .save(this.output);

                shaped(RecipeCategory.COMBAT, AgreeItems.RUBY_SWORD).pattern("X").pattern("X").pattern("#")
                        .define('#', Items.STICK)
                        .define('X', AgreeItemTags.RUBY_TOOL_MATERIALS)
                        .unlockedBy("has_ruby", has(AgreeItemTags.RUBY_TOOL_MATERIALS))
                        .save(this.output);

                shaped(RecipeCategory.TOOLS, AgreeItems.RUBY_HOE).pattern("XX").pattern(" #").pattern(" #")
                        .define('#', Items.STICK)
                        .define('X', AgreeItemTags.RUBY_TOOL_MATERIALS)
                        .unlockedBy("has_ruby", has(AgreeItemTags.RUBY_TOOL_MATERIALS))
                        .save(this.output);

                shaped(RecipeCategory.TOOLS, AgreeItems.RUBY_PICKAXE).pattern("XXX").pattern(" # ").pattern(" # ")
                        .define('#', Items.STICK)
                        .define('X', AgreeItemTags.RUBY_TOOL_MATERIALS)
                        .unlockedBy("has_ruby", has(AgreeItemTags.RUBY_TOOL_MATERIALS))
                        .save(this.output);

                shaped(RecipeCategory.TOOLS, AgreeItems.RUBY_AXE).pattern("XX").pattern("X#").pattern(" #")
                        .define('#', Items.STICK)
                        .define('X', AgreeItemTags.RUBY_TOOL_MATERIALS)
                        .unlockedBy("has_ruby", has(AgreeItemTags.RUBY_TOOL_MATERIALS))
                        .save(this.output);

                shaped(RecipeCategory.TOOLS, AgreeItems.RUBY_SHOVEL).pattern("X").pattern("#").pattern("#")
                        .define('#', Items.STICK)
                        .define('X', AgreeItemTags.RUBY_TOOL_MATERIALS)
                        .unlockedBy("has_ruby", has(AgreeItemTags.RUBY_TOOL_MATERIALS))
                        .save(this.output);

                SimpleCookingRecipeBuilder.smelting
                        (Ingredient.of(AgreeItems.RUBY_PICKAXE, AgreeItems.RUBY_SHOVEL, AgreeItems.RUBY_AXE, AgreeItems.RUBY_HOE, AgreeItems.RUBY_SWORD, AgreeItems.RUBY_HELMET, AgreeItems.RUBY_CHESTPLATE, AgreeItems.RUBY_LEGGINGS, AgreeItems.RUBY_BOOTS)
                                , RecipeCategory.MISC, CookingBookCategory.MISC, AgreeItems.RUBY, 0.1F, 200)
                        .unlockedBy(getHasName(AgreeItems.RUBY_PICKAXE), has(AgreeItems.RUBY_PICKAXE))
                        .unlockedBy(getHasName(AgreeItems.RUBY_SHOVEL), has(AgreeItems.RUBY_SHOVEL))
                        .unlockedBy(getHasName(AgreeItems.RUBY_AXE), has(AgreeItems.RUBY_AXE))
                        .unlockedBy(getHasName(AgreeItems.RUBY_HOE), has(AgreeItems.RUBY_HOE))
                        .unlockedBy(getHasName(AgreeItems.RUBY_SWORD), has(AgreeItems.RUBY_SWORD))
                        .unlockedBy(getHasName(AgreeItems.RUBY_HELMET), has(AgreeItems.RUBY_HELMET))
                        .unlockedBy(getHasName(AgreeItems.RUBY_CHESTPLATE), has(AgreeItems.RUBY_CHESTPLATE))
                        .unlockedBy(getHasName(AgreeItems.RUBY_LEGGINGS), has(AgreeItems.RUBY_LEGGINGS))
                        .unlockedBy(getHasName(AgreeItems.RUBY_BOOTS), has(AgreeItems.RUBY_BOOTS))
                        .save(this.output, getSmeltingRecipeName(AgreeItems.RUBY));

                SimpleCookingRecipeBuilder.blasting
                                (Ingredient.of(AgreeItems.RUBY_PICKAXE, AgreeItems.RUBY_SHOVEL, AgreeItems.RUBY_AXE, AgreeItems.RUBY_HOE, AgreeItems.RUBY_SWORD, AgreeItems.RUBY_HELMET, AgreeItems.RUBY_CHESTPLATE, AgreeItems.RUBY_LEGGINGS, AgreeItems.RUBY_BOOTS)
                                        , RecipeCategory.MISC, CookingBookCategory.MISC, AgreeItems.RUBY, 0.1F, 200)
                        .unlockedBy(getHasName(AgreeItems.RUBY_PICKAXE), has(AgreeItems.RUBY_PICKAXE))
                        .unlockedBy(getHasName(AgreeItems.RUBY_SHOVEL), has(AgreeItems.RUBY_SHOVEL))
                        .unlockedBy(getHasName(AgreeItems.RUBY_AXE), has(AgreeItems.RUBY_AXE))
                        .unlockedBy(getHasName(AgreeItems.RUBY_HOE), has(AgreeItems.RUBY_HOE))
                        .unlockedBy(getHasName(AgreeItems.RUBY_SWORD), has(AgreeItems.RUBY_SWORD))
                        .unlockedBy(getHasName(AgreeItems.RUBY_HELMET), has(AgreeItems.RUBY_HELMET))
                        .unlockedBy(getHasName(AgreeItems.RUBY_CHESTPLATE), has(AgreeItems.RUBY_CHESTPLATE))
                        .unlockedBy(getHasName(AgreeItems.RUBY_LEGGINGS), has(AgreeItems.RUBY_LEGGINGS))
                        .unlockedBy(getHasName(AgreeItems.RUBY_BOOTS), has(AgreeItems.RUBY_BOOTS))
                        .save(this.output, getBlastingRecipeName(AgreeItems.RUBY));
            }
        };
    }

    @Override
    public String getName() {
        return "";
    }
}
