package week7.week07.week08

class set_krs(val nim:String, val kodematkul:String?) {
    fun matkul_wajib(sks:Int) {
        println("Matkul kamu $kodematkul sksnya adalah $sks");

    }
}

fun main() {
    var nama:String? = "Wirawan";
    nama = null;
    println("Hai $nama");

    val settingKRS = set_krs("123", "OOP")
    println("NIM kamu ${settingKRS.nim} matkul kamu ${settingKRS.kodematkul}");
    settingKRS.matkul_wajib(3);
}