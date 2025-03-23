package name.tingiumcraft.world;

import name.tingiumcraft.Tingiumcraft;
import name.tingiumcraft.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> TINGJIE_TREE_KEY=of("tingjie_tree");

    public static final RegistryKey<ConfiguredFeature<?, ?>> TINGJIE_ORE_KEY=of("tingjie_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> BLACK_TINGJIE_ORE_KEY=of("black_tingjie_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?,?>> featureRegisterable){
        register(featureRegisterable,TINGJIE_TREE_KEY,Feature.TREE,new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.TINGJIE_LOG),
                new StraightTrunkPlacer(4,1,1),
                BlockStateProvider.of(ModBlocks.TINGJIE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(3),ConstantIntProvider.create(0),3),
                new TwoLayersFeatureSize(1,0,2))
                .build());

        RuleTest stoneReplace = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepSlateReplace = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overWorldTargets = List.of(
                OreFeatureConfig.createTarget(stoneReplace,ModBlocks.TINGJIE_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepSlateReplace,ModBlocks.BLACK_TINGJIE_ORE.getDefaultState()));

        register(featureRegisterable,TINGJIE_ORE_KEY,Feature.ORE,new OreFeatureConfig(overWorldTargets,6));
        register(featureRegisterable,BLACK_TINGJIE_ORE_KEY,Feature.ORE,new OreFeatureConfig(overWorldTargets,4));


    }


    public static RegistryKey<ConfiguredFeature<?, ?>> of(String id) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Tingiumcraft.MOD_ID,id));
    }

    public static <FC extends FeatureConfig,F extends Feature<FC>> void register(
            Registerable<ConfiguredFeature<?,?>> registerable ,RegistryKey<ConfiguredFeature<?,?>> key, F feature,FC config
    ){
        registerable.register(key,new ConfiguredFeature<FC,F>(feature,config));
    }
}
