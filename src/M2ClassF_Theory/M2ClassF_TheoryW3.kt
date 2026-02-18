package M2ClassF_Theory

open class Bapake {
    private var  nama: String = "Belum Tahu";
    private var umur: Int = 35;
    protected var gaji: Int = 1000;

    public var uangjajan: Int = 0
        set(value) {
            if (value < 0){
                println("masa uang jajan 0 atau minus");
            } else {
                field = value;
            }
        }
    get() {
        return field +123;
    }

    public fun set_nama(namabaru:String) {
        if(this.nama.length <= 0) {
            println("Eh nama gaboleh kosong");
        } else {
            this.nama = namabaru;
        }
    }
    public fun get_nama():String {
        return this.nama;
    }

    public fun set_umur(umur: Int) {
        if(this.umur <= 0) {
            println("Eh umur gaboleh mines");
        } else {
            this.umur = umur;
        }
    }
    public fun get_umur(): String {
        return this.umur.toString();
    }
}

class anake: Bapake(){
    fun dapetin_gaji_bapak():Int {
        this.gaji = 5500;
        return this.gaji + 100;
    }
}

fun main() {
    var ank = anake();
    ank.set_nama("udin");
    println("nama papi kamu ${ank.get_nama()}");
    println("gaji bapak : " + ank.dapetin_gaji_bapak());

    ank.uangjajan = -100;
}