package doZrobienia.OOP.interfejsyPolimirfizm.abstractDemo

fun main() {
    //to się nie kompiluje
    //val zwierz = Animal2A()

    //println(zwierz.food)
    //zwierz.makeNoise()

    val pies = Dog6()

    pies.makeNoise()
    println("Pies żyje? ${pies.isAlive}")
    println("Pies oddycha? ${pies.isBreathing}")
    pies.rest()


}