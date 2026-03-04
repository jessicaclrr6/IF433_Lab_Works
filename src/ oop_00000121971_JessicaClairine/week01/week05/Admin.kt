package ` oop_00000121971_JessicaClairine`.week01.week05

class Admin(nama: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang duduk di depan komputer melayani administrasi.")
    }
    fun doAdminWork() {
        println("[$nama] sedang dmerekap data absensi mahasiswa")
    }
}