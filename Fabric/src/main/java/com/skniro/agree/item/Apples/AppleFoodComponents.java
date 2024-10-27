package com.skniro.agree.item.Apples;

import com.skniro.agree.Agree;
import com.skniro.agree.item.init.SuspiciousAppleItem;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.List;
import java.util.function.Function;

public class AppleFoodComponents {
    public static final Item HASTE_APPLE = registerItem("haste_apple",
            Item::new,
            new Item
            .Settings()
            .rarity(Rarity.RARE)
            .food
                    (new FoodComponent
                    .Builder()
                                    .nutrition(6)
                    .saturationModifier(0.3f)
                    .alwaysEdible()
                            .build()
                            , ConsumableComponents.food()
                                    .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HASTE,
                                                    6000,
                                                    2),
                                                    1.0F)
                                    )
                                    .build()
                    )
            );

    public static final Item SPEED_APPLE = registerItem("speed_apple",
            Item::new,
            new Item
                    .Settings()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.3f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SPEED,6000,2),1.0F)
                                            )
                                            .build()
                            )
            );

    public static final Item HEALTH_BOOST_APPLE = registerItem("health_boost_apple",
            Item::new,
            new Item
                    .Settings()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.3f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(List.of(
                                                    new StatusEffectInstance(StatusEffects.HEALTH_BOOST,3000,1),
                                                    new StatusEffectInstance(StatusEffects.REGENERATION,300,2)
                                                    ))
                                            )
                                            .build()
                            )
            );

    public static final Item FIRE_RESISTANCE_APPLE = registerItem("fire_resistance_apple",
            Item::new,
            new Item
                    .Settings()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.3f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,6000,2),1.0F)
                                            )
                                            .build()
                            )
            );

    public static final Item HERO_VILLAGE_APPLE = registerItem("village_hero_apple",
            Item::new,
            new Item
                    .Settings()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.3f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE,6000,2),1.0F)
                                            )
                                            .build()
                            )
            );

    public static final Item STRENGTH_APPLE = registerItem("strength_apple",
            Item::new,
            new Item
                    .Settings()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.3f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.STRENGTH,6000,2),1.0F)
                                            )
                                            .build()
                            )
            );

    public static final Item NIGHT_VISION_APPLE = registerItem("night_vision_apple",
            Item::new,
            new Item
                    .Settings()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.3f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,6000,2),1.0F)
                                            )
                                            .build()
                            )
            );

    public static final Item JUMP_BOOST_APPLE  = registerItem("jump_boost_apple",
            Item::new,
            new Item
                    .Settings()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.3f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST ,6000,1),1.0F)
                                            )
                                            .build()
                            )
            );
    public static final Item SUPER_APPLE = registerItem("super_apple",
            Item::new,
                    (
                    new Item.Settings()
                            .rarity(Rarity.EPIC)
                            .component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)
                            .food(
                                    new FoodComponent.Builder()
                                            .nutrition(8)
                                            .saturationModifier(0.6f)
                                            .alwaysEdible()
                                            .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(List.of(
                                                    new StatusEffectInstance(StatusEffects.HASTE,12000,2),
                                                    new StatusEffectInstance(StatusEffects.SPEED,12000,2),
                                                    new StatusEffectInstance(StatusEffects.STRENGTH,12000,2),
                                                    new StatusEffectInstance(StatusEffects.REGENERATION,1200,2),
                                                    new StatusEffectInstance(StatusEffects.RESISTANCE,6000,2),
                                                    new StatusEffectInstance(StatusEffects.JUMP_BOOST,12000,1),
                                                    new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,12000,2),
                                                    new StatusEffectInstance(StatusEffects.WATER_BREATHING,12000,2),
                                                    new StatusEffectInstance(StatusEffects.HEALTH_BOOST,6000,2),
                                                    new StatusEffectInstance(StatusEffects.ABSORPTION,1200,2)
                                                    ))
                                            )
                                            .build()
                            )
                    )
            );
    public static final Item SUSPICIOUS_APPLE = registerItem("suspicious_apple",
            SuspiciousAppleItem::new,
            new Item
                    .Settings()
                    .food(
                            AppleFoodComponents
                                    .createStew(6)
                                    .alwaysEdible()
                                    .build()
                    )
    );
    private static FoodComponent.Builder createStew(int nutrition) {
        return new FoodComponent.Builder().nutrition(nutrition).saturationModifier(0.6f);
    }


    private static Item registerItem(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
        Item item = factory.apply(settings.registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Agree.MOD_ID, name))));
        return Registry.register(Registries.ITEM, RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Agree.MOD_ID, name)), item);
    }
}

