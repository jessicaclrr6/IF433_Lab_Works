package oop_00000121971_JessicaClairine.week01.week06

class SmartHomeHub {
    val devices = mutableListOf<oop_00000121971_JessicaClairine.week01.week06.SmartDevice>()
    fun addDevice(device: oop_00000121971_JessicaClairine.week01.week06.SmartDevice) {
        devices.add(device)
    }
    fun turnOffAllSwitches() {
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }

    fun activateSecurityMode() {
        for (device in devices) {
            if (device is Recordable) {
                device.startRecord()
            }
            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }
        }
    }
}