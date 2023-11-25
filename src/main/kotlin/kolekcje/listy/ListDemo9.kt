package doZrobienia.kolekcje.listy

fun main() {
    val listOfDogs = listOf(Dog("Reksio"), Dog("Ares"), Dog("Kleks"))

    println(listOfDogs[0].name)

    listOfDogs.forEach{ println("${it.name}: ${it.color}") }

    listOfDogs[0].color = "Biały"

    listOfDogs.forEach{ println("${it.name}: ${it.color}") }

    val copyList = listOfDogs.toList()

    copyList[0].color = "Niebieski"
    
    listOfDogs.forEach{ println("${it.name}: ${it.color}") }
}