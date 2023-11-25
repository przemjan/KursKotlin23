package oOOP.podstawy



//customowe gettery i settery

class Person8(val age: Int, val name:String, var weight:Int = -1) {

    //inicjalizacja kolejnych właściwości
    val ability = "Myśli."

    //lateinit - niebezpieczne i niezalecane
    // nie dotyczy typów prostych:
    // typów liczbowych(Int, Double itp), Boolean i Char które muszą być zainicjowane
    lateinit var hobby: String

   // init{hobby = "hippika"}

//    fun makehobby(){
//        hobby = "Skoki o tyczce"
//    }

}