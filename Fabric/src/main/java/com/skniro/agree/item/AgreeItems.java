package com.skniro.agree.item;

import com.skniro.agree.Agree;
import com.skniro.agree.item.init.AgreeArmorMaterials;
import com.skniro.agree.item.init.AgreeToolMaterials;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.equipment.ArmorType;
import java.util.function.Function;

public class AgreeItems {
    public static final Item RUBY = registerItem("ruby", Item::new, new Item.Properties());

    //Tool
    public static final Item RUBY_SWORD = registerItem("ruby_sword", Item::new, new Item.Properties().enchantable(25).sword(AgreeToolMaterials.RUBY,  3, -2.4F));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", (settings)->  new ShovelItem(AgreeToolMaterials.RUBY,2, -3.0F, settings), new Item.Properties().enchantable(25));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", Item::new, new Item.Properties().enchantable(25).pickaxe(AgreeToolMaterials.RUBY,1, -2.8F));
    public static final Item RUBY_AXE = registerItem("ruby_axe", (settings)->  new AxeItem(AgreeToolMaterials.RUBY,5, -3.0F, settings), new Item.Properties().enchantable(25));
    public static final Item RUBY_HOE = registerItem("ruby_hoe", (settings)->  new HoeItem(AgreeToolMaterials.RUBY,-3, 0.0F, settings), new Item.Properties().enchantable(25));

    //Armor
    public static final Item RUBY_HELMET = registerItem("ruby_helmet", Item::new, new Item.Properties().enchantable(25).humanoidArmor(AgreeArmorMaterials.Ruby, ArmorType.HELMET).durability(ArmorType.HELMET.getDurability(AgreeArmorMaterials.Ruby_DURABILITY_MULTIPLIER)));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate", Item::new, new Item.Properties().enchantable(25).humanoidArmor(AgreeArmorMaterials.Ruby, ArmorType.CHESTPLATE).durability(ArmorType.CHESTPLATE.getDurability(AgreeArmorMaterials.Ruby_DURABILITY_MULTIPLIER)));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings", Item::new, new Item.Properties().enchantable(25).humanoidArmor(AgreeArmorMaterials.Ruby, ArmorType.LEGGINGS).durability(ArmorType.LEGGINGS.getDurability(AgreeArmorMaterials.Ruby_DURABILITY_MULTIPLIER)));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots", Item::new, new Item.Properties().enchantable(25).humanoidArmor(AgreeArmorMaterials.Ruby, ArmorType.BOOTS).durability(ArmorType.BOOTS.getDurability(AgreeArmorMaterials.Ruby_DURABILITY_MULTIPLIER)));


    private static Item registerItem(String name, Function<Item.Properties, Item> factory, Item.Properties settings) {
        Item item = factory.apply(settings.setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Agree.MOD_ID, name))));
        return Registry.register(BuiltInRegistries.ITEM, ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Agree.MOD_ID, name)), item);
    }

    public static void registerModItems() {
        Agree.LOGGER.info("Registering Ruby Items for " + Agree.MOD_ID);
    }

}
