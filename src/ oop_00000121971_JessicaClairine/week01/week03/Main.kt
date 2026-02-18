package ` oop_00000121971_JessicaClairine`.week01.week03

fun main() {
    val e = Employee("Budi")
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")
    e.increasePerformance()
    println("Pajak yang harus dibayar: ${e.tax}")

    println("\n=== TEST WEAPON ===")
    val sword = Weapon("Excalibur", 300)

    sword.damage = -50
    sword.damage = 9999

    println("Nama Weapon: ${sword.name}")
    println("Damage: ${sword.damage}")
    println("Tier: ${sword.tier}")
}