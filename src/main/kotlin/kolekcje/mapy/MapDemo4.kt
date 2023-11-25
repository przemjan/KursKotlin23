package kolekcje.mapy

fun main() {
    //iterowanie po mapach

    val myMap = hashMapOf<String, Double>("Mało" to 0.1, "Niewiele" to 0.2, "Dużo" to 5.0)

    val myMap2 = mutableMapOf<String, Double>("2" to 2.0, "3" to 3.0, "4" to 4.0, "5" to 5.0, "6" to 6.0)

    //for dla kolekcji
    //po kluczach
    for(key in myMap.keys){
        println(key)
        myMap[key] = 0.1
    }
    //po wartościach
    for(value in myMap.values){
        println(value)
    }

    //po parze klucz -wartość
    for((key, value) in myMap){
        println("klucz: $key, wartość: $value")
    }




    //for dla kolekcji uniemożliwia modyfikację kolekcji
    //tzn. np. usuwanie par elementów

    //to się skompiluje, ale wyrzuci wyjątek:
//    for(key in myMap2.keys){
//        if(myMap2[key]!! == 4.0){
//            myMap2.remove(key)
//        }
//    }

    //to też nie zadziała
//    for(key in myMap2.keys){
//        if(myMap2[key]!! == 5.0){
//            myMap2["Ogromnie"] = 1000.0
//        }
//    }

    println("zupa: $myMap2")

    //ale można zmienić element
    for((key, value) in myMap2){
        if(key == "2")
            myMap2[key] = 12.0

    }

    println("zmodyfikowana mapa2: $myMap2")

    println("Iterator: ")
    //iterator umożliwia modyfikację elementów

    val mutIterator = myMap.iterator()
    while(mutIterator.hasNext()){
        println(mutIterator.next())
    }
    val mutIterator2 = myMap.iterator()
    while(mutIterator2.hasNext()){
        if(mutIterator2.next().value > 4.0){
            mutIterator2.remove()
        }
    }

    println("Końcowe wartości")
    for( value in myMap.values){
        println(value)
    }




}