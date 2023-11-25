package multiThreading

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun main() {



    val baseDrum = "Bum!"
    val cymbal = "Cyk"
    //tworzy koprocedury w tym samym wątku
    runBlocking {
         launch {
            playInstrument(baseDrum)
        }
        playInstrument(cymbal)
    }
}
suspend fun playInstrument(instrument: String){

    for(i in 0..10) {
        if (instrument == "Bum!") {
            println(instrument)
            delay(100)
        } else {
            for (j in 0..1) {

                println(instrument)
                delay(101)
            }
        }
    }
}
