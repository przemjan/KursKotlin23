package doZrobienia.kolekcje

fun main() {
    // iterowanie po listach

    val myNamesList = mutableListOf("Zenon", "Arnold", "Karen", "Susan", "Janusz", "Euzebiusz")

    // pętla for dla kolekcji
    for(name in myNamesList){
        println(name)
        // nie można modyfikować zawartości kolekcji - poniższa linia się nie kompiluje
        //name = "Franek"
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



    //tradycyjnie (można modyfikować)

    for(i in 0 ..< myNamesList.size){
        println("tradycyjnie: ${myNamesList[i]}")
    }

    //ładniej
    for(i in myNamesList.indices){
        println("Z indeksami: $i ${myNamesList[i]}")
    }
}