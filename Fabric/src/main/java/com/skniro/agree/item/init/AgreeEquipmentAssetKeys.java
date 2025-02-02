package com.skniro.agree.item.init;

import com.skniro.agree.Agree;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public interface AgreeEquipmentAssetKeys {
    RegistryKey<EquipmentAsset> RUBY = register("ruby");

    static RegistryKey<EquipmentAsset> register(String name) {
        return RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(Agree.MOD_ID, name));
    }
}