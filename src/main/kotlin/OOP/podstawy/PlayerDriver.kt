package doZrobienia.OOP.podstawy

fun main() {
    val kostka = Die()
    val gracz = Player1(kostka)

    gracz.throwDie()
    gracz.throwDie()

    println(gracz.score)


    val gracz2 = Player2()

    gracz2.throwDie()

    println(gracz2.score)

}