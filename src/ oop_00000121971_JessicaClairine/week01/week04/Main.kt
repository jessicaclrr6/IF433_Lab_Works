package ` oop_00000121971_JessicaClairine`.week01.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda 0nthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing car ---")
    val myCar = Car( "Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("------------")

    val electricCar = ElectricCar("Tesla", 4, 80)
    electricCar.accelerate()
    electricCar.honk()
    electricCar.openTrunk()
}
