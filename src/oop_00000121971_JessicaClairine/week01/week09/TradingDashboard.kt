package oop_00000121971_JessicaClairine.week01.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 15, 8.0, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 5, 12.3, "CLOSED"),
        TradeLog("XRPUSDT", "SHORT", 8, -10.0, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 12, 3.5, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
}