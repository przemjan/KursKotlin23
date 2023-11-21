package doZrobienia.OOP.podstawy

//dodatkowe właściwości

class Person4(val age: Int, val name:String, var weight:Int = -1) {
    //dodatkowe właściwości
    val ability = "Myśli."


    //właściwości muszą mieć wartość (*!), nawet jeżeli są typu var
    //zazwyczaj przypisuje się domyślne wartości np. pusty String lub 0

    var hobby = ""
    //(*!) jeżeli nie są to zmienne prostych
    //lateinit var hobby: String




}