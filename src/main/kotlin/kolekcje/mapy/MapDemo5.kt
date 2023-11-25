package kolekcje.mapy

fun main() {
    //kluczem lub wartością może być dowolny obiekt

    val map1 = HashMap<String, Int>()
    val map2 = HashMap<Double, String>()

    val map3 = HashMap<Dog,String>()

    //możemy zagnieżdżać kolekcje

    val map4 =HashMap<String,HashMap<String, Int>>()



    map4.put("Server",hashMapOf("Działa" to 1, "Wyłączony" to 0, "Zepsuty" to -1 ))

    map4["Server2"] = hashMapOf("Działa" to 1 )

    val map5 = HashMap<String, ArrayList<Dog>>()


    //dostajemy się do wewnętrznej hashmapy:
    val serverState = map4["Server"]?.get("Działa")

    println("Stan serwera: $serverState")


}