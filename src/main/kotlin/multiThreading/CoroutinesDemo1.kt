package multiThreading

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    //tworzy nowy wątek globalny
    //nie zalecane

    GlobalScope.launch(Dispatchers.Default) {
        println("${Thread.currentThread()} działa.")
    }


    //tworzy koprocedury w tym samym wątku
    runBlocking {
        launch(Dispatchers.Default) {
            println("${Thread.currentThread()} działa.")
        }
    }
}