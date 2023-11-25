package multiThreading

fun main() {
    val thread1 = Thread{
        println("${Thread.currentThread()} działa 1")
    }

    val thread2 = Thread{
        println("${Thread.currentThread()} działa 2")
    }
    thread1.start()
    thread2.start()

}