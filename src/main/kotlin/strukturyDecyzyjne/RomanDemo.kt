package Zrobione.decyzje.whenDemos

import kotlin.system.exitProcess

fun main() {

    val lowerLimit = 1
    val upperLimit = 10

    val welcomeMessage = "Podaj liczbę od $lowerLimit do $upperLimit"

    println(welcomeMessage)

    val liczba = readln().toInt()
    val errorMessage = "Liczba nie mieści się w zakresie $lowerLimit do $upperLimit"

    if(liczba !in lowerLimit .. upperLimit){
        println(errorMessage)
        exitProcess(0)
    }

    val roman = when(liczba){
        1-> "I"
        2-> "II"
        3-> "III"
        4-> "IV"
        5-> "V"
        6-> "VI"
        7-> "VII"
        8-> "VIII"
        9-> "IX"
        10->"X"
        else->{
            liczba
        }
    }

    val resultMessage = "Liczba $liczba to w systemie rzymskim: $roman"
    println(resultMessage)

}