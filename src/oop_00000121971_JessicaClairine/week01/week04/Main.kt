package oop_00000121971_JessicaClairine.week01.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = _root_ide_package_.oop_00000121971_JessicaClairine.week01.week04.Vehicle("Sepeda 0nthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing car ---")
    val myCar = _root_ide_package_.oop_00000121971_JessicaClairine.week01.week04.Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("------------")

    val electricCar = _root_ide_package_.oop_00000121971_JessicaClairine.week01.week04.ElectricCar("Tesla", 4, 80)
    electricCar.accelerate()
    electricCar.honk()
    electricCar.openTrunk()

    println("------------")

    val manager = _root_ide_package_.oop_00000121971_JessicaClairine.week01.week04.Manager("Budi", 10000000)
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    println("------------")

    val developer =
        _root_ide_package_.oop_00000121971_JessicaClairine.week01.week04.Developer("Andi", 8000000, "Kotlin")
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}
