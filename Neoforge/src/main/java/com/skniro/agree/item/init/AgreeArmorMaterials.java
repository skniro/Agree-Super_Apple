package com.skniro.agree.item.init;

import java.util.EnumMap;
import java.util.Map;

import com.skniro.agree.tags.AgreeItemTags;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Util;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

public interface AgreeArmorMaterials {
    ArmorMaterial Ruby = new ArmorMaterial(5, (Map) Util.make(new EnumMap(ArmorType.class), (map) -> {
        map.put(ArmorType.BOOTS, 3);
        map.put(ArmorType.LEGGINGS, 6);
        map.put(ArmorType.CHESTPLATE, 8);
        map.put(ArmorType.HELMET, 3);
        map.put(ArmorType.BODY, 11);
    }), 25, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.1F, AgreeItemTags.REPAIRS_RUBY_ARMOR, AgreeEquipmentAssetKeys.Ruby);

    public static final int Ruby_DURABILITY_MULTIPLIER = 37;
}

