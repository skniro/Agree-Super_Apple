package com.skniro.agree.tags;

import com.skniro.agree.Agree;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;


public class AgreeItemTags {
    public static final TagKey<Item> REPAIRS_RUBY_ARMOR = ItemTags.create(ResourceLocation.fromNamespaceAndPath(Agree.MOD_ID, "repairs_ruby_armor"));
    public static final TagKey<Item> RUBY_TOOL_MATERIALS = ItemTags.create(ResourceLocation.fromNamespaceAndPath(Agree.MOD_ID, "ruby_tool_materials"));

    private AgreeItemTags() {
    }

    private static TagKey<Item> of(String id) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Agree.MOD_ID, id));
    }
}
