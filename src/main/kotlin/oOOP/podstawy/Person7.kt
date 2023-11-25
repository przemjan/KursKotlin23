package oOOP.podstawy

//customowe gettery i settery
class Person7(val age: Int, val name:String, weight_param:Int = -1) {

    //inicjalizacja kolejnych właściwości
    val ability = "Myśli."
    var hobby = ""
    val months = 12

    //getter
    //warto używać właściwości
    val ageInMonths: Int
        get() = age * 12

    //setter
    var weight = weight_param
        set(value){
            if(value > 0) field = value
        }


}