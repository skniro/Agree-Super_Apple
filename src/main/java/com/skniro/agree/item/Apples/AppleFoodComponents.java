package com.skniro.agree.item.Apples;

import com.skniro.agree.Agree;
import com.skniro.agree.item.init.SuspiciousAppleItem;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.EnchantedGoldenAppleItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class AppleFoodComponents {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, Agree.MOD_ID);
    public static final Supplier<Item> HASTE_APPLE =
            registerItem("haste_apple",
                    ()->     new Item(
            new Item
                    .Properties()
            .rarity(Rarity.RARE)
            .food
                    (new FoodProperties
                    .Builder()
                    .nutrition(6)
                    .saturationMod(0.3f)
                    .alwaysEat()
                    .effect
                            (new MobEffectInstance(MobEffects.DIG_SPEED,
                                    6000,
                                    2),
                                    1.0F)
                            .build()
                    )
            ));

    public static final Supplier<Item> SPEED_APPLE =
            registerItem("speed_apple",
                    ()->     new Item(
            new Item
                    .Properties()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationMod(0.3f)
                                    .alwaysEat()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,6000,2),1.0F)
                                    .build()
                            )
            ));

    public static final Supplier<Item> HEALTH_BOOST_APPLE = registerItem(
            "health_boost_apple",
            ()->     new Item(
            new Item
                    .Properties()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationMod(0.3f)
                                    .alwaysEat()
                                    .effect(new MobEffectInstance(MobEffects.HEALTH_BOOST,3000,1),1.0F)
                                    .effect(new MobEffectInstance(MobEffects.REGENERATION,300,2),1.0F)
                                    .build()
                            )
            ));

    public static final Supplier<Item> FIRE_RESISTANCE_APPLE = registerItem(
            "fire_resistance_apple",
            ()->     new Item(
            new Item
                    .Properties()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationMod(0.3f)
                                    .alwaysEat()
                                    .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE,6000,2),1.0F)
                                    .build()
                            )
            ));

    public static final Supplier<Item> HERO_VILLAGE_APPLE = registerItem(
            "village_hero_apple",
            ()->     new Item(
            new Item
                    .Properties()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationMod(0.3f)
                                    .alwaysEat()
                                    .effect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE,6000,2),1.0F)
                                    .build()
                            )
            ));

    public static final Supplier<Item> STRENGTH_APPLE = registerItem(
            "strength_apple",
            ()->     new Item(
            new Item
                    .Properties()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationMod(0.3f)
                                    .alwaysEat()
                                    .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST,6000,2),1.0F)
                                    .build()
                            )
            ));

    public static final Supplier<Item> NIGHT_VISION_APPLE = registerItem(
            "night_vision_apple",
            ()->     new Item(
            new Item
                    .Properties()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationMod(0.3f)
                                    .alwaysEat()
                                    .effect(new MobEffectInstance(MobEffects.NIGHT_VISION,6000,2),1.0F)
                                    .build()
                            )
            ));

    public static final Supplier<Item> JUMP_BOOST_APPLE  = registerItem(
            "jump_boost_apple",
            ()->  new Item(
                  new Item
                    .Properties()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationMod(0.3f)
                                    .alwaysEat()
                                    .effect(new MobEffectInstance(MobEffects.JUMP, 6000,1),1.0F)
                                    .build()
                            )
            ));
    public static final Supplier<Item> SUPER_APPLE = registerItem(
            "super_apple",
            ()->    new EnchantedGoldenAppleItem(
                    (
                    new Item.Properties()
                            .rarity(Rarity.EPIC)
                            .food(
                                    new FoodProperties.Builder()
                                            .nutrition(8)
                                            .saturationMod(0.6f)
                                            .alwaysEat()
                                            .effect(new MobEffectInstance(MobEffects.DIG_SPEED,12000,2),1.0F)
                                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,12000,2),1.0F)
                                            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST,12000,2),1.0F)
                                            .effect(new MobEffectInstance(MobEffects.REGENERATION,1200,2),1.0F)
                                            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,6000,2),1.0F)
                                            .effect(new MobEffectInstance(MobEffects.JUMP,12000,1),1.0F)
                                            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE,12000,2),1.0F)
                                            .effect(new MobEffectInstance(MobEffects.WATER_BREATHING,12000,2),1.0F)
                                            .effect(new MobEffectInstance(MobEffects.HEALTH_BOOST,6000,2),1.0F)
                                            .effect(new MobEffectInstance(MobEffects.ABSORPTION,1200,2),1.0F)
                                            .build()
                            )
                    )
            ));
    public static final Supplier<Item> SUSPICIOUS_APPLE = registerItem(
            "suspicious_apple",
            ()->    new Item(
                    new Item
                    .Properties()
                    .food(
                            AppleFoodComponents
                                    .createStew(6)
                                    .alwaysEat()
                                    .build()
                    )
    ));


    private static FoodProperties.Builder createStew(int hunger) {
        return new FoodProperties.Builder().nutrition(hunger).saturationMod(0.6f);
    }
    private static <T extends Item> Supplier<T> registerItem(String name, Supplier<T> item) {
        Supplier<T> toReturn = ITEMS.register(name, item);
        return toReturn;
    }


    public static void registerModItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

