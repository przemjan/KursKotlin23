package doZrobienia.OOP.podstawy

class Player1(val kostka:Die) {

    var score = 0

    fun throwDie(){
        score += kostka.sayNumber()
    }

    //agregacja vs kompozycja
}