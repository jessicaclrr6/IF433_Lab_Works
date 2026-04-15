package week7.week07.week08

fun main () {
    var nama:String? = "Susi";

    try {
        println("nama kamu ${nama!!.uppercase()}");
    }catch(ex:Exception){
        println("Errornya adalah ${ex.message}")
    }

    var dataMhs: List<Any> = listOf(123, "wirawan", 89, "Tangerang");
    for(item in dataMhs){
        var itemFilter = item as? String
        if(itemFilter!=null){
            println(itemFilter);
        }
    }
}