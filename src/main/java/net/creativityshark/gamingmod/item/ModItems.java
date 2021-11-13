package net.creativityshark.gamingmod.item;

import net.creativityshark.gamingmod.GamingMod;
import net.creativityshark.gamingmod.entities.ModEntities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item BINGUS = registerItem("bingus",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS).fireproof().rarity(Rarity.EPIC)));
    public static final Item BINGUS_SANDWICH = registerItem("bingus_sandwich",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(4f).build())
                    .group(ItemGroup.FOOD).rarity(Rarity.EPIC)));
    public static final Item BINGUS_PHONE = registerItem("bingus_phone",
            new SpawnEggItem(ModEntities.BINGUS_SALESMAN, 14597055, 12740991,
                    new FabricItemSettings().group(ItemGroup.MISC).fireproof().rarity(Rarity.EPIC)));
    public static final Item BINGUS_SPAWN_EGG = registerItem("bingus_spawn_egg",
            new SpawnEggItem(ModEntities.BINGUS_SALESMAN, 14597055, 12740991,
                    new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item) {
        //registers item, eg "gamingmod:bingus"
        return Registry.register(Registry.ITEM, new Identifier(GamingMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + GamingMod.MOD_ID);
    }
}
