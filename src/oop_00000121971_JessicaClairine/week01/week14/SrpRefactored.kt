package oop_00000121971_JessicaClairine.week01.week14

class UserValidator {
    fun validator(user: User): Boolean  = user.email.contains("@") && user.age >== 18
}

class UserRepository {
    fun sae(user: User): User {
        println("Saving user: ${user.name} to Database")
    }
}

class EmailService {
    fun sendWelcome(user: User) {
        println("Welcome email -> ${user.email}")
    }
}