package name.tingiumcraft.block;

import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

import java.util.Optional;


public class ModSaplingBlock extends SaplingBlock implements Fertilizable  {

    public ModSaplingBlock(SaplingGenerator generator, Settings settings) {
        super(generator, settings);
    }


    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(ModBlocks.TINGJIE_GRASS_BLOCK);
    }
}
