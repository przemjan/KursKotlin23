package kolekcje.mapy.hermet3

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
        //to zadziała
        rejestrCopy[k]?.color = "Wałkonik"

    }

    //wyświetlamy oryginalną listę psów
    println("Lista psów w oryginalnym rejestrze: ")
    for(k in keys){
        println(rejestrPies.getDog(k))
    }
    println("Lista psów w skopiowanym rejestrze: ")
    for(k in keys){
        println(rejestrCopy.get(k))
    }




}