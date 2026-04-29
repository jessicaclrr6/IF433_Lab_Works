package week7.week07.week10

//code non generic
class rumah(var alamat:Any)

//code generic
class kampus<T>(val alamat:T)

//code generic multiparameter
class Komputer<T, V>(val merk:T, val barcode:V)

//code generic - function
fun <T> Password(isiPass:T):T {
    return isiPass;
}

//CODE GENERIC - fUNCTION ADA CONSTRAINT
class kalkulator<T:Number>(val a:T, val b:T) {
    fun tambah(): Int {
        return a.toInt() + b.toInt();
    }
    fun kurang(): Double {
        return a.toDouble() - b.toDouble();
    }
}

fun main() {

    println("==== GENERIC - constraint ====");
    val kalk = kalkulator(10.52,20.347);
    kalk.tambah()
    println("penambahan ${kalk.a} dtambah ${kalk.b}: " + kalk.tambah())
    println("pengurangan ${kalk.a} ditambah ${kalk.b} : " + kalk.kurang())
    kalk.kurang()

    println("==== GENERIC FUNCTION====");
    println("Password kamu: " + Password("12345"))

    println("==== GENERIC MULTI PARAMETER ====");
    val komp = Komputer("Dell", 12345);
    println("Merk komputer : " + komp.merk);
    println("barcode komputer : ${komp.barcode}")

    println("==== SAMPLE NON GENERIC ====");
    val rmh = rumah(alamat = 2000)
    val angkaRumah = rmh.alamat as Int
    println(angkaRumah + 50)

    println("==== SAMPLE GENERIC ====")
    val kmps = kampus(alamat = 300)
    println(kmps.alamat + 50)
}