package multiThreading

import kotlin.concurrent.thread

fun main() {

    val myIntArray = intArrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17)

   thread(start = true){
        for(i in myIntArray){
            if(i % 2 == 0){
                println("parzyste: $i")
                myIntArray[i] = 12
            }
        }
        println("${Thread.currentThread()} działa 1")

    }

    thread(start = true){
        for(i in myIntArray){
            if(i % 2 != 0){
                println("nieparzyste: $i")
            }
        }
        println("${Thread.currentThread()} działa 2")
    }


}