package week7.week07.week08

class Alamat(val nomor:Int, val kota:String);
class Mahasiswa(val nim:String, val addr:Alamat?);

fun main() {
    val almt = Alamat(47,"Tangerang");
    val mhs = Mahasiswa("12345", almt);

    val defaultAlamat = mhs.addr?.let {
        alamatasli -> " sini nih... ${mhs.addr.kota} nomornya ${mhs.addr.nomor}";

    }?:"gakjelas, gatau dimana"

    println("Nimnya ${mhs.nim} tinggalnya di ${defaultAlamat}");

}