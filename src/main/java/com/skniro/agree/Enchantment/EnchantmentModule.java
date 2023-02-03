package com.skniro.agree.Enchantment;

import com.skniro.agree.Agree;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.ProtectionEnchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.skniro.agree.Enchantment.AdvancedProtectionEnchantment.ALL_ARMOR;
import static net.minecraft.registry.Registries.ENCHANTMENT;

public class EnchantmentModule {

    public static Enchantment Advanced_Protection = register("advanced_projection",
            new AdvancedProtectionEnchantment(Enchantment.Rarity.RARE, ProtectionEnchantment.Type.ALL, ALL_ARMOR));

    public static Enchantment Advanced_FIRE_PROTECTION = register("advanced_fire_projection",
            new AdvancedProtectionEnchantment(Enchantment.Rarity.RARE, ProtectionEnchantment.Type.FIRE, ALL_ARMOR));

    public static Enchantment Advanced_FEATHER_FALLING = register("advanced_feather_falling",
            new AdvancedProtectionEnchantment(Enchantment.Rarity.RARE, ProtectionEnchantment.Type.FALL, ALL_ARMOR));

    public static Enchantment Advanced_BLAST_PROTECTION = register("advanced_blast_projection",
            new AdvancedProtectionEnchantment(Enchantment.Rarity.RARE, ProtectionEnchantment.Type.EXPLOSION, ALL_ARMOR));

    public static Enchantment Advanced_PROJECTILE_PROTECTION = register("advanced_projectile_projection",
            new AdvancedProtectionEnchantment(Enchantment.Rarity.RARE, ProtectionEnchantment.Type.PROJECTILE, ALL_ARMOR));

    public static Enchantment Advanced_SHARPNESS = register("advanced_sharpness",
            new AdvancedDamageEnchantment(Enchantment.Rarity.UNCOMMON,0, EquipmentSlot.MAINHAND));


    public static Enchantment register(String name, Enchantment enchantment) {
        return  Registry.register(ENCHANTMENT, new Identifier(Agree.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
        System.out.println("Registering Enchantments for " + Agree.MOD_ID);
    }
}
