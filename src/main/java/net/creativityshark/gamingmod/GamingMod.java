package net.creativityshark.gamingmod;

import net.creativityshark.gamingmod.block.ModBlocks;
import net.creativityshark.gamingmod.entities.ModEntities;
import net.creativityshark.gamingmod.entities.custom.bingus_salesman.BingusSalesmanEntity;
import net.creativityshark.gamingmod.item.ModItems;
import net.creativityshark.gamingmod.registries.ModRegistries;
import net.creativityshark.gamingmod.sounds.ModSounds;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class GamingMod implements ModInitializer {

	public static final String MOD_ID = "gamingmod";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModEntities.registerModEntities();
		ModSounds.registerModSounds();

		ModRegistries.registerModFuels();

		System.out.println("Cheese!!!");
	}
}
