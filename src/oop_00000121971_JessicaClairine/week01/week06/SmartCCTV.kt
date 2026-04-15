package ` oop_00000121971_JessicaClairine`.week01.week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("$name CCTV ON")
        startRecord()
    }

    override fun turnOff() {
        println("$name CCTV OFF")
    }

    override fun startRecord() {
        println("$name mulai merekam")
    }

}