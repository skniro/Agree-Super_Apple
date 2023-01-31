package com.skniro.agree.world;

import com.skniro.agree.Agree;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.tag.BiomeTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;
import java.util.function.Predicate;

import static com.skniro.agree.Agree.MOD_ID;

public class OreBiomeModifications
{
    public static void addOres()
    {

        // Inject into Biomes
        BiomeModifications.addFeature(overworldSelector(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Agree.MOD_ID, "ore_ruby_overworld")));
    }

    public static Predicate<BiomeSelectionContext> overworldSelector()
    {
        return context -> context.getBiomeRegistryEntry().isIn(BiomeTags.IS_OVERWORLD);
    }


    // Used here because the vanilla ones are private
    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}

