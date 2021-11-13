package net.creativityshark.gamingmod.init;

import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.creativityshark.gamingmod.trades.BingusSalesmanTrades;
import net.minecraft.village.TradeOffers;

public class ModTrades {
    public static Int2ObjectMap<TradeOffers.Factory[]> BINGUS_SALESMAN_TRADES;

    public static Int2ObjectMap<TradeOffers.Factory[]> copyToFastUtilMap(ImmutableMap<Integer, TradeOffers.Factory[]> trades) {
        return new Int2ObjectOpenHashMap<>(trades);
    }

    static {
        BINGUS_SALESMAN_TRADES = copyToFastUtilMap(ImmutableMap.of(1, BingusSalesmanTrades.bingusSalesmanTrades(), 2, BingusSalesmanTrades.bingusSalesmanTrades2(), 3, BingusSalesmanTrades.bingusSalesmanTrades3()));
    }
}
