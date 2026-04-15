package oop_00000121971_JessicaClairine.week01.week08

object DatabaseMock {
    fun findUser(id: Int): UserProfile? {
        return if (id == 1) UserProfile("TestUser", "test@test.com") else null
    }
}

fun runMockUnitTest() {
    println("\n=== RUNNING UNIT TEST ===")
    val testUser = DatabaseMock.findUser(1)
    val initial = testUser!!.name.substring(0, 1)
    check(initial == "T") { "TEST FAILED! INITIAL IS WRONG." }
    println("Test passed: initial is T")
}