package kolekcje.listy

fun main() {
    val myNamesList = listOf("Janek", "Franek", "Gienek", "Zosia")

    //można wypisać całą listę
    println("Moje imiona: $myNamesList")

    //ale to nie String - trzeba użyć metody toString (domyślnie w wypisie)
    // val listaImion0: String = myNamesList
    val listaImion: String = myNamesList.toString()
    println(listaImion)

    //dostawanie się do elementu za pomocą metody get()
    println("Drugie imię: ${myNamesList.get(1)}")
    val drugieImie: String = myNamesList.get(1)
    println(drugieImie)

    // ewentualnie jak do tablicy:
    val trzecieImie: String = myNamesList[2]

    // domyślną klasą jest array list
    println(myNamesList.javaClass)

    // domyślna lista jest immutable - nie można do niej nic dodać:
    //to się nie kompiluje:

    //myNamesList.add("Jurek")

    // ani usunąć:
    //myNamesList.removeAt(1)


}