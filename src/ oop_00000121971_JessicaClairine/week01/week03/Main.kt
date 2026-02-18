package ` oop_00000121971_JessicaClairine`.week01.week03

fun main() {
    val e = Employee("Budi")

    // 1. Test validasi salary
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    // 2. test encapsulation
    e.increasePerformance()
    // e.performnaceRating = 5 // coba uncomment, pasti merah

    // 3. test computes property
    println("Pajak yang harus dibayar: ${e.tax}")
}