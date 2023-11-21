package OOP.dziedziczenie

fun main() {
    val pies = Dog2()
    println("${pies.food}, ${pies.noise}")


    pies.makeNoise()
    pies.eat()
    pies.color = "red"

    println(pies.color)

    pies.move()

}