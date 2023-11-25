package oOOP.podstawy

import java.util.Random

class Player2 {

    val kostka = Random()
    var score = 0
    val kostkaSize = 6

    fun throwDie(){
        score += kostka.nextInt(kostkaSize)
    }

    //agregacja vs kompozycja
}