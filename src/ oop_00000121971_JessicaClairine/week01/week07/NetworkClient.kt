package ` oop_00000121971_JessicaClairine`.week01.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url")
    }
}