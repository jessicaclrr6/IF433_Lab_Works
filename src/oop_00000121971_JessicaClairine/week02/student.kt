package oop_00000121971_JessicaClairine.week02

class Student (val name: String, val nim: String, var major: String){
    init{
        // validasi sederhana: cek panjnag nim
        if (nim.length != 5) {
            println(" : objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("data mahasiswa $name mungkin akan bermasala di sistem.")
        } else {
            println("LOG: objek student $name berhasil dialokasikan di memory.")
        }
    }
}
