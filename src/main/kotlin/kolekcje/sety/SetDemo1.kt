package doZrobienia.kolekcje

fun main() {

    //set - zbiór unikalnych elementów (ńie powtarzają się)

    // immutable set
    //domyślna implementacja: LinkedHashSet
    val intSet1 = setOf(1,2,3,4)

    val wanted = 2

    //sprawdzanie czy set zawiera wartość
    if (intSet1.contains(wanted)){
        println("$wanted is in the set")
    }

    //LinkedHashSet zachowuje kolejność
    val pierwszy = intSet1.first()
    println(pierwszy)

    val last = intSet1.last()
    println(last)

    //kolejność nie ma znaczenia przy porównywaniu setów

    val intSet2 = setOf(4, 3, 2, 1)

    if(intSet2 == intSet1){
        println("Sety są takie same")
    }

    //tworzenie pustego setu -- niemodyfikowalny - nie można nic dodać
    val intSet3 = setOf<Int>()

    //to się nie kompiluje
    //intSet3.add(3)

}