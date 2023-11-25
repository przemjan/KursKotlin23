package kolekcje.mapy.hermet3

fun main() {

    val piesek = Dog("Reksio")

    piesek.tired = 13

    println("Oryginał: $piesek")

    //tworzymy kopię i zapisujemy do zmiennej
    val piesekKopia = piesek.copy()

    println("Kopia: $piesekKopia")

    piesekKopia.tired = 44

    //zmieniamy kopię, a nie oryginał
    println("Oryginał: $piesek")
    println("Kopia: $piesekKopia")


}