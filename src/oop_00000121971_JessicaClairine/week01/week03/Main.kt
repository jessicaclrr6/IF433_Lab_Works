package oop_00000121971_JessicaClairine.week01.week03

fun main() {
    val e = _root_ide_package_.oop_00000121971_JessicaClairine.week01.week03.Employee("Budi")
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")
    e.increasePerformance()
    println("Pajak yang harus dibayar: ${e.tax}")

    println("\n=== TEST WEAPON ===")
    val sword = _root_ide_package_.oop_00000121971_JessicaClairine.week01.week03.Weapon("Excalibur", 300)

    sword.damage = -50
    sword.damage = 9999

    println("Nama Weapon: ${sword.name}")
    println("Damage: ${sword.damage}")
    println("Tier: ${sword.tier}")

    println("\n=== TEST PLAYER ===")

    val player = _root_ide_package_.oop_00000121971_JessicaClairine.week01.week03.Player("Jessica")

    player.addXp(50)
    player.addXp(60)
    println("Level sekarang: ${player.level}")
}