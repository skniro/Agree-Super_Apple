package com.skniro.agree.util;

import com.skniro.agree.item.Apples.AppleFoodComponents;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

public class ModLootTableModifiers {
    private static final ResourceLocation GRASS_BLOCK_ID
            = ResourceLocation.fromNamespaceAndPath("minecraft", "blocks/grass");
    private static final ResourceLocation IGLOO_STRUCTURE_CHEST_ID
            = ResourceLocation.fromNamespaceAndPath("minecraft", "chests/igloo_chest");
    private static final ResourceLocation Mineshaft_STRUCTURE_CHEST_ID
            = ResourceLocation.fromNamespaceAndPath("minecraft", "chests/abandoned_mineshaft");
    private static final ResourceLocation Ancient_City_CHEST_ID
            = ResourceLocation.fromNamespaceAndPath("minecraft", "chests/ancient_city");
    private static final ResourceLocation Bastion_Bridge_CHEST_ID
            = ResourceLocation.fromNamespaceAndPath("minecraft", "chests/bastion_bridge");
    private static final ResourceLocation Bastion_Hoglin_Stable_CHEST_ID
            = ResourceLocation.fromNamespaceAndPath("minecraft", "chests/bastion_hoglin_stable");
    private static final ResourceLocation Bastion_Other_CHEST_ID
            = ResourceLocation.fromNamespaceAndPath("minecraft", "chests/bastion_other");
    private static final ResourceLocation Bastion_Treasure_CHEST_ID
            = ResourceLocation.fromNamespaceAndPath("minecraft", "chests/bastion_treasure");
    private static final ResourceLocation Buried_Treasure_CHEST_ID
            = ResourceLocation.fromNamespaceAndPath("minecraft", "chests/buried_treasure");
    private static final ResourceLocation End_City_Treasure_CHEST_ID
            = ResourceLocation.fromNamespaceAndPath("minecraft", "chests/end_city_treasure");
    private static final ResourceLocation Desert_Pyramid_ID
            = ResourceLocation.fromNamespaceAndPath("minecraft", "chests/desert_pyramid");
    private static final ResourceLocation Jungle_Temple_CHEST_ID
            = ResourceLocation.fromNamespaceAndPath("minecraft", "chests/jungle_temple");
    private static final ResourceLocation Jungle_Temple_Dispenser_CHEST_ID
            = ResourceLocation.fromNamespaceAndPath("minecraft", "chests/jungle_temple_dispenser");
    private static final ResourceLocation Underwater_Ruin_Small_CHEST_ID
            = ResourceLocation.fromNamespaceAndPath("minecraft", "chests/underwater_ruin_small");
    private static final ResourceLocation Underwater_Ruin_Big_CHEST_ID
            = ResourceLocation.fromNamespaceAndPath("minecraft", "chests/underwater_ruin_big");
    private static final ResourceLocation Stronghold_Corridor_CHEST_ID
            = ResourceLocation.fromNamespaceAndPath("minecraft", "chests/stronghold_corridor");
    private static final ResourceLocation Stronghold_Crossing_CHEST_ID
            = ResourceLocation.fromNamespaceAndPath("minecraft", "chests/stronghold_crossing");
    private static final ResourceLocation Pillager_Outpost_CHEST_ID
            = ResourceLocation.fromNamespaceAndPath("minecraft", "chests/pillager_outpost");
    private static final ResourceLocation Ruined_Portal_CHEST_ID
            = ResourceLocation.fromNamespaceAndPath("minecraft", "chests/ruined_portal");
    private static final ResourceLocation Woodland_Mansion_CHEST_ID
            = ResourceLocation.fromNamespaceAndPath("minecraft", "chests/woodland_mansion");
    private static final ResourceLocation Simple_Dungeon_CHEST_ID
            = ResourceLocation.fromNamespaceAndPath("minecraft", "chests/simple_dungeon");
    private static final ResourceLocation Nether_Bridge_CHEST_ID
            = ResourceLocation.fromNamespaceAndPath("minecraft", "chests/nether_bridge");
    private static final ResourceLocation Shipwreck_Map_CHEST_ID
            = ResourceLocation.fromNamespaceAndPath("minecraft", "chests/shipwreck_map");
    private static final ResourceLocation Shipwreck_Supply_CHEST_ID
            = ResourceLocation.fromNamespaceAndPath("minecraft", "chests/shipwreck_supply");
    private static final ResourceLocation Shipwreck_Treasure_CHEST_ID
            = ResourceLocation.fromNamespaceAndPath("minecraft", "chests/shipwreck_treasure");
    private static final ResourceLocation CREEPER_ID
            = ResourceLocation.fromNamespaceAndPath("minecraft", "entities/creeper");


    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((id, tableBuilder, source) -> {
            if(IGLOO_STRUCTURE_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.15f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
                LootPool.Builder poolBuilder2 = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.35f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.HASTE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.STRENGTH_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 2.0f)).build());
                tableBuilder.pool(poolBuilder2.build());
            }
            if(Mineshaft_STRUCTURE_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.05f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
                LootPool.Builder poolBuilder2 = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.15f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.HASTE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.STRENGTH_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 2.0f)).build());
                tableBuilder.pool(poolBuilder2.build());
            }
            if(Ancient_City_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.35f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 2.0f)).build());
                tableBuilder.pool(poolBuilder.build());
                LootPool.Builder poolBuilder2 = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.55f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.HASTE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.STRENGTH_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 2.0f)).build());
                tableBuilder.pool(poolBuilder2.build());
            }
            if(Bastion_Bridge_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.15f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
                LootPool.Builder poolBuilder2 = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.35f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.HASTE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.STRENGTH_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 2.0f)).build());
                tableBuilder.pool(poolBuilder2.build());
            }
            if(Bastion_Hoglin_Stable_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.15f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 2.0f)).build());
                tableBuilder.pool(poolBuilder.build());
                LootPool.Builder poolBuilder2 = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.HASTE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.STRENGTH_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 2.0f)).build());
                tableBuilder.pool(poolBuilder2.build());
            }
            if(Bastion_Other_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.15f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 2.0f)).build());
                tableBuilder.pool(poolBuilder.build());
                LootPool.Builder poolBuilder2 = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.HASTE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.STRENGTH_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 2.0f)).build());
                tableBuilder.pool(poolBuilder2.build());
            }
            if(Bastion_Treasure_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.15f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 2.0f)).build());
                tableBuilder.pool(poolBuilder.build());
                LootPool.Builder poolBuilder2 = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.HASTE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.STRENGTH_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 2.0f)).build());
                tableBuilder.pool(poolBuilder2.build());
            }
            if(Buried_Treasure_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.05f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
                LootPool.Builder poolBuilder2 = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.15f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.HASTE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.STRENGTH_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 2.0f)).build());
                tableBuilder.pool(poolBuilder2.build());
            }
            if(End_City_Treasure_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
                LootPool.Builder poolBuilder2 = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.45f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.HASTE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.STRENGTH_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder2.build());
            }
            if(Desert_Pyramid_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.10f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
                LootPool.Builder poolBuilder2 = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.HASTE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.STRENGTH_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder2.build());
            }
            if(Jungle_Temple_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.10f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
                LootPool.Builder poolBuilder2 = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.35f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.HASTE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.STRENGTH_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder2.build());
            }
            if(Jungle_Temple_Dispenser_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.10f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
                LootPool.Builder poolBuilder2 = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.35f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.HASTE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.STRENGTH_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder2.build());
            }
            if(Underwater_Ruin_Small_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.10f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
                LootPool.Builder poolBuilder2 = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.35f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.HASTE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.STRENGTH_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder2.build());
            }
            if(Underwater_Ruin_Big_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.10f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
                LootPool.Builder poolBuilder2 = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.35f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.HASTE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.STRENGTH_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder2.build());
            }
            if(Stronghold_Corridor_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.10f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
                LootPool.Builder poolBuilder2 = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.35f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.HASTE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.STRENGTH_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder2.build());
            }
            if(Stronghold_Crossing_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.1f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
                LootPool.Builder poolBuilder2 = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.35f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.HASTE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.STRENGTH_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder2.build());
            }
            if(Pillager_Outpost_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.10f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
                LootPool.Builder poolBuilder2 = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.35f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.HASTE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.STRENGTH_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder2.build());
            }
            if(Ruined_Portal_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.10f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
                LootPool.Builder poolBuilder2 = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.35f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.HASTE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.STRENGTH_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder2.build());
            }
            if(Simple_Dungeon_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.10f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
                LootPool.Builder poolBuilder2 = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.35f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.HASTE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.STRENGTH_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder2.build());
            }
            if(Woodland_Mansion_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
                LootPool.Builder poolBuilder2 = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.35f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.HASTE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.STRENGTH_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder2.build());
            }
            if(Nether_Bridge_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
                LootPool.Builder poolBuilder2 = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.HASTE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.STRENGTH_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder2.build());
            }
            if(Shipwreck_Map_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.05f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
                LootPool.Builder poolBuilder2 = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.15f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.HASTE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.STRENGTH_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder2.build());
            }
            if(Shipwreck_Supply_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.05f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
                LootPool.Builder poolBuilder2 = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.15f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.HASTE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.STRENGTH_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder2.build());
            }
            if(Shipwreck_Treasure_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.05f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
                LootPool.Builder poolBuilder2 = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.15f)) // Drops 35% of the time
                        .add(LootItem.lootTableItem(AppleFoodComponents.HASTE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.STRENGTH_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .add(LootItem.lootTableItem(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder2.build());
            }
        });
    }
}