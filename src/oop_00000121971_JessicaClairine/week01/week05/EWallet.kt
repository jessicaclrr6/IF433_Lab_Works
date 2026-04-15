package oop_00000121971_JessicaClairine.week01.week05

class EWallet(accountName: String, var balance: Double): oop_00000121971_JessicaClairine.week01.week05.PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran berhasil via EWallet. Sisa saldo: $balance")
        } else {
            println("Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top up berhasil. Saldo sekarang: $balance")
    }
}