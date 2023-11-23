package nullSafety

fun main() {

    var piesek: Dog4? = Dog4()

    val userInput = readln().toInt()
    if(userInput == 0) {
        piesek = null
    }

    val zmeczony = piesek?.tired ?: throw DogException()

    println(zmeczony)
}