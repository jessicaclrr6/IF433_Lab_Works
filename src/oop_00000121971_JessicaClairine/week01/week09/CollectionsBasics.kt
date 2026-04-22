package oop_00000121971_JessicaClairine.week01.week09

fun main() {
    println("=== TEST LIST ===")
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    println("Immutable List: $frameworks")

    val score: MutableList<Int> = mutableListOf(85, 90)
    score.add(95)
    score[0] = 88
    println("Mutable List: $score")
}