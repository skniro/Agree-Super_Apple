package com.skniro.agree.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class Food {

 public static final FoodComponent HASTE_APPLE = new FoodComponent.Builder().hunger(6).saturationModifier(0.3f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.HASTE,6000,2),1.0F).build();
 public static final FoodComponent SUPER_APPLE = new FoodComponent.Builder()
         .hunger(8)
         .saturationModifier(0.6f)
         .alwaysEdible()
         .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,12000,2),1.0F)
         .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,12000,2),1.0F)
         .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,12000,2),1.0F)
         .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,1200,2),1.0F)
         .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,6000,2),1.0F)
         .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,12000,1),1.0F)
         .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,12000,2),1.0F)
         .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,12000,2),1.0F)
         .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,6000,2),1.0F)
          .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,1200,2),1.0F)
         .build();
 public static final FoodComponent SPEED_APPLE = new FoodComponent.Builder().hunger(6).saturationModifier(0.3f).alwaysEdible()
         .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,6000,2),1.0F).build();
 public static final FoodComponent HEALTH_BOOST_APPLE = new FoodComponent.Builder().hunger(6).saturationModifier(0.3f).alwaysEdible()
         .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,3000,1),1.0F).build();
 public static final FoodComponent FIRE_RESISTANCE_APPLE = new FoodComponent.Builder().hunger(6).saturationModifier(0.3f).alwaysEdible()
         .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,6000,2),1.0F).build();
 public static final FoodComponent HERO_VILLAGE_APPLE = new FoodComponent.Builder().hunger(6).saturationModifier(0.3f).alwaysEdible()
         .statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE,6000,2),1.0F).build();
 public static final FoodComponent STRENGTH_APPLE = new FoodComponent.Builder().hunger(6).saturationModifier(0.3f).alwaysEdible()
         .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,6000,2),1.0F).build();
 public static final FoodComponent NIGHT_VISION_APPLE = new FoodComponent.Builder().hunger(6).saturationModifier(0.3f).alwaysEdible()
         .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,6000,2),1.0F).build();
 public static final FoodComponent JUMP_BOOST_APPLE = new FoodComponent.Builder().hunger(6).saturationModifier(0.3f).alwaysEdible()
         .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST ,6000,1),1.0F).build();


}
