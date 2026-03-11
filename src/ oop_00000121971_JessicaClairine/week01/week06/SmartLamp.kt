package ` oop_00000121971_JessicaClairine`.week01.week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("$name lamp turned ON")
    }

    override fun turnOff() {
        println("$name lamp turned OFF")
    }

}