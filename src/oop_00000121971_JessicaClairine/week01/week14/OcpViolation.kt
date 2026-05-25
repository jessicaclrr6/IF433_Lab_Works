package oop_00000121971_JessicaClairine.week01.week14

class DiscountCalculator {
    fun calculator(price:Double, type: String):Double {
        return when (type) {
            "student" -> price * 0.80
            "member" -> price * 0.85
            "emplyoee" -> price * 0.70
            else -> price
        }
    }
}