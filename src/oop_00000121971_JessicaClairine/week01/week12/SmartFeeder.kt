package oop_00000121971_JessicaClairine.week01.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }
    if (isJammed) {
        throw DispenserJamException()
    }
    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50
    println("\n=== JADWAL MAKAN PAGI ===")
    try {
        currentKibbleStock = dispenseKibble(80, currentKibbleStock, false) [cite: 155]
    } catch (e: DispenserJamException) {
        println("Peringatan: ${e.message}") [cite: 157]
    } catch (e: FoodEmptyException) {
        println("Peringatan: ${e.message}") [cite: 157]
    } catch (e: Exception) {
        println("Terjadi kesalahan umum") [cite: 157]
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.") [cite: 161]
    }
}