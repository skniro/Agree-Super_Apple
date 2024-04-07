package com.skniro.agree.item;

import com.skniro.agree.Agree;
import com.skniro.agree.item.init.AgreeArmorMaterials;
import com.skniro.agree.item.init.AgreeToolMaterials;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;


import java.util.function.Supplier;

public class AgreeItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, Agree.MOD_ID);
    //Tool
    public static final Supplier<Item> RUBY_SWORD = registerItem("ruby_sword",
            ()-> new SwordItem(AgreeToolMaterials.RUBY, 3, -2.4F, new Item.Properties()));
    public static final Supplier<Item> RUBY_SHOVEL = registerItem("ruby_shovel",
            ()-> new ShovelItem(AgreeToolMaterials.RUBY, 1.5F, -3.0F, new Item.Properties()));
    public static final Supplier<Item> RUBY_PICKAXE = registerItem("ruby_pickaxe",
            ()-> new PickaxeItem(AgreeToolMaterials.RUBY, 1, -2.8F, new Item.Properties()));
    public static final Supplier<Item> RUBY_AXE = registerItem("ruby_axe",
            ()-> new AxeItem(AgreeToolMaterials.RUBY, 5.0F, -3.0F, new Item.Properties()));
    public static final Supplier<Item> RUBY_HOE = registerItem("ruby_hoe",
            ()-> new HoeItem(AgreeToolMaterials.RUBY, -3, 0.0F, new Item.Properties()));

    //Armor
    public static final Supplier<Item> RUBY_HELMET = registerItem("ruby_helmet",
            ()-> new ArmorItem(AgreeArmorMaterials.Ruby, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Supplier<Item> RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            ()-> new ArmorItem(AgreeArmorMaterials.Ruby, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final Supplier<Item> RUBY_LEGGINGS = registerItem("ruby_leggings",
            ()-> new ArmorItem(AgreeArmorMaterials.Ruby, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final Supplier<Item> RUBY_BOOTS = registerItem("ruby_boots",
            ()-> new ArmorItem(AgreeArmorMaterials.Ruby, ArmorItem.Type.BOOTS, new Item.Properties()));

    private static <T extends Item> Supplier<T> registerItem(String name, Supplier<T> item) {
        Supplier<T> toReturn = ITEMS.register(name, item);
        return toReturn;
    }

    public static void registerModItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
