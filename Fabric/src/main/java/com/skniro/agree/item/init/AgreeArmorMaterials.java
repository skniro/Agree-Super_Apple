package com.skniro.agree.item.init;

import com.skniro.agree.item.Gemstone;
import com.skniro.agree.tags.AgreeItemTags;
import net.minecraft.item.*;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentModels;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public interface AgreeArmorMaterials
{
    ArmorMaterial Ruby = new ArmorMaterial(5, (Map)Util.make(new EnumMap(EquipmentType.class), (map) -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 6);
        map.put(EquipmentType.CHESTPLATE, 8);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 11);
    }), 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F, 0.1F, AgreeItemTags.REPAIRS_RUBY_ARMOR, EquipmentModels.DIAMOND);

    public static final int Ruby_DURABILITY_MULTIPLIER = 37;
}

