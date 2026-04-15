package oop_00000121971_JessicaClairine.week01.week05

fun main() {
    val dosen1 = _root_ide_package_.oop_00000121971_JessicaClairine.week01.week05.Dosen("Pak Alex", "0123456")
    val admin1 = _root_ide_package_.oop_00000121971_JessicaClairine.week01.week05.Admin("Bu Siti")

    val daftarPegawai: List<oop_00000121971_JessicaClairine.week01.week05.Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is oop_00000121971_JessicaClairine.week01.week05.Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn}")
                pegawai.mengajar()
            }
            is oop_00000121971_JessicaClairine.week01.week05.Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("------------------------------------------------------------------------------------")

        println("===== TEST OVERLOADING =====")

        val math = _root_ide_package_.oop_00000121971_JessicaClairine.week01.week05.MathHelper()

        println("Luas Persegi: ${math.hitungLuas(4)}")
        println("Luas Persegi Panjang: ${math.hitungLuas(5, 3)}")
        println("Luas Lingkaran: ${math.hitungLuas(7.0)}")


        println("===== TEST PAYMENT =====")

        val ewallet = _root_ide_package_.oop_00000121971_JessicaClairine.week01.week05.EWallet("Jessica", 50000.0)
        val creditCard =
            _root_ide_package_.oop_00000121971_JessicaClairine.week01.week05.CreditCard("Jessica", 100000.0)

        val payments: List<oop_00000121971_JessicaClairine.week01.week05.PaymentMethod> = listOf(ewallet, creditCard)

        for (payment in payments) {
            payment.processPayment(75000.0)

            if (payment is oop_00000121971_JessicaClairine.week01.week05.EWallet) {
                println("Saldo kurang, melakukan top up...")
                payment.topUp(50000.0)
                payment.processPayment(75000.0)
            }

            println("------------")
        }
    }
}
