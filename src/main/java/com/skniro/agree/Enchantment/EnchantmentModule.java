package com.skniro.agree.Enchantment;

import com.skniro.agree.Agree;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.ProtectionEnchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.skniro.agree.Enchantment.AdvancedProtectionEnchantment.ALL_ARMOR;
import static net.minecraft.util.registry.Registry.ENCHANTMENT;

public class EnchantmentModule {

    public static Enchantment Advanced_Protection = register("advanced_projection",
            new AdvancedProtectionEnchantment(Enchantment.Weight.RARE, ProtectionEnchantment.Type.ALL, ALL_ARMOR));

    public static Enchantment Advanced_Fire_Protection = register("advanced_fire_projection",
            new AdvancedProtectionEnchantment(Enchantment.Weight.RARE, ProtectionEnchantment.Type.FIRE, ALL_ARMOR));

    public static Enchantment Advanced_Feather_Falling = register("advanced_feather_falling",
            new AdvancedProtectionEnchantment(Enchantment.Weight.RARE, ProtectionEnchantment.Type.FALL, ALL_ARMOR));

    public static Enchantment Advanced_Blast_Projection = register("advanced_blast_projection",
            new AdvancedProtectionEnchantment(Enchantment.Weight.RARE, ProtectionEnchantment.Type.EXPLOSION, ALL_ARMOR));

    public static Enchantment Advanced_Projectile_Projection = register("advanced_projectile_projection",
            new AdvancedProtectionEnchantment(Enchantment.Weight.RARE, ProtectionEnchantment.Type.PROJECTILE, ALL_ARMOR));

    public static Enchantment Advanced_Sharpness = register("advanced_sharpness",
            new AdvancedDamageEnchantment(Enchantment.Weight.UNCOMMON,0, EquipmentSlot.MAINHAND));


    public static Enchantment register(String name, Enchantment enchantment) {
        return  Registry.register(ENCHANTMENT, new Identifier(Agree.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
        System.out.println("Registering Enchantments for " + Agree.MOD_ID);
    }
}
