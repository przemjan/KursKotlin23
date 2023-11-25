package doZrobienia.kolekcje

fun main() {
    //sortowanie list

    //mutable (in place)
    val myNamesList = mutableListOf("Zenon", "Arnold", "Karen", "Susan", "Janusz")


    println(myNamesList)
    myNamesList.sort()

    println(myNamesList)

    //immutable

    val myCarsList = listOf("Zaz", "Volvo", "Peterbilt", "Ford")
    println(myCarsList)



    val myCarsListSorted = myCarsList.sorted()

    println(myCarsListSorted)

    //analogicznie do tablic:

    //mutable
    myNamesList.reverse()
    myNamesList.shuffle()
    myNamesList.sort()

    //immutable

    val myCarsListReversed = myCarsList.reversed()
    val myCarsListShuffled = myCarsList.shuffled()






}