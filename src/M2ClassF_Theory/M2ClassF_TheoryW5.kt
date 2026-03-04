package M2ClassF_Theory

abstract class MataKuliah {
    var nama:String = "";
    abstract fun set_matkul(sks:Int);

    fun hasil_matkul() {
        println("matkul diminati");
    }
}