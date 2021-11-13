package net.creativityshark.gamingmod.registries;

import net.creativityshark.gamingmod.GamingMod;
import net.creativityshark.gamingmod.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {

    public static void registerModFuels() {
        System.out.println("registering fuels for " + GamingMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.BINGUS, 600);
    }

}
