package oOOP.dziedziczenie

fun main() {
    val pies = Dog1()
    //właściwości zostały przesłonięte
    println("${pies.food}, ${pies.noise}")

    //odwołujemy się do funkcji klasy bazowej
    pies.makeNoise()
    pies.eat()
    pies.color = "red"

    println(pies.color)

    pies.move()

}