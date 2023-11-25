package oOOP.podstawy

fun main() {

    //wykorzystanie domyślnych wartości
    val osoba1 = Person3(28,"Kuba")

    //dostęp do automatycznych getterów
    println("${osoba1.name} ma ${osoba1.age} lat i waży ${osoba1.weight} kilo?")

    println("Ile waży ${osoba1.name}?")

    //dostęp do automatycznego settera
    osoba1.weight = readln().toInt()

    println("Po zmianach ${osoba1.name} ma ${osoba1.age} lat i waży ${osoba1.weight} kilo")

    val osoba2 = Person3(13,"Janek", 80)

    //przy użyciu nazwanych argumentów, nie trzeba zachowywać kolejności
    val osoba3 = Person3(  name = "Euzebiusz", weight = 24, age = 17,)



}
