package doZrobienia.kolekcje

fun main() {
    //kopiowanie list (shallow copy)

    val nameList = listOf("Janek", "Franek", "Gienek")

    println(nameList)

    val namesCopy = nameList.toList()
    println(namesCopy)

    //błędny kod!!!!!

    val carList = mutableListOf("Fiat", "BMW", "Citroen")
    println(carList)

    val carCopy = carList
    println(carCopy)


    carList.add("Ferrari")

    println(carList)
    println(carCopy)

    carCopy.add("Lamborghini")

    println(carCopy)
    println(carList)

}