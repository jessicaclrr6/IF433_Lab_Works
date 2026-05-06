package oop_00000121971_JessicaClairine.week01.week11

fun String.addHello(): String {
    return "Hello, $this"
}

fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}

fun String?.isNullOrEmptyCustom(): Boolean {
    return this == null || this.isEmpty()
}