package com.skniro.agree.item;

import com.skniro.agree.Agree;
import com.skniro.agree.item.init.AgreeArmorMaterials;
import com.skniro.agree.item.init.AgreeToolMaterials;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;
import java.util.function.Supplier;

public class AgreeItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Agree.MOD_ID);

    public static final Supplier<Item> RUBY = registerItem("ruby", Item::new, new Item.Properties());
    //Tool
    public static final Supplier<Item> RUBY_SWORD = registerItem("ruby_sword", (settings)-> new SwordItem(AgreeToolMaterials.RUBY,  3, -2.4F,settings), new Item.Properties());
    public static final Supplier<Item> RUBY_SHOVEL = registerItem("ruby_shovel", (settings)->  new ShovelItem(AgreeToolMaterials.RUBY,2, -3.0F, settings), new Item.Properties());
    public static final Supplier<Item> RUBY_PICKAXE = registerItem("ruby_pickaxe", (settings)->  new PickaxeItem(AgreeToolMaterials.RUBY,1, -2.8F, settings), new Item.Properties());
    public static final Supplier<Item> RUBY_AXE = registerItem("ruby_axe", (settings)->  new AxeItem(AgreeToolMaterials.RUBY,5, -3.0F, settings), new Item.Properties());
    public static final Supplier<Item> RUBY_HOE = registerItem("ruby_hoe", (settings)->  new HoeItem(AgreeToolMaterials.RUBY,-3, 0.0F, settings), new Item.Properties());

    //Armor
    public static final Supplier<Item> RUBY_HELMET = registerItem("ruby_helmet", (settings)->  new ArmorItem(AgreeArmorMaterials.Ruby, ArmorType.HELMET, settings), new Item.Properties().durability(ArmorType.HELMET.getDurability(AgreeArmorMaterials.Ruby_DURABILITY_MULTIPLIER)));
    public static final Supplier<Item> RUBY_CHESTPLATE = registerItem("ruby_chestplate", (settings)->  new ArmorItem(AgreeArmorMaterials.Ruby, ArmorType.CHESTPLATE, settings), new Item.Properties().durability(ArmorType.CHESTPLATE.getDurability(AgreeArmorMaterials.Ruby_DURABILITY_MULTIPLIER)));
    public static final Supplier<Item> RUBY_LEGGINGS = registerItem("ruby_leggings", (settings)->  new ArmorItem(AgreeArmorMaterials.Ruby, ArmorType.LEGGINGS, settings), new Item.Properties().durability(ArmorType.LEGGINGS.getDurability(AgreeArmorMaterials.Ruby_DURABILITY_MULTIPLIER)));
    public static final Supplier<Item> RUBY_BOOTS = registerItem("ruby_boots", (settings)->  new ArmorItem(AgreeArmorMaterials.Ruby, ArmorType.BOOTS, settings), new Item.Properties().durability(ArmorType.BOOTS.getDurability(AgreeArmorMaterials.Ruby_DURABILITY_MULTIPLIER)));

    private static <T extends Item> DeferredItem<T> registerItem(String name, Function<Item.Properties, ? extends T> item, Item.Properties properties) {
        DeferredItem<T> toReturn = ITEMS.registerItem(name, item, properties.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Agree.MOD_ID, name))));
        return toReturn;
    }

    public static void registerModItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
