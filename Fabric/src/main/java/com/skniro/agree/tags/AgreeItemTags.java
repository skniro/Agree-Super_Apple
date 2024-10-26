package com.skniro.agree.tags;

import com.skniro.agree.Agree;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class AgreeItemTags {
    public static final TagKey<Item> REPAIRS_RUBY_ARMOR = of("repairs_ruby_armor");
    public static final TagKey<Item> RUBY_TOOL_MATERIALS = of("wooden_tool_materials");


    private AgreeItemTags() {
    }

    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(Agree.MOD_ID, id));
    }
}
