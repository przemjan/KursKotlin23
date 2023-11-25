package kolekcje.mapy

fun main() {
    //mapy modyfikowalne
    //domyślna LinkedHashMap
    val myMap1 = mutableMapOf("One" to "jeden", "Two" to "dwa", "three" to "trzy")

    val myMap2 = mutableMapOf<String, String>()

    // to się nie kompiluje
    //val myMap3 = MutableMap<String, String>()

    //wspólne metody dla interfejsu Map
    //put służy do dołożenia pary key-value
    myMap2.put("Poniedziałek", "Monday")
    myMap2.put("Wtorek", "Tuesday")
    myMap2.put("Środa", "Wednesday")
    myMap2.put("Czwartek", "Thursday")
    myMap2["Piątek"] = "Friday"


    println(myMap2)


    //remove służy do usuwania elementu za pomocą klucza
    myMap2.remove("Poniedziałek")



    println(myMap2)


    //nie zduplikujemy  istniejących kluczy
    //nie wyrzuca błędu
    //jeżeli klucz istnieje zwraca poprzednią wartość
    //w innym wypadku zwraca null

    val proba1 = myMap1.put("One", "siedemnaście")
    val proba2 = myMap1.put("four", "cztery")

    println("Udało się 1: $proba1")
    println("Udało się 2: $proba2")

    println(myMap1)

    val proba3 = myMap1.put("One", "zero")
    val proba4 = myMap1.put("five", "cztery")

    println("ZUdało się 1: $proba3")
    println("ZUdało się 2: $proba4")

    println(myMap1)




}