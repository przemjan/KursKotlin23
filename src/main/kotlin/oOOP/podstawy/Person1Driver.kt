package oOOP.podstawy

fun main() {

    val osoba1 = Person1(28,"Kuba",20)

    //dostęp do automatycznych getterów
    println("${osoba1.name} ma ${osoba1.age} lat i waży ${osoba1.weight} kilo?")

    println("Ile waży ${osoba1.name}?")

    //dostęp do automatycznego settera
    //val uniemożliwia nam tylko zmianę referencji, a nie modyfikacji obiektu
    osoba1.weight = readln().toInt()

    println("Po zmianach ${osoba1.name} ma ${osoba1.age} lat i waży ${osoba1.weight} kilo")

    //przy użyciu nazwanych argumentów, nie trzeba zachowywać kolejności
    var osoba2 = Person1(weight = 80, name = "Euzebiusz", age = 17)

    //zmiana referencji
    osoba2 = Person1(name = "Franek", weight = 34, age = 11)

}
//można definiować klasy bezpośrednio w pliku :/
class Person2 (val age: Int, val name:String, var weight:Int){

}