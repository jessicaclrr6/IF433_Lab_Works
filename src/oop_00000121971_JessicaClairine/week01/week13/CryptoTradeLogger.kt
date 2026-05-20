package oop_00000121971_JessicaClairine.week01.week13
import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String {
    return "$id,$symbol,$type,$margin,$pnl"
}

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")
        TradeRecord(
            id = parts[0].toInt(),
            symbol = parts[1],
            type = parts[2],
            margin = parts[3].toDouble(),
            pnl = parts[4].toDouble()
        )
        //error handling
    } catch (e: Exception) {
        println("Log Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach {
            writer.println(it.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord> {

    return try {

        File(path)
            .readLines()
            .mapNotNull { fromCsvTrade(it) }

    } catch (e: FileNotFoundException) {

        println("Error: File tidak ditemukan!")
        emptyList()
    }
}

fun main() {
    val trades = listOf(
        TradeRecord(1, "BTCUSDT", "LONG", 1000.0, 150.0),
        TradeRecord(2, "ETHUSDT", "SHORT", 800.0, -50.0),
        TradeRecord(3, "SOLUSDT", "LONG", 1200.0, 200.0)
    )
    saveTrades(trades, "crypto_trades.csv")

    File("crypto_trades.csv")
        .appendText("KORUP!,ID,DUGESUT,Hold,XX,Y\n")

    val loadedData = loadTrades("crypto_trades.csv")

    println("=== LOADED TRADE DATA ===")
    loadedData.forEach { println(it) }

    val totalPnl = loadedData.sumOf { it.pnl }

    println("\n=== TOTAL PnL BERSIH ===")
    println("TOTAL PnL BERSIH: $totalPnl")
}


