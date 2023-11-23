package nullSafety

//klasa bazowa musi być open
open class Animal {
   //wszystkie właściowości, które chcemy przesłonić muszą być open
   open val noise= ""
   open val food = ""
   var color = ""
   var tired = 0

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