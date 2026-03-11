package ` oop_00000121971_JessicaClairine`.week01.week06

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("$name speaker ON")
    }

    override fun turnOff() {
        println("$name speaker OFF")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }

}