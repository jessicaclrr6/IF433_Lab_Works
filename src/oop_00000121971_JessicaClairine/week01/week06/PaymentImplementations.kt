package oop_00000121971_JessicaClairine.week01.week06

class Gopay : oop_00000121971_JessicaClairine.week01.week06.PaymentMethod {
    override fun pay(amount: Double) { println("Processing Rp$amount via Gopay Server") }
}

class CreditCard : oop_00000121971_JessicaClairine.week01.week06.PaymentMethod {
    override fun pay(amount: Double) { println("Contacting Bank for Rp$amount") }
}