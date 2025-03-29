package com.skniro.agree.item.init;



import com.skniro.agree.tags.AgreeItemTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.level.block.Block;

public record AgreeToolMaterials(TagKey<Block> incorrectBlocksForDrops, int durability, float speed, float attackDamageBonus, int enchantmentValue, TagKey<Item> repairItems) {
    public static final ToolMaterial RUBY = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3231, 12.0F, 3.0F, 22, ItemTags.DIAMOND_TOOL_MATERIALS);
}