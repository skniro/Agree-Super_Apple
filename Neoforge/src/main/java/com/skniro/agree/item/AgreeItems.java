package com.skniro.agree.item;

import com.skniro.agree.Agree;
import com.skniro.agree.item.init.AgreeArmorMaterials;
import com.skniro.agree.item.init.AgreeToolMaterials;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class AgreeItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Agree.MOD_ID);

    public static final DeferredItem<Item> RUBY = registerItem("ruby", Item::new);


    public static final DeferredItem<Item> RUBY_SWORD = registerItem("ruby_sword", (settings) -> new Item(AgreeToolMaterials.RUBY.applySwordProperties(settings, 3, 2.4F).enchantable(25)));
    public static final DeferredItem<Item> RUBY_SHOVEL = registerItem("ruby_shovel", (settings)->  new ShovelItem(AgreeToolMaterials.RUBY,2, -3.0F, settings.enchantable(25)));
    public static final DeferredItem<Item> RUBY_PICKAXE = registerItem("ruby_pickaxe",  (settings) -> new Item(AgreeToolMaterials.RUBY.applyToolProperties(settings, BlockTags.MINEABLE_WITH_PICKAXE,1, -2.8F, 0.0F).enchantable(25)));
    public static final DeferredItem<Item> RUBY_AXE = registerItem("ruby_axe", (settings)->  new AxeItem(AgreeToolMaterials.RUBY,5, -3.0F, settings.enchantable(25)));
    public static final DeferredItem<Item> RUBY_HOE = registerItem("ruby_hoe", (settings)->  new HoeItem(AgreeToolMaterials.RUBY,-3, 0.0F, settings.enchantable(25)));

    //Armor
    public static final DeferredItem<Item> RUBY_HELMET = registerItem("ruby_helmet", (settings) -> new Item(settings.humanoidArmor(AgreeArmorMaterials.Ruby, ArmorType.HELMET).enchantable(25).durability(ArmorType.HELMET.getDurability(AgreeArmorMaterials.Ruby_DURABILITY_MULTIPLIER))));
    public static final DeferredItem<Item> RUBY_CHESTPLATE = registerItem("ruby_chestplate", (settings) -> new Item(settings.enchantable(25).humanoidArmor(AgreeArmorMaterials.Ruby, ArmorType.CHESTPLATE).durability(ArmorType.CHESTPLATE.getDurability(AgreeArmorMaterials.Ruby_DURABILITY_MULTIPLIER))));
    public static final DeferredItem<Item> RUBY_LEGGINGS = registerItem("ruby_leggings", (settings) -> new Item(settings.enchantable(25).humanoidArmor(AgreeArmorMaterials.Ruby, ArmorType.LEGGINGS).durability(ArmorType.LEGGINGS.getDurability(AgreeArmorMaterials.Ruby_DURABILITY_MULTIPLIER))));
    public static final DeferredItem<Item> RUBY_BOOTS = registerItem("ruby_boots", (settings) -> new Item(settings.enchantable(25).humanoidArmor(AgreeArmorMaterials.Ruby, ArmorType.BOOTS).durability(ArmorType.BOOTS.getDurability(AgreeArmorMaterials.Ruby_DURABILITY_MULTIPLIER))));

    private static <T extends Item> DeferredItem<T> registerItem(String name, Function<Item.Properties, ? extends T> item) {
        DeferredItem<T> toReturn = ITEMS.registerItem(name, item, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Agree.MOD_ID, name))));
        return toReturn;
    }


    public static void registerModItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
