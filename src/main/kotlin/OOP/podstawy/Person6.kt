package doZrobienia.OOP.podstawy



//parametry konstruktora - param

class Person6(val age: Int, val name:String, var weight:Int = -1, id_param: String) {

    //inicjalizacja kolejnych właściwości
    val ability = "Myśli."
    var hobby = ""
    //inicjalizacja właściwości id przekształconym parametrem/argumentem
    val id = id_param.uppercase()

    //val id = param_id.toInt()








}