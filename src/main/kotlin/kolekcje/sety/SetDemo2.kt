package doZrobienia.kolekcje

fun main() {

    //sety modyfikowalne

    val nameSet1 = mutableSetOf("Janek", "Franek", "Józek", "Euzebiusz")

    println(nameSet1)
    nameSet1.add("Johnny")
    println(nameSet1)
    nameSet1.remove("Franek")
    println(nameSet1)
    nameSet1.removeIf{it.length > 7 }

    println(nameSet1)

    val isAdded: Boolean = nameSet1.add("Janek")
    if(isAdded) {
        println(nameSet1)
    }else{
        println("Nie dodano")
    }




}