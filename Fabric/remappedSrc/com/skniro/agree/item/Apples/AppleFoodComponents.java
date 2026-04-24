package com.skniro.agree.item.Apples;

import com.skniro.agree.Agree;
import com.skniro.agree.item.init.SuspiciousAppleItem;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.item.*;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import java.util.List;
import java.util.function.Function;

public class AppleFoodComponents {
    public static final Item HASTE_APPLE = registerItem("haste_apple",
            Item::new,
            new Item
            .Properties()
            .rarity(Rarity.RARE)
            .food
                    (new FoodProperties
                    .Builder()
                                    .nutrition(6)
                    .saturationModifier(0.3f)
                    .alwaysEdible()
                            .build()
                            , Consumables.defaultFood()
                                    .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HASTE,
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
                    .Properties()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.3f)
                                    .alwaysEdible()
                                    .build()
                                    , Consumables.defaultFood()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED,6000,2),1.0F)
                                            )
                                            .build()
                            )
            );

    public static final Item HEALTH_BOOST_APPLE = registerItem("health_boost_apple",
            Item::new,
            new Item
                    .Properties()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.3f)
                                    .alwaysEdible()
                                    .build()
                                    , Consumables.defaultFood()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(List.of(
                                                    new MobEffectInstance(MobEffects.HEALTH_BOOST,3000,1),
                                                    new MobEffectInstance(MobEffects.REGENERATION,300,2)
                                                    ))
                                            )
                                            .build()
                            )
            );

    public static final Item FIRE_RESISTANCE_APPLE = registerItem("fire_resistance_apple",
            Item::new,
            new Item
                    .Properties()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.3f)
                                    .alwaysEdible()
                                    .build()
                                    , Consumables.defaultFood()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE,6000,2),1.0F)
                                            )
                                            .build()
                            )
            );

    public static final Item HERO_VILLAGE_APPLE = registerItem("village_hero_apple",
            Item::new,
            new Item
                    .Properties()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.3f)
                                    .alwaysEdible()
                                    .build()
                                    , Consumables.defaultFood()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE,6000,2),1.0F)
                                            )
                                            .build()
                            )
            );

    public static final Item STRENGTH_APPLE = registerItem("strength_apple",
            Item::new,
            new Item
                    .Properties()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.3f)
                                    .alwaysEdible()
                                    .build()
                                    , Consumables.defaultFood()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.STRENGTH,6000,2),1.0F)
                                            )
                                            .build()
                            )
            );

    public static final Item NIGHT_VISION_APPLE = registerItem("night_vision_apple",
            Item::new,
            new Item
                    .Properties()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.3f)
                                    .alwaysEdible()
                                    .build()
                                    , Consumables.defaultFood()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NIGHT_VISION,6000,2),1.0F)
                                            )
                                            .build()
                            )
            );

    public static final Item JUMP_BOOST_APPLE  = registerItem("jump_boost_apple",
            Item::new,
            new Item
                    .Properties()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.3f)
                                    .alwaysEdible()
                                    .build()
                                    , Consumables.defaultFood()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.JUMP_BOOST ,6000,1),1.0F)
                                            )
                                            .build()
                            )
            );
    public static final Item SUPER_APPLE = registerItem("super_apple",
            Item::new,
                    (
                    new Item.Properties()
                            .rarity(Rarity.EPIC)
                            .component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)
                            .food(
                                    new FoodProperties.Builder()
                                            .nutrition(8)
                                            .saturationModifier(0.6f)
                                            .alwaysEdible()
                                            .build()
                                    , Consumables.defaultFood()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(List.of(
                                                    new MobEffectInstance(MobEffects.HASTE,12000,2),
                                                    new MobEffectInstance(MobEffects.SPEED,12000,2),
                                                    new MobEffectInstance(MobEffects.STRENGTH,12000,2),
                                                    new MobEffectInstance(MobEffects.REGENERATION,1200,2),
                                                    new MobEffectInstance(MobEffects.RESISTANCE,6000,2),
                                                    new MobEffectInstance(MobEffects.JUMP_BOOST,12000,1),
                                                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE,12000,2),
                                                    new MobEffectInstance(MobEffects.WATER_BREATHING,12000,2),
                                                    new MobEffectInstance(MobEffects.HEALTH_BOOST,6000,2),
                                                    new MobEffectInstance(MobEffects.ABSORPTION,1200,2)
                                                    ))
                                            )
                                            .build()
                            )
                    )
            );
    public static final Item SUSPICIOUS_APPLE = registerItem("suspicious_apple",
            SuspiciousAppleItem::new,
            new Item
                    .Properties()
                    .food(
                            AppleFoodComponents
                                    .createStew(6)
                                    .alwaysEdible()
                                    .build()
                    )
    );
    private static FoodProperties.Builder createStew(int nutrition) {
        return new FoodProperties.Builder().nutrition(nutrition).saturationModifier(0.6f);
    }


    private static Item registerItem(String name, Function<Item.Properties, Item> factory, Item.Properties settings) {
        Item item = factory.apply(settings.setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Agree.MOD_ID, name))));
        return Registry.register(BuiltInRegistries.ITEM, ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Agree.MOD_ID, name)), item);
    }
}

