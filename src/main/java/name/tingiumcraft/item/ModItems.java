package name.tingiumcraft.item;

import name.tingiumcraft.Tingiumcraft;
import name.tingiumcraft.sound.ModJukeboxSongs;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {

    public static final Item RAW_TINGJIE_MINE = registerItems("raw_tingjie_mine", new Item(
            new Item.Settings()));
//    婷姐粗矿

    public static final Item TINGJIE_INGOT =registerItems("tingjie_ingot",new Item(
            new Item.Settings()));
//    婷姐锭

    public static final Item TINGJIE_NUGGET=registerItems("tingjie_nugget",new Item(
            new Item.Settings()));
//    婷姐粒

    public static final Item OXIDIZED_RAW_TINHJIE_MINE=registerItems("oxidized_raw_tingjie_mine",new Item(
            new Item.Settings()));
//    氧化婷姐粗矿

    public static final Item OXIDIZED_TINGJIE_INGOT=registerItems("oxidized_tingjie_ingot",new Item(
            new Item.Settings()));
//    氧化婷姐锭

    public static final Item OXIDIZED_TINGJIE_NUGGET=registerItems("oxidized_tingjie_nugget",new Item(
            new Item.Settings()));
//    氧化婷姐粒



    public static final Item CAMERA = registerItems("camera",new Item(
            new Item.Settings()
                    .maxCount(1)));
//    照相机

    public static final Item MUSIC_PZSDBD =registerItems("music_pzsdbd",new Item(
            new Item.Settings()
                    .maxCount(1)
                    .rarity(Rarity.RARE)
                    .jukeboxPlayable(ModJukeboxSongs.PZSDBD)));
//    音乐唱片

    public static final Item TINGJIE_SWORD=registerItems("tingjie_sword",new SwordItem(
            ModToolMaterials.TINGJIE_TOOL,
            new Item.Settings().attributeModifiers(
                    SwordItem.createAttributeModifiers(ModToolMaterials.TINGJIE_TOOL,5,-2.0f))));
//    婷姐剑

    public static final Item TINGJIE_SHOVEL=registerItems("tingjie_shovel",new ShovelItem(
            ModToolMaterials.TINGJIE_TOOL,
            new Item.Settings().attributeModifiers(
                    ShovelItem.createAttributeModifiers(ModToolMaterials.TINGJIE_TOOL,2.5f,-2.5f))));
//    婷姐铲

    public static final Item TINGJIE_PICKAXE=registerItems("tingjie_pickaxe",new PickaxeItem(
            ModToolMaterials.TINGJIE_TOOL,
            new Item.Settings().attributeModifiers(
                    PickaxeItem.createAttributeModifiers(ModToolMaterials.TINGJIE_TOOL,1.5f,-2.3f))));
//    婷姐镐

    public static final Item TINGJIE_AXE=registerItems("tingjie_axe",new AxeItem(
            ModToolMaterials.TINGJIE_TOOL,
            new Item.Settings().attributeModifiers(
                    AxeItem.createAttributeModifiers(ModToolMaterials.TINGJIE_TOOL,6.5f,-2.5f))));
//    婷姐斧

    public static final Item TINGJIE_HOE=registerItems("tingjie_hoe",new HoeItem(
            ModToolMaterials.TINGJIE_TOOL,
            new Item.Settings().attributeModifiers(
                    HoeItem.createAttributeModifiers(ModToolMaterials.TINGJIE_TOOL,-1.0f,-1.0f))));
//    婷姐锄

    private static Item registerItems(String id, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Tingiumcraft.MOD_ID,id), item);
    }
    public static void registerModItems(){
    }
}
