package oOOP.podstawy

//bloki init

class Person5(val age: Int, val name:String, var weight:Int = -1) {
    //init wykonywany po kostruktorze
    init{
        println("Person innit")
    }
    //inicjalizacja kolejnych właściwości
    val ability = "Myśli."
    var hobby = ""
    //kolejny init wykonywany po inicjalizacji dodatkowych właściwości
    init{
        weight -= 1
    }





}