package com.skniro.agree.item;

import com.skniro.agree.Agree;
import com.skniro.agree.item.init.AgreeArmorMaterials;
import com.skniro.agree.item.init.AgreeToolMaterials;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class AgreeItems {
    public static final Item RUBY = registerItem("ruby", Item::new, new Item.Settings());

    //Tool
    public static final Item RUBY_SWORD = registerItem("ruby_sword", Item::new, new Item.Settings().enchantable(25).sword(AgreeToolMaterials.RUBY,  3, -2.4F));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", (settings)->  new ShovelItem(AgreeToolMaterials.RUBY,2, -3.0F, settings), new Item.Settings().enchantable(25));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", Item::new, new Item.Settings().enchantable(25).pickaxe(AgreeToolMaterials.RUBY,1, -2.8F));
    public static final Item RUBY_AXE = registerItem("ruby_axe", (settings)->  new AxeItem(AgreeToolMaterials.RUBY,5, -3.0F, settings), new Item.Settings().enchantable(25));
    public static final Item RUBY_HOE = registerItem("ruby_hoe", (settings)->  new HoeItem(AgreeToolMaterials.RUBY,-3, 0.0F, settings), new Item.Settings().enchantable(25));

    //Armor
    public static final Item RUBY_HELMET = registerItem("ruby_helmet", Item::new, new Item.Settings().enchantable(25).armor(AgreeArmorMaterials.Ruby, EquipmentType.HELMET).maxDamage(EquipmentType.HELMET.getMaxDamage(AgreeArmorMaterials.Ruby_DURABILITY_MULTIPLIER)));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate", Item::new, new Item.Settings().enchantable(25).armor(AgreeArmorMaterials.Ruby, EquipmentType.CHESTPLATE).maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(AgreeArmorMaterials.Ruby_DURABILITY_MULTIPLIER)));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings", Item::new, new Item.Settings().enchantable(25).armor(AgreeArmorMaterials.Ruby, EquipmentType.LEGGINGS).maxDamage(EquipmentType.LEGGINGS.getMaxDamage(AgreeArmorMaterials.Ruby_DURABILITY_MULTIPLIER)));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots", Item::new, new Item.Settings().enchantable(25).armor(AgreeArmorMaterials.Ruby, EquipmentType.BOOTS).maxDamage(EquipmentType.BOOTS.getMaxDamage(AgreeArmorMaterials.Ruby_DURABILITY_MULTIPLIER)));


    private static Item registerItem(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
        Item item = factory.apply(settings.registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Agree.MOD_ID, name))));
        return Registry.register(Registries.ITEM, RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Agree.MOD_ID, name)), item);
    }

    public static void registerModItems() {
        Agree.LOGGER.info("Registering Ruby Items for " + Agree.MOD_ID);
    }

}
