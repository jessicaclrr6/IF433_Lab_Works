package oop_00000121971_JessicaClairine.week01.week06

class SmartCCTV(override val id: String, override val name: String) : oop_00000121971_JessicaClairine.week01.week06.SmartDevice,
    oop_00000121971_JessicaClairine.week01.week06.Switchable, oop_00000121971_JessicaClairine.week01.week06.Recordable {
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