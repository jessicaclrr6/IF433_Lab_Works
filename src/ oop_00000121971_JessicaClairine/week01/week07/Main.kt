package ` oop_00000121971_JessicaClairine`.week01.week07

import ` oop_00000121971_JessicaClairine`.week01.week07.DatabaseManager.connectionStatus

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION ONJECT ===")
    val client = NetworkClient.createClient()
    client.connect()
}