package name.tingiumcraft;

import name.tingiumcraft.block.ModBlocks;
import name.tingiumcraft.item.ModItemGroups;
import name.tingiumcraft.item.ModItems;
import name.tingiumcraft.sound.ModSoundEvents;
import name.tingiumcraft.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tingiumcraft implements ModInitializer {
	public static final String MOD_ID = "tingium-craft";





	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.


		ModItems.registerModItems();
		ModItemGroups.registerModItemGroups();
		ModBlocks.registerModBlocks();
		ModSoundEvents.registerModSoundEvents();
		ModWorldGeneration.registWorldGeneration();


		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.TINGJIE_LOG,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.TINGJIE_LEAVES,30,60);

		LOGGER.info("这个，这个，还有这个，统统启动！");
	}
}