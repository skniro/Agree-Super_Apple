package com.skniro.agree.util;

import com.skniro.agree.item.Apples.AppleFoodComponents;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    private static final Identifier GRASS_BLOCK_ID
            = new Identifier("minecraft", "blocks/grass");
    private static final Identifier IGLOO_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/igloo_chest");
    private static final Identifier Mineshaft_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier Ancient_City_CHEST_ID
            = new Identifier("minecraft", "chests/ancient_city");
    private static final Identifier Bastion_Bridge_CHEST_ID
            = new Identifier("minecraft", "chests/bastion_bridge");
    private static final Identifier Bastion_Hoglin_Stable_CHEST_ID
            = new Identifier("minecraft", "chests/bastion_hoglin_stable");
    private static final Identifier Bastion_Other_CHEST_ID
            = new Identifier("minecraft", "chests/bastion_other");
    private static final Identifier Bastion_Treasure_CHEST_ID
            = new Identifier("minecraft", "chests/bastion_treasure");
    private static final Identifier Buried_Treasure_CHEST_ID
            = new Identifier("minecraft", "chests/buried_treasure");
    private static final Identifier End_City_Treasure_CHEST_ID
            = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier Desert_Pyramid_ID
            = new Identifier("minecraft", "chests/desert_pyramid");
    private static final Identifier Jungle_Temple_CHEST_ID
            = new Identifier("minecraft", "chests/jungle_temple");
    private static final Identifier Jungle_Temple_Dispenser_CHEST_ID
            = new Identifier("minecraft", "chests/jungle_temple_dispenser");
    private static final Identifier Underwater_Ruin_Small_CHEST_ID
            = new Identifier("minecraft", "chests/underwater_ruin_small");
    private static final Identifier Underwater_Ruin_Big_CHEST_ID
            = new Identifier("minecraft", "chests/underwater_ruin_big");
    private static final Identifier Stronghold_Corridor_CHEST_ID
            = new Identifier("minecraft", "chests/stronghold_corridor");
    private static final Identifier Stronghold_Crossing_CHEST_ID
            = new Identifier("minecraft", "chests/stronghold_crossing");
    private static final Identifier Pillager_Outpost_CHEST_ID
            = new Identifier("minecraft", "chests/pillager_outpost");
    private static final Identifier Ruined_Portal_CHEST_ID
            = new Identifier("minecraft", "chests/ruined_portal");
    private static final Identifier Woodland_Mansion_CHEST_ID
            = new Identifier("minecraft", "chests/woodland_mansion");
    private static final Identifier Simple_Dungeon_CHEST_ID
            = new Identifier("minecraft", "chests/simple_dungeon");
    private static final Identifier Nether_Bridge_CHEST_ID
            = new Identifier("minecraft", "chests/nether_bridge");
    private static final Identifier Shipwreck_Map_CHEST_ID
            = new Identifier("minecraft", "chests/shipwreck_map");
    private static final Identifier Shipwreck_Supply_CHEST_ID
            = new Identifier("minecraft", "chests/shipwreck_supply");
    private static final Identifier Shipwreck_Treasure_CHEST_ID
            = new Identifier("minecraft", "chests/shipwreck_treasure");
    private static final Identifier CREEPER_ID
            = new Identifier("minecraft", "entities/creeper");


    public static void modifyLootTables() {
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(IGLOO_STRUCTURE_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.HASTE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.STRENGTH_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder2);
            }
            if(Mineshaft_STRUCTURE_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.HASTE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.STRENGTH_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder2);
            }
            if(Ancient_City_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.55f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.HASTE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.STRENGTH_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder2);
            }
            if(Bastion_Bridge_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.HASTE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.STRENGTH_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder2);
            }
            if(Bastion_Hoglin_Stable_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.HASTE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.STRENGTH_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder2);
            }
            if(Bastion_Other_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.HASTE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.STRENGTH_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder2);
            }
            if(Bastion_Treasure_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.HASTE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.STRENGTH_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder2);
            }
            if(Buried_Treasure_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.HASTE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.STRENGTH_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder2);
            }
            if(End_City_Treasure_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.45f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.HASTE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.STRENGTH_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder2);
            }
            if(Desert_Pyramid_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.10f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.HASTE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.STRENGTH_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder2);
            }
            if(Jungle_Temple_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.10f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.HASTE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.STRENGTH_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder2);
            }
            if(Jungle_Temple_Dispenser_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.10f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.HASTE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.STRENGTH_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder2);
            }
            if(Underwater_Ruin_Small_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.10f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.HASTE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.STRENGTH_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder2);
            }
            if(Underwater_Ruin_Big_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.10f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.HASTE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.STRENGTH_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder2);
            }
            if(Stronghold_Corridor_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.10f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.HASTE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.STRENGTH_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder2);
            }
            if(Stronghold_Crossing_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.HASTE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.STRENGTH_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder2);
            }
            if(Pillager_Outpost_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.10f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.HASTE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.STRENGTH_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder2);
            }
            if(Ruined_Portal_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.10f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.HASTE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.STRENGTH_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder2);
            }
            if(Simple_Dungeon_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.10f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.HASTE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.STRENGTH_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder2);
            }
            if(Woodland_Mansion_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.HASTE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.STRENGTH_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder2);
            }
            if(Nether_Bridge_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.HASTE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.STRENGTH_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder2);
            }
            if(Shipwreck_Map_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.HASTE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.STRENGTH_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder2);
            }
            if(Shipwreck_Supply_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.HASTE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.STRENGTH_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder2);
            }
            if(Shipwreck_Treasure_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.SUPER_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f)) // Drops 35% of the time
                        .with(ItemEntry.builder(AppleFoodComponents.HASTE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.STRENGTH_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.FIRE_RESISTANCE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HEALTH_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.HERO_VILLAGE_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.JUMP_BOOST_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.NIGHT_VISION_APPLE))
                        .with(ItemEntry.builder(AppleFoodComponents.SPEED_APPLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder2);
            }
        });
    }
}