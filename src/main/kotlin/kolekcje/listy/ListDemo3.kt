package doZrobienia.kolekcje

fun main() {
    // val oznacza tylko, że referencja pozostaje niezmienna

    val countries = mutableListOf("Brazil", "Poland", "China", "Germany")
    //countries = mutableListOf("Mercedes", "Renault")


    // natomiast do zmiennej typu var możemy przypisać inny obiekt tej samej klasy, lub klasy pochodnej
    var cars = listOf("Mercedes", "Renault")

    println(cars)

    cars = listOf("Porsche", "Toyota")

    println(cars)
    //cars.add("zupa")

    cars = mutableListOf("Londyn", "Warszawa")
    println(cars)

    cars.add("zupa")
    println(cars)




    //to się niekompiluje


    //cars = mapOf("Kapusta" to 1, "Pomidor" to 2)



}