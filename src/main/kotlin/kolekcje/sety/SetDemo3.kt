package kolekcje.sety

fun main() {
    //HashSet - nie zachowuje kolejności, ale zajmuje mniej pamięci
    //zawsze modyfikowalny
    //deklaracja i inicjalizacja z użyciem elementów
    val myIntHashSet1 = hashSetOf(1,2,4,5)

    //pusty do wypełnienia
    val myIntHashSet2 = hashSetOf<Int>()

    //pusty z rozmiarem lub bez
    val myIntHashSet3 = HashSet<Int>(16)

    //dodawanie elementu
    myIntHashSet1.add(13)
    myIntHashSet2.add(7)
    myIntHashSet3.add(9)

    println(myIntHashSet1)
    println(myIntHashSet2)
    println(myIntHashSet3)


    //usuwanie elementu
    myIntHashSet1.remove(1)

}