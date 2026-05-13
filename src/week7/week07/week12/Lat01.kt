package week7.week07.week12

// basic exception trycatch
fun pembagian(pembilang:Int, penyebut:Int) {
    try {
        val hasilBagi = pembilang / penyebut
        println("hasil bagi: $hasilBagi")
    } catch (e: Exception) {
        println("eror dipembagian: ${e.message}")
    } finally {
        println("selesai pembagian")
    }
}

//basic exception expression  tipe data
fun cek_tipe_data() {
    var angka:Int = try {
        Integer.parseInt("nsnjcd")
    } catch (e: Exception) {
        println("ada eror di cek Tipe data ${e.message}")
        111
    }
    println("angka kamu adalah $angka")
}

// throw
fun cek_saldo(saldoSaya:Int) {
    if(saldoSaya<1000) {
        throw IllegalArgumentException("Saldo ${saldoSaya}  tidak perlu bayar pajak")
    } else {
        println("selamat kamu orang kaya")
    }
}

//custom expection
class CekNilaiKKM(val kkm: Int, val nilai: Int): Exception("Nilai $nilai berada dibawah kkm $kkm")

class nilai_siswa(val kkm:Int) {
    fun input_nilai(nilaiKamu: Int) {
        if(nilaiKamu < kkm) {
            throw CekNilaiKKM(kkm, nilaiKamu)
        } else {
            println("kamu lulus, dengan nilai $nilaiKamu")
        }
    }
}

// multiple catch
fun contoh_multiple_catch(nilai:String) {
    try {
        val angka = Integer.parseInt(nilai)
        val hasil = angka/2
        println("hasil nilainya: $hasil")
        cek_saldo(100)
    } catch (e: NumberFormatException) {
        println("error salah format ${e.message}")
    } catch (e: ArithmeticException) {
        println("erros kesalahan aritmatika ${e.message}")
    } catch (e: Exception) {
        println("error program : ${e.message}")
    }
}

sealed class ATMException(pesan: String) : Exception(pesan)

class saldo_dibawah_nol(val saldoKamu: Int): ATMException("masa Saldo $saldoKamu mines.")
class cek_jumlah_saldo(val saldoAwal: Int, val jajan: Int): ATMException("saldo tinggal $saldoAwal, kamu jajan $jajan, ga cukup bang")

fun mulai_jajan(saldoAwalKamu:Int, jajanKamu:Int): Int {
    if(jajanKamu > saldoAwalKamu) {
        throw cek_jumlah_saldo(saldoAwalKamu, jajanKamu)
    } else if (saldoAwalKamu < 0) {
        throw saldo_dibawah_nol(saldoAwalKamu)
    } else {
        println("transaksi berhasil!!!")
    }
    return saldoAwalKamu - jajanKamu
}
fun main() {
    runCatching { mulai_jajan(1000, 900) }
        .onSuccess{println("Transaksi sukses: $it")}
        .onFailure{println("Transaksi gagal: $it")}

    contoh_multiple_catch("100")
    // panggil class custom exception
    val nsiswa = nilai_siswa(70)
    try {
        nsiswa.input_nilai(78)
    } catch (e: Exception) {
        println("ada eror saat inpit nilai ${e.message}")
    }
    //coba throw
    try {
        cek_saldo(990)
    } catch (e:Exception) {
        println("eror di throw: ${e.message}")
    }
    //exception expression
    cek_tipe_data()

    // exception basic
    pembagian(10, 2)
}