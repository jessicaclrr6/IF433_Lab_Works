package week7.week07

class Mahasiswaa private constructor(val kampus:String) {
    companion object {
        var nama:String = "Unknown";

        fun set_nilai(uts:Int, uas:Int): Int{
            return (uts+uas)/2;
        }
        fun isi_nama_kampus(namaUniv:String) {
            Mahasiswaa(namaUniv);
        }
    }
    //bagian yang class biasa (bukan companion object)
    init {
        println("nama kampus kamu $kampus")
    }
}