package name.tingiumcraft.world.tree;


import name.tingiumcraft.Tingiumcraft;
import name.tingiumcraft.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModTreeGenerator {
    public static final SaplingGenerator TINGJIE_TREE =new SaplingGenerator(
            Tingiumcraft.MOD_ID+":tingjie_tree",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.TINGJIE_TREE_KEY),
            Optional.empty()
    );
}
