package OOP.dziedziczenie

//klasa bazowa musi być open
open class Animal {
   //wszystkie właściwości val, które chcemy przesłonić muszą być open
   open val noise= ""
   open val food = ""
   var color = ""

    //funkcje, które chcemy przesłonić muszą być open
    open fun makeNoise(){
        println("Robię dźwięk:")
    }
    open fun eat(){
        println("Jem")
    }
    fun move(){
        println("Biegam")
    }
}