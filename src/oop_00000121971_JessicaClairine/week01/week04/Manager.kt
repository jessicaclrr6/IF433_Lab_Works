package oop_00000121971_JessicaClairine.week01.week04

class Manager(
    name: String,
    baseSalary: Int
) : oop_00000121971_JessicaClairine.week01.week04.Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }

    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}