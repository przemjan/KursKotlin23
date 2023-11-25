package kolekcje.mapy

fun main() {
    // HashMap - zajmuje mniej pamięci, nie gwarantuje porządku
    //domyślnie jest modyfikowalna

    val myHashMap = HashMap<Char, Int>()

    myHashMap.put('c', 3)
    myHashMap.put('a',1)
    myHashMap.put('b', 2)


    println(myHashMap)

    myHashMap.remove('b')

    println(myHashMap)

}