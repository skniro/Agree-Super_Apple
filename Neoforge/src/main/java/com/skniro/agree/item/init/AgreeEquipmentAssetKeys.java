package com.skniro.agree.item.init;

import com.skniro.agree.Agree;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

public interface AgreeEquipmentAssetKeys {
    ResourceKey<EquipmentAsset> Ruby = register("ruby");

    static ResourceKey<EquipmentAsset> register(String name) {
        return ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.fromNamespaceAndPath(Agree.MOD_ID,name));
    }
}