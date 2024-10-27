package com.skniro.agree.item;

import com.skniro.agree.Agree;
import com.skniro.agree.item.init.AgreeArmorMaterials;
import com.skniro.agree.item.init.AgreeToolMaterials;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.item.*;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.equipment.ArmorType;
import java.util.function.Function;

public class AgreeItems {
    public static final Item RUBY = registerItem("ruby", Item::new, new Item.Properties());

    //Tool
    public static final Item RUBY_SWORD = registerItem("ruby_sword", (settings)-> new SwordItem(AgreeToolMaterials.RUBY,  3, -2.4F,settings), new Item.Properties());
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", (settings)->  new ShovelItem(AgreeToolMaterials.RUBY,2, -3.0F, settings), new Item.Properties());
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", (settings)->  new PickaxeItem(AgreeToolMaterials.RUBY,1, -2.8F, settings), new Item.Properties());
    public static final Item RUBY_AXE = registerItem("ruby_axe", (settings)->  new AxeItem(AgreeToolMaterials.RUBY,5, -3.0F, settings), new Item.Properties());
    public static final Item RUBY_HOE = registerItem("ruby_hoe", (settings)->  new HoeItem(AgreeToolMaterials.RUBY,-3, 0.0F, settings), new Item.Properties());

    //Armor
    public static final Item RUBY_HELMET = registerItem("ruby_helmet", (settings)->  new ArmorItem(AgreeArmorMaterials.Ruby, ArmorType.HELMET, settings), new Item.Properties().durability(ArmorType.HELMET.getDurability(AgreeArmorMaterials.Ruby_DURABILITY_MULTIPLIER)));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate", (settings)->  new ArmorItem(AgreeArmorMaterials.Ruby, ArmorType.CHESTPLATE, settings), new Item.Properties().durability(ArmorType.CHESTPLATE.getDurability(AgreeArmorMaterials.Ruby_DURABILITY_MULTIPLIER)));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings", (settings)->  new ArmorItem(AgreeArmorMaterials.Ruby, ArmorType.LEGGINGS, settings), new Item.Properties().durability(ArmorType.LEGGINGS.getDurability(AgreeArmorMaterials.Ruby_DURABILITY_MULTIPLIER)));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots", (settings)->  new ArmorItem(AgreeArmorMaterials.Ruby, ArmorType.BOOTS, settings), new Item.Properties().durability(ArmorType.BOOTS.getDurability(AgreeArmorMaterials.Ruby_DURABILITY_MULTIPLIER)));


    private static Item registerItem(String name, Function<Item.Properties, Item> factory, Item.Properties settings) {
        Item item = factory.apply(settings.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Agree.MOD_ID, name))));
        return Registry.register(BuiltInRegistries.ITEM, ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Agree.MOD_ID, name)), item);
    }

    public static void registerModItems() {
        Agree.LOGGER.info("Registering Ruby Items for " + Agree.MOD_ID);
    }

}
