package ` oop_00000121971_JessicaClairine`.week01.week04

class Car(
    brand: String,
    val numberOfDoors: Int
) : Vehicle(brand) {

    override fun honk() {
        println("$brand berbunyi: Beep beep!")
    }

    fun openTrunk() {
        println("$brand membuka bagasi.")
    }
}