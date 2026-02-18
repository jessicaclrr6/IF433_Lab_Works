package M2ClassF_Theory

class Pemain {
    var nama:String = "tidak terdaftar";
    var speed:Int = 9;
    val shoot:Int = 8;

    init {
        this.nama = "messi";
        println("ini adalah consturctor")
    }

    constructor(namapanjang:String="Budi", kecepatan:Int=2){
        nama = namapanjang;
        speed = kecepatan;
        println("ini constructor kedua")
    }
    fun bawa_bola() {
        println("si $nama sedang bawa bola")
    }
}

fun main () {
    val player = Pemain("yoel", kecepatan=100);
    player.bawa_bola();
    println("nama pemain: ${player.nama}");
    println("skill Kecepatan: " + player.speed);

    val player2 = Pemain(namapanjang = "ronaldo", kecepatan = 90);
    println("pemain populer: ${player2.nama}");
    println("kecepatan: ${player2.speed}");
}

// secondary