package week7.week07

fun main() {
    println("server: ${Koneksi.linkServer}");
    Koneksi.test_koneksi();

    Mahasiswaa.nama="Udin";
    val na:Int = Mahasiswaa.set_nilai(80, 100);
    println("Nilai ${Mahasiswaa.nama} adalah $na");

    Mahasiswaa.isi_nama_kampus("UMN")

    val dsn1 = Dosen("Indah", "12345", 2020);
    println(dsn1);
    val dsn2 = dsn1.copy("Budi", "3421");
    println(dsn2);
    //cara ambil data satu persatu field
    println("Nama dosen1: ${dsn1.nama} masuk tahun ${dsn1.tahunMasuk}");

    println("Matkul fav saya: " + MataKuliahhh.OOP.name);
    println("Index matkul : " + MataKuliahhh.OOP.ordinal);
    MataKuliahhh.OOP.sks_matkul();
}