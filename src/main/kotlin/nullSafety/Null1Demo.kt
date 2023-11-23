package nullSafety

fun main() {
    var piesek1 = Dog4()

    //to się nie kompiluje
    //var piesek1 = null

    //? przy typie zmiennej oznacza, że może przechowywać nulla
    var piesek2: Dog4?  = Dog4()

    piesek2 = null

    printDog1(piesek1)

    //to się nie kompiluje -- ta funkcja nie przyjmuje wartości null
    //printDog1(piesek2)

    printDog2(piesek1)
    printDog2(piesek2)


}
fun printDog1(pies: Dog4){
    pies.eat()
}



fun printDog2(pies: Dog4?){
    //pies.eat()
    if(pies != null) {
        pies.eat()
    }
}

fun printDog3(pies: Dog4?){
    //uproszczony zapis (nie tylko) -- wykona się tylko wtedy, gdy pies
    //nie będzie przechowywał referencji do null
    pies?.eat()
}

//bezpieczne sprawdzanie (kolejność wyrażeń):
fun printDog4(pies: Dog4?){
    if(pies != null && pies.tired < 10){
        pies.move()
    }
}

//zwracanie referencji do obiektu z możliwym nullem
fun initDog(): Dog4?{
    return Dog4()
}