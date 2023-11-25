package kolekcje.sety

fun main() {

    //iterowanie po setach
    val planetSet = hashSetOf("Earth", "Jupiter", "Mars", "Venus")

    for(planet in planetSet){
        println(planet)
    }

    val planetIterator = planetSet.iterator()
    while (planetIterator.hasNext()){
        println(planetIterator.next())
    }

    //iterator umożliwia modyfikację setów
    //czyl dodawanie i usuwanie elementów
    val planetIterator2 = planetSet.iterator()
    while(planetIterator2.hasNext()){
        if(planetIterator2.next().length > 6){
            planetIterator2.remove()
        }
    }

    //pętla forEach()
    planetSet.forEach { println(it) }

    println(planetSet)







}