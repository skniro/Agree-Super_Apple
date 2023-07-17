package com.skniro.agree;



import com.skniro.agree.item.Apples.AppleFoodComponents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.skniro.agree.Agree.*;
import static com.skniro.agree.item.Gemstone.*;
import static com.skniro.agree.block.Gemstone_Block.*;
import static com.skniro.agree.block.Gemstone_ore.*;



public class ModContent {


    public static void registerItem(){
        AppleFoodComponents.registerMapleFoodItems();
        Registry.register(Registry.ITEM,new Identifier(MOD_ID,"ruby"),RUBY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ruby_ore"), new BlockItem(RUBY_ORE, new FabricItemSettings().group(Agree.Agree_Group)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ruby_block"), new BlockItem(RUBY_BLOCK, new FabricItemSettings().group(Agree.Agree_Group)));

    }
    public static void registerBlock(){
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "ruby_ore"), RUBY_ORE);
    }

    public static void CreativeTab() {
    }
}
