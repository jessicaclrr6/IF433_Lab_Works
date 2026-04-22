package oop_00000121971_JessicaClairine.week01.week09

fun main() {
    println("=== TEST LIST ===")
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    println("Immutable List: $frameworks")

    val score: MutableList<Int> = mutableListOf(85, 90)
    score.add(95)
    score[0] = 88
    println("Mutable List: $score")

    println("\n=== TEST SET ===")
    val uniqueNumbers = setOf(1, 2, 2, 3, 3, 4)
    println("Unique numbers (set): $uniqueNumbers")

    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserA")
    println("Active Users: $activeUsers")

    println("\n=== TEST MAP ===")
    val studentGrades = mapOf(
        "Alice" to "A",
        "Bob" to "B",
        "Charlie" to "C",
    )
    println("Nilai Bob: ${studentGrades["Bob"]}")

    val inventory = mutableMapOf("Apples" to 50, "Bananas" to 30)
    inventory["Oranges"] = 20
    inventory["Apples"] = 45
    println("Inventory: $inventory")
}