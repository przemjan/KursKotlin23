package doZrobienia.kolekcje

fun main() {
    val myNamesList = mutableListOf("Zenon", "Arnold", "Karen", "Susan", "Janusz", "Euzebiusz")

    //listIterator
    val myListIterator = myNamesList.listIterator()

    while(myListIterator.hasNext()){
        println(myListIterator.next())
    }

    //iterator się "zużywa" ponowne wywołanie nic nie robi
//    while(myListIterator.hasNext()){
//        println(myListIterator.next())
//        println("hejka")
//    }
//
//    while(myListIterator.hasNext()){
//        myListIterator.set("${myListIterator.next()} zmieniony ")
//    }


    //ale można go używać w odwrotnym kierunku

    while (myListIterator.hasPrevious()){
        println("Od końca: ${myListIterator.previous()}")

    }

    //modyfikacje



    val myListIterator3 = myNamesList.listIterator()
    while(myListIterator3.hasNext()){

        if(myListIterator3.next().length >= 8){
            myListIterator3.remove()
        }

    }
    println(myNamesList)

    //alternatywnie funkcja usuwająca jeżeli spełniony jest warunek
    //myNamesList.removeIf{it.length > 5 }

    val myListIterator2 = myNamesList.listIterator()
    while(myListIterator2.hasNext()){
        myListIterator2.set("${myListIterator2.next()} zmodyfikowany")
    }


    println(myNamesList)
}