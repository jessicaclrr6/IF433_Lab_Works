package ` oop_00000121971_JessicaClairine`.week01.week03

class Player(val username: String) {
    private var xp:Int = 0
    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount:Int) {
        if (amount <= 0) {
            println("XP harus angka positif!")
            return
        }

        val oldLevel = level
        xp += amount

        if (level > oldLevel) {
            println("Level Up! Selamat $username naik ke level $level")
        }

    }
}