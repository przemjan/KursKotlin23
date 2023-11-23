package doZrobienia.kolekcje

fun main() {

    //iterowanie po setach
    val planetSet = hashSetOf("Earth", "Jupiter", "Mars", "Venus")

    val planetIterator = planetSet.iterator()
    while (planetIterator.hasNext()){
        println(planetIterator.next())
    }

    val planetIterator2 = planetSet.iterator()
    while(planetIterator2.hasNext()){
        if(planetIterator2.next().length > 6){
            planetIterator2.remove()
        }
    }

    println(planetSet)





}