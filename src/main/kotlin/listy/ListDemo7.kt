package doZrobienia.kolekcje

fun main() {
    // iterowanie po listach

    val myNamesList = mutableListOf("Zenon", "Arnold", "Karen", "Susan", "Janusz", "Euzebiusz")

    // pętla for dla kolekcji
    for(value in myNamesList){
        println(value)
        // nie można modyfikować zawartości kolekcji - poniższa linia się nie kompiluje
        //value = "Franek"
    }

    //iterator

    val myIterator = myNamesList.iterator()

    while(myIterator.hasNext()){
        println("Hi! ${myIterator.next()}")
    }


    //iterator się "zużywa"
    while(myIterator.hasNext()){
        println("Hello! ${myIterator.next()}")
    }

    //forEach

    myNamesList.forEach{println(it)}

    //starsza składnia
    myNamesList.forEach{it -> println(it)}


    //tradycyjnie (można modyfikować)

    for(i in 0 ..< myNamesList.size){
        println("tradycyjnie: ${myNamesList[i]}")
    }

    //ładniej
    for(i in myNamesList.indices){
        println("Z indeksami: $i ${myNamesList[i]}")
    }


}