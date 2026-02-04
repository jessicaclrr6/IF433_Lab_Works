package ` oop_00000121971_JessicaClairine`.week01

fun main() {
    val gameTitle = "Blockblast"
    val price = 750000
    val finalPrice = calculateDiscount(price)
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) {
        price - (price * 20 / 100)
    } else {
        price - (price * 10 / 100)
    }
