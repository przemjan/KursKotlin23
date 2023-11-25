package kolekcje.mapy.hermet2

fun main() {
    val rejestrPies = DogRegister1()

    //wsadzamy jakieś psy na naszą listę
    rejestrPies.putDog(1, Dog("Reksio"))
    rejestrPies.putDog(2, Dog("Dyzio"))
    rejestrPies.putDog(3, Dog("Ares"))

    val pies = Dog("Kleks")

    rejestrPies.putDog(4,pies)

    val keys = rejestrPies.getkeys()

    //wyświetlamy oryginalną listę psów
    println("Lista psów w oryginalnym rejestrze: ")
    for(k in keys){
        println(rejestrPies.getDog(k))
    }

   pies.color = "Kalasanty"

    //wyświetlamy oryginalną listę psów
    println("Lista psów w oryginalnym rejestrze: ")
    for(k in keys){
        println(rejestrPies.getDog(k))
    }



}