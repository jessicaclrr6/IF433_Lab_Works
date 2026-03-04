package M2ClassF_Theory

class Elective: MataKuliah(){
    override fun set_matkul(sks: Int) {
        super.nama = "Vr programing";
        println("Elective ${super.nama} sks $sks")
    }
    fun ada_praktek() {
        println("wajib dipraktekin");
    }
}