package com.skniro.agree.item;

import com.skniro.agree.Agree;
import com.skniro.agree.item.init.AgreeArmorMaterials;
import com.skniro.agree.item.init.AgreeToolMaterials;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AgreeItems {
    //Tool
    public static final Item RUBY_SWORD = registerItem("ruby_sword", (new SwordItem(AgreeToolMaterials.RUBY, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(AgreeToolMaterials.RUBY, 3, -2.4F)))));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", (new ShovelItem(AgreeToolMaterials.RUBY, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(AgreeToolMaterials.RUBY, 2, -3.0F)))));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", (new PickaxeItem(AgreeToolMaterials.RUBY, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(AgreeToolMaterials.RUBY, 1, -2.8F)))));
    public static final Item RUBY_AXE = registerItem("ruby_axe", (new AxeItem(AgreeToolMaterials.RUBY, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(AgreeToolMaterials.RUBY, 5, -3.0F)))));
    public static final Item RUBY_HOE = registerItem("ruby_hoe", (new HoeItem(AgreeToolMaterials.RUBY, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(AgreeToolMaterials.RUBY, -3, 0.0F)))));

    //Armor
    public static final Item RUBY_HELMET = registerItem("ruby_helmet", (new ArmorItem(AgreeArmorMaterials.Ruby, EquipmentType.HELMET, new Item.Settings().maxDamage(EquipmentType.HELMET.getMaxDamage(AgreeArmorMaterials.Ruby_DURABILITY_MULTIPLIER)))));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate", (new ArmorItem(AgreeArmorMaterials.Ruby, EquipmentType.CHESTPLATE, new Item.Settings().maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(AgreeArmorMaterials.Ruby_DURABILITY_MULTIPLIER)))));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings", (new ArmorItem(AgreeArmorMaterials.Ruby, EquipmentType.LEGGINGS, new Item.Settings().maxDamage(EquipmentType.LEGGINGS.getMaxDamage(AgreeArmorMaterials.Ruby_DURABILITY_MULTIPLIER)))));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots", (new ArmorItem(AgreeArmorMaterials.Ruby, EquipmentType.BOOTS, new Item.Settings().maxDamage(EquipmentType.BOOTS.getMaxDamage(AgreeArmorMaterials.Ruby_DURABILITY_MULTIPLIER)))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Agree.MOD_ID, name),item);
    }

    public static void registerModItems() {
        Agree.LOGGER.info("Registering Ruby Items for " + Agree.MOD_ID);
    }

}
