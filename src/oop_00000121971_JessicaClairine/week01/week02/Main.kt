package oop_00000121971_JessicaClairine.week01.week02

import oop_00000121971_JessicaClairine.week01.week02.Student

import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = readLine()!!

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = readLine()!!

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        // Instansiasi Objek karena data sudah aman
        val s1 = _root_ide_package_.oop_00000121971_JessicaClairine.week01.week02.Student(name, nim, major)
        println("Status: Pendaftaran Selesai.")
    }

    print("Pilih Jalur (1. Reguler, 2. Umum): ")
    val type = readLine()!!.toInt()

    if (type == 1) {
        print("Masukkan Jurusan: ")
        val major = readLine()!!
        val s1 = _root_ide_package_.oop_00000121971_JessicaClairine.week01.week02.Student(name, nim, major)
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
    } else if (type == 2) {
        val s2 = _root_ide_package_.oop_00000121971_JessicaClairine.week01.week02.Student(name, nim)
        println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
    } else {
        println("Pilihan ngawur, pendaftaran batal!")
    }
}
