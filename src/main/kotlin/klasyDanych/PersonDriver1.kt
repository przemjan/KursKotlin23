package klasyDanych

fun main() {


    val osoba1 = Person("Jerzy", 123)

    val osoba2 = Person("Janek", 456)

    //automatyczna funkcja equals

    if(osoba1 == osoba2){
        println("te osoby są takie same")
    }else{
        println("te osoby różnią się")
    }


}