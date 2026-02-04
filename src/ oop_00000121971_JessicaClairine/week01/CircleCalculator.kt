package ` oop_00000121971_JessicaClairine`.week01

fun main(args: Array<String>) {
    val radius = 7.0
    var pi = 3.14

    val area = pi * radius * radius
    // Output Concatenation
    println("Radius: $radius, Area: $area")

    println(checkSize(area))
}
fun checkSize(area: Double) =
    if (area > 100) "This is a Big Circle" else "This is a Small Circle"