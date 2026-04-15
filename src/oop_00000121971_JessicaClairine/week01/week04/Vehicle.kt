package ` oop_00000121971_JessicaClairine`.week01.week04

open class Vehicle(val brand: String){
    var speed: Int = 0

    open fun accelerate() {
        speed += 10
        println("$brand melaju. Kecepetan: $speed km/jam")
    }
    open fun honk() {
        println("Beep beep!")
    }
}