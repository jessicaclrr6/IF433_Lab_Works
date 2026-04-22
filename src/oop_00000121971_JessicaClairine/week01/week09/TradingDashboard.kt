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
    val losingTrades = closedTrades.filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map {
            "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map {
            "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")

    println("\n--- TOP PERFORMERS ---")
    topPerformersString.forEach { println(it) }

    println("\n--- WORST PERFORMERS ---")
    worstPerformersString.forEach { println(it) }

    println("\nTraded Pairs: $uniquePairs")
}