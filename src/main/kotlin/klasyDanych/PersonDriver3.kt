package klasyDanych

fun main() {

    val osoba1 = Person("Jerzy", 123)

    val osoba2 = Person("Jerzy", 123)

    //automatyczna  funkcja equals

    //sprawdzanie czy obiekty są takie same
    if(osoba1 == osoba2){
        println("te osoby są takie same")
    }else{
        println("te osoby różnią się")
    }

    //sprawdzanie czy to ten sam obiekt
    if(osoba1 === osoba2){
        println("to ta sama osoba")
    }else{
        println("to są inne osoby")
    }

    val osoba3 = osoba1

    if(osoba1 === osoba3){
        println("to ta sama osoba")
    }else{
        println("to są inne osoby")
    }
    

}