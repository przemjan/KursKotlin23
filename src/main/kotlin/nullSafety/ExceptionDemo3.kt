package nullSafety

fun main() {

    println("Podaj numer buta:")

    val numerButa: Int = try {
        readln().toInt()
    } catch(e: NumberFormatException){
        //opcjonalne:
        //e.printStackTrace()
        println("niewłaściwy format")
        -1
    }

    println("numer buta: $numerButa")

}