package oOOP.podstawy

fun main() {

    //przy użyciu nazwanych argumentów, nie trzeba zachowywać kolejności
    val osoba = Person2( weight = 23, age = 77, name = "Janek")

    println("\"${osoba.name} ma ${osoba.age} lat i waży ${osoba.weight} kilo?\"")
}