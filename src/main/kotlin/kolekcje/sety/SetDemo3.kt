package doZrobienia.kolekcje

fun main() {
    //HashSet - nie zachowuje kolejności, ale zajmuje mniej pamięci
    // modyfikowalny
    val myIntHashSet1 = hashSetOf(1,2,4,5)

    //pusty do wypełenienia
    val myIntHashSet2 = hashSetOf<Int>()

    //pusty z rozmiarem lub bez
    val myIntHashSet3 = HashSet<Int>(16)

    //dodawanie elementu
    myIntHashSet1.add(3)
    myIntHashSet2.add(7)
    myIntHashSet3.add(9)


    //usuwanie elementu
    myIntHashSet1.remove(1)

}