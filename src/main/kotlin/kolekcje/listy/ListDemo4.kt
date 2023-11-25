package doZrobienia.kolekcje

fun main() {

    // Możemy również użyć bezpośrednio ArrayList --- wtedy lista będzie modyfikowalna

    val myCitiesList = arrayListOf("Kraków", "Bytom", "Poznań", "Gdańsk")

    //pusta ArrayList z rozmiarem początkowym lub bez
    val myCountriesList = ArrayList<String>(16)

    println(myCitiesList)
    myCountriesList.add("Belgium")

    myCitiesList.add("Szczecin")
    println(myCitiesList)

    myCitiesList.remove("zupa")
    println(myCitiesList)

    myCitiesList.remove("Poznań")
    println(myCitiesList)

    myCitiesList.removeAt(4)
    println(myCitiesList)

}