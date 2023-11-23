package doZrobienia.kolekcje

fun main() {

    // żeby można dodać lub usunąć element trzeba użyć mutableList:

    val countries = mutableListOf("Brazil", "Poland", "China", "Germany")
    val continents = mutableListOf <String>()


    val planets = emptyList<String>()


    println("0. $countries rozmiar: ${countries.size}")

    // na końcu:
    countries.add("USA")
    continents.add("Africa")


    //nie zadziała
    //planets.add("Earth")

    println("1. $countries rozmiar: ${countries.size}")
    // w dowolnym miejscu:
    
    countries.add(3, "Canada")
    println("2. $countries rozmiar: ${countries.size}")

    // możemy również usunąć element:

    countries.remove("China")

    println("3. $countries rozmiar: ${countries.size}")

    // lub usunąć element za pomocą indeksu:
    countries.removeAt(3)

    println("3. $countries rozmiar: ${countries.size}")






}