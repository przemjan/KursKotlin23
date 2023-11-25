package kolekcje.mapy.hermet2

fun main() {
    val rejestrPies = DogRegister1()

    //wsadzamy jakieś psy na naszą listę
    rejestrPies.putDog(1, Dog("Reksio"))
    rejestrPies.putDog(2, Dog("Dyzio"))
    rejestrPies.putDog(3, Dog("Ares"))



    //kopiujemy rejestr
    var rejestrCopy = rejestrPies.getRejestr()

    println("Kopia: $rejestrCopy")


    val keys = rejestrPies.getkeys()

    //wyświetlamy oryginalną listę psów
    println("Lista psów w oryginalnym rejestrze: ")
    for(k in keys){
        println(rejestrPies.getDog(k))
    }

    //próbujemy zmienić jakiegoś psa w kopii:

    for(k in keys){
        println(rejestrCopy[k]?.name)
        //nie zadziała
        //name jest val w klasie Dog
        //rejestrCopy[k]?.name = "Wałkonik"

    }

    for(k in keys){
        println(rejestrCopy[k]?.name)
        //to zadziała - color to var
        rejestrCopy[k]?.color = "Wałkonik"

    }

    //wyświetlamy oryginalną listę psów
    //w skopiowanej mapie mamy referencje do oryginalnych obiektów
    println("Lista psów w oryginalnym rejestrze: ")
    for(k in keys){
        println(rejestrPies.getDog(k))
    }




}