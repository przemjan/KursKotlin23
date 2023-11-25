package kolekcje.mapy

fun main() {

    //mapa przechowuje pary elementów
    //pierwszy element w parze to klucz (key)
    //drugi element w parze to wartość (value)
    //deklaracja i inicjalizacja


    val myMap1 = mapOf(7 to "siedem", 9 to "dziewięć", 3 to "trzy")

    val myMap2 = mapOf("jeden" to "one",  "trzy" to "three", "dwa" to "two")

    //deklaracja - pusta niemodyfikowalna mapa
    val myMap3 = mapOf<String, String >()
    val myMap4 = emptyMap<String, String>()

    //domyślne niemodyfikowalne
    //to się nie kompiluje
    //myMap2.put("siedem" to "seven")

    //domyślna implementacja to LinkedHashMap - zachowuje kolejność dokładania elementów
    val ostatni = myMap1.keys.last()
    println("Ostatni klucz w mapie: $ostatni")
    val pierwszy = myMap1.keys.first()
    println("Pierwszy klucz w mapie: $pierwszy")

    println(myMap2)

    //odzyskiwanie elementu po kluczu:
    println(myMap1.get(7))
    //lub
    println(myMap1[3])

    //brak pary key-value zwraca null

    println(myMap1.get(1))
    //lub
    println(myMap1[2])

}
