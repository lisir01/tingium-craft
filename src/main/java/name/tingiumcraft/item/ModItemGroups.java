package name.tingiumcraft.item;

import name.tingiumcraft.Tingiumcraft;
import name.tingiumcraft.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.*;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup TINGIUMCRAFT_GROUP = Registry.register(Registries.ITEM_GROUP,Identifier.of(Tingiumcraft.MOD_ID,"tingiumcraft_group"),
        ItemGroup.create(null,-1).displayName(Text.translatable("itemGroup.tingiumcraft_group"))
            .icon(() -> new ItemStack(ModBlocks.TINGJIE_GRASS_BLOCK))
            .entries((displayContext,entries) ->{

                entries.add(ModBlocks.TINGJIE_STONE);//婷姐石头
                entries.add(ModBlocks.TINGJIE_COBBLESTONE);//婷姐圆石
                entries.add(ModBlocks.TINGJIE_SAND);//婷姐沙子
                entries.add(ModBlocks.TINGJIE_GRASS_BLOCK);//婷姐草方块
                entries.add(ModBlocks.TINGJIE_DIRT);//婷姐泥土
                entries.add(ModBlocks.TINGJIE_LOG);//婷姐原木
                entries.add(ModBlocks.TINGJIE_LEAVES);//婷姐树叶
                entries.add(ModBlocks.TINGJIE_SAPLING);//婷姐树苗


                entries.add(ModBlocks.BLACK_TINGJIE_ORE);//婷姐黑色矿物块
                entries.add(ModBlocks.TINGJIE_ORE);//婷姐白色矿物块
                entries.add(ModItems.RAW_TINGJIE_MINE);//婷姐粗矿
                entries.add(ModItems.TINGJIE_INGOT);//婷姐锭
                entries.add(ModItems.TINGJIE_NUGGET);//婷姐粒
                entries.add(ModBlocks.TINGJIE_BLOCK);//婷姐块
                entries.add(ModItems.OXIDIZED_RAW_TINHJIE_MINE);//氧化的婷姐粗矿
                entries.add(ModItems.OXIDIZED_TINGJIE_INGOT);//氧化的婷姐锭
                entries.add(ModItems.OXIDIZED_TINGJIE_NUGGET);//氧化的婷姐粒
                entries.add(ModBlocks.OXIDZED_TINGJIE_BLOCK);//氧化的婷姐矿

                entries.add(ModItems.TINGJIE_AXE);//婷姐斧
                entries.add(ModItems.TINGJIE_HOE);//婷姐锄
                entries.add(ModItems.TINGJIE_SHOVEL);//婷姐铲
                entries.add(ModItems.TINGJIE_SWORD);//婷姐剑
                entries.add(ModItems.TINGJIE_PICKAXE);//婷姐镐

                entries.add(ModItems.CAMERA);//照相机
                entries.add(ModItems.MUSIC_PZSDBD);//音乐唱片




            }).build());

    public static void registerModItemGroups(){

    }
}
