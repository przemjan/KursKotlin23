package doZrobienia.OOP.podstawy

fun main() {
    val osoba1 = Person4(20,"Zenek",70)

    println("${osoba1.name} ma możliwości: ${osoba1.ability}")
    println("${osoba1.name} ma hobby: ${osoba1.hobby}")

    osoba1.hobby = "Jeżdżenie na rowerze"

    println("${osoba1.name} ma hobby: ${osoba1.hobby}")
}