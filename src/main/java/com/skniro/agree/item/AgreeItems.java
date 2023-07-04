package com.skniro.agree.item;

import com.skniro.agree.Agree;
import com.skniro.agree.item.init.AgreeArmorMaterials;
import com.skniro.agree.item.init.AgreeToolMaterials;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AgreeItems {
    //Tool
    public static final Item RUBY_SWORD = registerItem("ruby_sword", (new SwordItem(AgreeToolMaterials.RUBY, 3, -2.4F, new Item.Settings())));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", (new ShovelItem(AgreeToolMaterials.RUBY, 1.5F, -3.0F, new Item.Settings())));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", (new PickaxeItem(AgreeToolMaterials.RUBY, 1, -2.8F, new Item.Settings())));
    public static final Item RUBY_AXE = registerItem("ruby_axe", (new AxeItem(AgreeToolMaterials.RUBY, 5.0F, -3.0F, new Item.Settings())));
    public static final Item RUBY_HOE = registerItem("ruby_hoe", (new HoeItem(AgreeToolMaterials.RUBY, -3, 0.0F, new Item.Settings())));

    //Armor
    public static final Item RUBY_HELMET = registerItem("ruby_helmet", (new ArmorItem(AgreeArmorMaterials.Ruby, net.minecraft.item.ArmorItem.Type.HELMET, new Item.Settings())));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate", (new ArmorItem(AgreeArmorMaterials.Ruby, net.minecraft.item.ArmorItem.Type.CHESTPLATE, new Item.Settings())));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings", (new ArmorItem(AgreeArmorMaterials.Ruby, net.minecraft.item.ArmorItem.Type.LEGGINGS, new Item.Settings())));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots", (new ArmorItem(AgreeArmorMaterials.Ruby, net.minecraft.item.ArmorItem.Type.BOOTS, new Item.Settings())));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Agree.MOD_ID, name),item);
    }

    public static void registerModItems() {
        Agree.LOGGER.info("Registering Ruby Items for " + Agree.MOD_ID);
    }

}
