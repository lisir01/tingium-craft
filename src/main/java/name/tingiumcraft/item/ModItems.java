package name.tingiumcraft.item;

import name.tingiumcraft.Tingiumcraft;
import name.tingiumcraft.sound.ModJukeboxSongs;
import net.minecraft.item.Item;
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




    private static Item registerItems(String id, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Tingiumcraft.MOD_ID,id), item);
    }
    public static void registerModItems(){
    }
}
