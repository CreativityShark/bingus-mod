package net.creativityshark.gamingmod.trades;

import net.creativityshark.gamingmod.item.ModItems;
import net.minecraft.item.Items;

public class BingusSalesmanTrades {

    public static int phonePrice = (int) Math.round((Math.random() + 2) * 5);

    public static UpgradedTradeOfferFactory[] bingusSalesmanTrades() {
        return new UpgradedTradeOfferFactory[]{
                new TradeWithoutEmerald(Items.EMERALD,1, ModItems.BINGUS, 4, 1024, 30, 0),
                new TradeWithoutEmerald(ModItems.BINGUS,4, Items.EMERALD, 1, 1024, 30, 0),
        };
    }
    public static UpgradedTradeOfferFactory[] bingusSalesmanTrades2() {
        return new UpgradedTradeOfferFactory[]{
                new TradeWithoutEmerald(Items.EMERALD,2, ModItems.BINGUS_SANDWICH, 1, 1024, 30, 3),
        };
    }
    public static UpgradedTradeOfferFactory[] bingusSalesmanTrades3() {
        return new UpgradedTradeOfferFactory[]{
                new TradeWithoutEmerald(Items.EMERALD, phonePrice, ModItems.BINGUS_PHONE, 1, 1, 30, 3),
        };
    }
}
