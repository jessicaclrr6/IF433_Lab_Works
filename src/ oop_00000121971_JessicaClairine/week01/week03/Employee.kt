package ` oop_00000121971_JessicaClairine`.week01.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatuf! Di- set ke 0.")
                field = 0
            } else {
                field = value
            }
        }
}