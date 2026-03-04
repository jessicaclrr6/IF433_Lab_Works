package M2ClassF_Theory

fun main() {
    val listMatkul: List<MataKuliah> = listOf(
        Wajib(),
        Elective()
    );
    println("banyak tipe matkul: $listMatkul");

    for(mku in listMatkul) {
        mku.set_matkul(3);

        if(mku is Wajib) {
            mku.ada_seminar();
        } else if (mku is Elective) {
            mku.ada_praktek();
        }
        when(mku) {
            is Wajib -> {
                print("Wajib dari When: ")
                mku.ada_seminar();
            }
            is Elective -> {
                print("Elective dari When: ")
                mku.ada_praktek();
            }
        }
    }
    //val wjb = Wajib();
    //wjb.set_matkul(3);

    //val elc = Elective();
   //elc.set_matkul(2);
}