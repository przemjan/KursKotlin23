package oOOP.podstawy

fun main() {
    val osoba1 = Person7(20,"Zenek",70)

    println("wiek w miesiącach ${osoba1.ageInMonths}")

    osoba1.weight = -10

    println("waga: ${osoba1.weight}")

    osoba1.weight = 13

    println("waga: ${osoba1.weight}")

}