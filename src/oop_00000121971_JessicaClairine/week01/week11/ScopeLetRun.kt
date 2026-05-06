package oop_00000121971_JessicaClairine.week01.week11

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    val length = name?.let {
        println("nama terdeteksi: $it")
        it.length
    }
    println("Panjang nama: $length")

}