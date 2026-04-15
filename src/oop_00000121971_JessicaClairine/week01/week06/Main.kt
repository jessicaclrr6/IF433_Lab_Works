package oop_00000121971_JessicaClairine.week01.week06

fun processCheckout(method: oop_00000121971_JessicaClairine.week01.week06.PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {

    val myWatch = _root_ide_package_.oop_00000121971_JessicaClairine.week01.week06.Smartwatch()
    myWatch.showTime()

    val myPhone = _root_ide_package_.oop_00000121971_JessicaClairine.week01.week06.Smartphone()
    myPhone.turnOn()

    val pay1 = _root_ide_package_.oop_00000121971_JessicaClairine.week01.week06.Gopay()
    val pay2 = _root_ide_package_.oop_00000121971_JessicaClairine.week01.week06.CreditCard()

    println("\n=== TESTING CHECKOUT ===")

    _root_ide_package_.oop_00000121971_JessicaClairine.week01.week06.processCheckout(pay1, 50000.0)
    _root_ide_package_.oop_00000121971_JessicaClairine.week01.week06.processCheckout(pay2, 150000.0)

    val lamp = _root_ide_package_.oop_00000121971_JessicaClairine.week01.week06.SmartLamp("1", "Ruang Tamu")
    val speaker =
        _root_ide_package_.oop_00000121971_JessicaClairine.week01.week06.SmartSpeaker("2", "Google Nest Dapur")
    val cctv = _root_ide_package_.oop_00000121971_JessicaClairine.week01.week06.SmartCCTV("3", "Ezviz Garasi")

    val hub = _root_ide_package_.oop_00000121971_JessicaClairine.week01.week06.SmartHomeHub()

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}