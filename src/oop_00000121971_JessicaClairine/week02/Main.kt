package oop_00000121971_JessicaClairine.week02

import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukan Nama: ")
    val name = scanner.nextLine()

    println("Masukan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine() // bersihkan buffer newline(penyakit klasik scanner!)

    // validasi di sisi pemanggil (main)
    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
        // program berheti di sini untuk mahasiswa ini, tidak membuat objek
    } else {
        print("Masukan Jurusan: ")
        val major = scanner.nextLine()

        // instansiasi objek karena data sudah aman
        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai.")
    }
}

