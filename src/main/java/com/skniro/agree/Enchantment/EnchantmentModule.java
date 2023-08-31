package com.skniro.agree.Enchantment;

import com.skniro.agree.Agree;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.ProtectionEnchantment;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.skniro.agree.Enchantment.AdvancedProtectionEnchantment.ALL_ARMOR;

public class EnchantmentModule {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, Agree.MOD_ID);

    public static RegistryObject<Enchantment> Advanced_Protection = ENCHANTMENTS.register("advanced_projection",
            ()-> new AdvancedProtectionEnchantment(Enchantment.Rarity.RARE, ProtectionEnchantment.Type.ALL, ALL_ARMOR));

    public static RegistryObject<Enchantment> Advanced_Fire_Protection = ENCHANTMENTS.register("advanced_fire_projection",
            ()-> new AdvancedProtectionEnchantment(Enchantment.Rarity.RARE, ProtectionEnchantment.Type.FIRE, ALL_ARMOR));

    public static RegistryObject<Enchantment> Advanced_Feather_Falling = ENCHANTMENTS.register("advanced_feather_falling",
            ()-> new AdvancedProtectionEnchantment(Enchantment.Rarity.RARE, ProtectionEnchantment.Type.FALL, ALL_ARMOR));

    public static RegistryObject<Enchantment> Advanced_Blast_Projection = ENCHANTMENTS.register("advanced_blast_projection",
            ()-> new AdvancedProtectionEnchantment(Enchantment.Rarity.RARE, ProtectionEnchantment.Type.EXPLOSION, ALL_ARMOR));

    public static RegistryObject<Enchantment> Advanced_Projectile_Projection = ENCHANTMENTS.register("advanced_projectile_projection",
            ()-> new AdvancedProtectionEnchantment(Enchantment.Rarity.RARE, ProtectionEnchantment.Type.PROJECTILE, ALL_ARMOR));

    public static RegistryObject<Enchantment> Advanced_Sharpness = ENCHANTMENTS.register("advanced_sharpness",
            ()->  new AdvancedDamageEnchantment(Enchantment.Rarity.UNCOMMON,0, EquipmentSlot.MAINHAND));


    public static void register(IEventBus eventBus) {
        ENCHANTMENTS.register(eventBus);
    }
}
