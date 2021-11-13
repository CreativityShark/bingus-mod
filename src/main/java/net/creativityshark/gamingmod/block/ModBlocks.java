package net.creativityshark.gamingmod.block;

import net.creativityshark.gamingmod.GamingMod;
import net.creativityshark.gamingmod.block.custom.BingusBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import javax.xml.namespace.QName;

public class ModBlocks {

    //Declare Blocks

    public static final Block BINGUS_BLOCK = registerBlock("bingus_block",
            new BingusBlock(FabricBlockSettings.of(Material.AMETHYST).strength(4.0f).breakByTool(FabricToolTags.HOES,
                    2).requiresTool()), ItemGroup.BUILDING_BLOCKS);

    //Methods

    private static Block registerBlock(String name, Block block, ItemGroup itemGroup) {
        registerBlockItem(name, block, itemGroup);
        return Registry.register(Registry.BLOCK, new Identifier(GamingMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup itemGroup) {
        return Registry.register(Registry.ITEM, new Identifier(GamingMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(itemGroup).rarity(Rarity.EPIC)));
    }

    public static void registerModBlocks() {
        System.out.println("registering mod blocks for " + GamingMod.MOD_ID);
    }
}
