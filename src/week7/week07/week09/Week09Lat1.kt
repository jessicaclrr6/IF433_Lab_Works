package week7.week07.week09

fun main() {
    println("========== LIST OF IMUT ==========");
    val arSiswa = listOf("Budi", "Danu", "SUSI", "caca");
    //view
    println(arSiswa);

    //panjang array
    println("banyak siswa: " + arSiswa.size);

    //munculin satu orang aja
    println("siswa bernama ${arSiswa[1]}")

    //muncuin semua orang for each
    for(a in arSiswa) {
        print("siswa " + a + " dan ");
    }

    println("======= LIST OF MUTABLE =======");
    val arMatkul = mutableListOf("oop", "pemweb", "matdis", "kalkulus");
    arMatkul.add("algo");
    arMatkul[2] = "aljabar linear"
    arMatkul.remove("pemweb")
    println(arMatkul);

    println("======= SET OF IMUT =======");
    val arNilai = setOf(80,90,75,85,80,30,50,85);
    println("banyak nilai: ${arNilai.size}");
    println("ada angka 90 gak? ${arNilai.contains(90)}")
    println(arNilai);

    println("======= SET OF MUTABLE =======");
    val arMahasiswa = mutableSetOf("andi", "yanto", "yudha", "udin");
    arMahasiswa.add("YANTI");
    arMahasiswa.remove("udin");
    arMahasiswa.add("udin");
    println(arMahasiswa);

    println("======= MAP OF IMUT =======");
    val arResto = mapOf(
        "ayam" to 5000,
        "bakpao" to 3000,
        "sayur asem" to 2500
    );
    println("banyak menu ${arResto.size}");
    println("harga ayam ${arResto["ayam"]}");
    println("list makanan: ${arResto.keys}");
    println("list harga: ${arResto.values}");
    println(arResto);


    println("======= MAP OF MUTABLE =======");
    val arKHS = mutableMapOf(
        "toni" to 80,
        "Nika" to 85,
        "ara" to 87,
        "davin" to 90
    );
    arKHS.remove("ara");
    arKHS["nika"] = 92
    arKHS ["cinta"] = 99
    println(arKHS);


    println("======== LAMBDA ========");
    //fun biasa
    fun tambah(a:Int, b:Int):Int {
        return a+b;
    }
    println("hasil penambahan ${tambah(5,3)}")

    //dunction lambda, tulisannya kesamping/ horizontal
    val kurang = { a:Int, b:Int -> a-b};
    println("hasil pengurangfan ${kurang(5,3)}");

    println("======= lambda { it } =======")
    val pangkat = {a:Int -> a*a}
    val hasilPangkat:(Int)-> Int = {it *it}
    println("hasil pangkat ${hasilPangkat(5)}");


    println("======= FOREACH BIASA ========")
    for(a in arMatkul) {
        print(a)
    }

    println("======== FOREACH IT ========")
    arMatkul.forEach {
        print(it)
    }

    println("======== FOREACH VARIABLE ========")
    arMatkul.forEach {
        mk -> println(mk);
    }
}

