package ` oop_00000121971_JessicaClairine`.week01.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}