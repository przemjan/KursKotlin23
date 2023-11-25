package kolekcje.mapy.hermet1


abstract class Animal {
   //właściwości bez wartości domyślnej deklarujemy jako abstract
   abstract val noise:String
   abstract val food: String
   abstract var color: String

   //możemy mieć właściwości domyślne
   var tired = 0
   //open
   open val isBreathing = false
   //lub nie
   val isAlive = true

    //funkcje bez domyślnego kodu deklarujemy jako abstract
    abstract fun makeNoise()
    abstract fun eat()
    //możemy zaimplementować funkcje domyślne
    fun move(){
        println("Biegam")
    }
    open fun rest(){
        println("Hibernuję")
    }
    //
}