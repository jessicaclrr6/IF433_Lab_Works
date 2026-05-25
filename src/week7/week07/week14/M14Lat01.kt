package week7.week07.week14

class khs_mahasiswa {
    fun hitung_tugass(quiz: Double, tugasHarian: Double): Double {
        return (quiz * 0.3) + (tugasHarian * 0.7)
    }

    fun hitung_NAA(uts: Double, uas: Double, tugas: Double, jamanPilih: Bobot_persen_jaman): Double {
        return jamanPilih.bobot_nilai_jaman(uts, uas, tugas)
    }
}
//ocp
interface Bobot_persen_jaman {
    fun bobot_nilai_jaman(uts: Double, uas:Double, tugas:Double):Double
}
class JamanCovid:Bobot_persen_jaman {
    override fun bobot_nilai_jaman(uts:Double, uas:Double, tugas:Double): Double {
        return (uts*0.2) + (uas*0.3) + (tugas*0.4)
    }
}

class jamanNewNormal: Bobot_persen_jaman {
    override fun bobot_nilai_jaman(uts:Double, uas:Double, tugas:Double): Double {
        return (uts*0.3) + (uas*0.4) + (tugas*0.3)
    }
}
class simpan_khs {
    fun simpan_nilai_db(nim:String, nama:String, nilaiAkhir:Double) {
        println("Data si $nim $nama dengan nilai $nilaiAkhir disimpan")
    }
    fun load_nilai_db(nim:String) {
        println("berikut data mahasiswa dengan nim $nim")
    }
}

class Manager_KHS_mhs {
    fun hitung_khs_mhs(quizMhs:Double, tugasHarianMhs:Double, utsMhs:Double, uasMhs:Double):Double {
        val khsMhs = khs_mahasiswa()
        val rataTugas:Double = khsMhs.hitung_tugass(quizMhs, tugasHarianMhs)
        return khsMhs.hitung_NAA(utsMhs, uasMhs, rataTugas, jamanNewNormal())
    }
}

class DB_KHS_mhs {
    fun saveKHSmhs(nim:String, nama:String, nilai:Double) {
        println("Mahasiswa dengan nim $nim $nama nilainya $nilai berhasil disimpan")
    }
}

fun main() {
    val mngKHS = Manager_KHS_mhs()
    val NAMhs1 = mngKHS.hitung_khs_mhs(80.50, 70.54, 85.70, 81.36)
    val NAMhs2 = mngKHS.hitung_khs_mhs(81.50, 73.14, 81.70, 71.36)

    val dbhkhsmhs = DB_KHS_mhs()
    dbhkhsmhs.saveKHSmhs("123", "yanto", NAMhs1)
    dbhkhsmhs.saveKHSmhs("123", "siska", NAMhs2)

    val khsMhs = khs_mahasiswa()
    val rataTugas:Double = khsMhs.hitung_tugass(81.5, 93.78)
    val naMhs:Double = khsMhs.hitung_NAA(80.45, 90.36,rataTugas, jamanNewNormal())
    val saveKHS= simpan_khs()
    saveKHS.simpan_nilai_db("111", "Rudi", naMhs)
}