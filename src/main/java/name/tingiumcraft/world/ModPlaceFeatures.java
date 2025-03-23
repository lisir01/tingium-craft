package name.tingiumcraft.world;


import name.tingiumcraft.Tingiumcraft;
import name.tingiumcraft.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlaceFeatures {


    public static RegistryKey<PlacedFeature> TINGJIE_TREE_PLACED_KEY = of("tingjie_tree_placed");

    public static RegistryKey<PlacedFeature> TINGJIE_ORE_PLACED_KEY=of("tingjie_ore_placed");

    public static RegistryKey<PlacedFeature> BLACK_TINGJIE_ORE_PLACED_KEY=of("black_tingjie_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> fratureRegisterable){
        RegistryEntryLookup<ConfiguredFeature<?,?>> registryEntryLookup= fratureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        register(fratureRegisterable,TINGJIE_TREE_PLACED_KEY,registryEntryLookup.getOrThrow(ModConfiguredFeatures.TINGJIE_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(2,0.1f,2),
                        ModBlocks.TINGJIE_SAPLING));

        register(fratureRegisterable,TINGJIE_ORE_PLACED_KEY,registryEntryLookup.getOrThrow(ModConfiguredFeatures.TINGJIE_ORE_KEY),
                ModOrePlacements.modifiersWithCount(2, HeightRangePlacementModifier.uniform(YOffset.fixed(0),YOffset.fixed(80))));
        register(fratureRegisterable,BLACK_TINGJIE_ORE_PLACED_KEY,registryEntryLookup.getOrThrow(ModConfiguredFeatures.BLACK_TINGJIE_ORE_KEY),
                ModOrePlacements.modifiersWithCount(1, HeightRangePlacementModifier.uniform(YOffset.fixed(-80),YOffset.fixed(0))));

    }

    public static RegistryKey<PlacedFeature> of(String id){
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(Tingiumcraft.MOD_ID,id));
    }

    public static void register(
        Registerable<PlacedFeature> featureRegisterable,
        RegistryKey<PlacedFeature> key,
        RegistryEntry<ConfiguredFeature<?,?>> feature,
        List<PlacementModifier> modifiers
    ){
        featureRegisterable.register(key,new PlacedFeature(feature,List.copyOf(modifiers)));
    }

    public static void register(
            Registerable<PlacedFeature> featureRegisterable,
            RegistryKey<PlacedFeature> key,
            RegistryEntry<ConfiguredFeature<?,?>> feature,
            PlacementModifier... modifiers
    ){
        register(featureRegisterable,key,feature,List.of(modifiers));
    }
}
