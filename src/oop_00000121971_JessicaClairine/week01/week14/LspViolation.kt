package oop_00000121971_JessicaClairine.week01.week14

open class Rectangle {
    open var width: Int = 0
    open var height: Int = 0
    fun area() = width * height
}

class Square : Rectangle() {
    override var width: Int = 0
        set(value) { field = value; super.height = value}
    override var height: Int = 0
        set(value) { field = value; super.width = value}
}