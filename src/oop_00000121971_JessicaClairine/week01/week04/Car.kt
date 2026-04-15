package ` oop_00000121971_JessicaClairine`.week01.week04

open class Car(
    brand: String,
    val numberOfDoors: Int
) : Vehicle(brand) {

    override fun honk() {
        println("$brand berbunyi: Beep beep!")
    }

    override fun accelerate() {
        super.accelerate()
        println("$brand menambah kecepatan dengan tenaga ekstra!")
    }

    fun openTrunk() {
        println("$brand membuka bagasi.")
    }
}