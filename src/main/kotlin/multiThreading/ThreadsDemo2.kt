package multiThreading

fun main() {

    val myIntArray = intArrayOf(1,2,3,4,5,6,7,8,9,10)

    val thread1 = Thread{
        for(i in myIntArray){
            if(i % 2 == 0){
                println(i)
            }
        }
        println("${Thread.currentThread()} działa 1")
    }

    val thread2 = Thread{
        for(i in myIntArray){
            if(i % 2 != 0){
                println(i)
            }
        }
        //wstrzymanie wątku
        //Thread.sleep(100)
        println("${Thread.currentThread()} działa 2")
    }
    thread1.start()
    thread2.start()

}