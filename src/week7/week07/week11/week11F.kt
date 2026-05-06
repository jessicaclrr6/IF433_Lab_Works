package week7.week07.week11

//function biasa
fun panggil_nama(nama:String): String {
    return "hai $nama";
}
// function extension function BASIC
fun String.panggil_mahasiswa(): String {
    var hasil = this.split(" ").joinToString(" ") {
        it.replaceFirstChar {
            c -> c.uppercaseChar()
        }
    }
    return hasil;
}

//function extensio parameter
fun Int.tentukanLulus(nama:String): String {
    var keputusan = "";
    if(this >= 70) {
        keputusan = "lulus"
    } else {
        keputusan = "remedial"
    }
    return "mahasiswa $nama hasil keululusan adalah $keputusan";
}

//function extension cek null
fun String?.cekNulldanEmpty():String {
    if(this == null || this.isEmpty())  {
        return "gaboleh null atau kosong bang";
    } else {
        return "username kamu adalah $this"
    }
}

class Mahasiswa() {
    var nim: String = ""
    var nama:String = ""
    var ipk:Int = 0
}

fun main() {
    // cara panggil extension cek null
    var inputUsername:String? = null
    println(inputUsername.cekNulldanEmpty())

    //cara panggil function extension parameter
    println(80.tentukanLulus("revan"))

    //cara panggil function biasa
    println(panggil_nama("toni").uppercase());

    //cara panggil funnction extension basic
    println("tonyy stark iron man".panggil_mahasiswa());

    //SCOPE - LET
    var kampusSaya = "UMN"
    kampusSaya.let {
        if(it == "umn") {
            println("kampus " + it + " keren")
        } else {
            println("amazing $it")
        }
    }


    //scope - run
    var alamatSaya = "gading serpong"
    alamatSaya.run {
        println("alamat saya adalah " + this)
    }


    //scope with
    var gradeSaya = with (90) {
        if(this >= 80) {
            "A"
        } else if (this >= 70) {
            "b"
        } else {
            "c"
        }
    }
    println("Grade kamu adalah $gradeSaya")

    //scope apply
    var dataMahasiswa = Mahasiswa().apply {
        nim = "23456"
        nama = "yudi"
        ipk = 3
    }
    println("mahasiswa ${dataMahasiswa.nama} dengan nim ${dataMahasiswa.nim} ipknya ${dataMahasiswa.ipk}")


    // scope also
    var deretAngka = mutableListOf<Int>(80, 60, 75, 68, 85)
    deretAngka.also {
        println("sebelum $deretAngka")

    }.add(90)
    println("setelah $deretAngka")
}