package nullSafety

fun main() {

    println("Podaj numer buta:")

    var numerButa: Int
    try {
        numerButa = readln().toInt()
    } catch(e: NumberFormatException){
        //opcjonalne:
        e.printStackTrace()
        println("niewłaściwy format")
        numerButa = -1
    }

    println("numer buta: $numerButa")

}