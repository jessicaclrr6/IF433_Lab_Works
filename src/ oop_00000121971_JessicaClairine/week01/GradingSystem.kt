package ` oop_00000121971_JessicaClairine`.week01

fun main() {
    // REFACTOR: Gunakan val dan hapus tipe data eksplisit
    val name = "Jhon Thor"
    val score = 80

    // REFACTOR: String Template ($name)
    println("Nama: $name, Nilai: $score")

    // Tambahkan di bawah println
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

    println("Grade kamu: $grade")
    println("Status: ${calculateStatus(score)}")
    val studentId: String? = null
    val idLength = studentId?.length ?: 0
    println("Panjang ID: $idLength")
}

// Tulis DI LUAR oop_00000121971_JessicaClairine.week01.week02.main()
fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"
