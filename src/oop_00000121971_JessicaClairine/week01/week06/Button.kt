package oop_00000121971_JessicaClairine.week01.week06

class Button(override val name: String) : Clickable {
    override fun click() {
        println("$name clicked")
    }
}