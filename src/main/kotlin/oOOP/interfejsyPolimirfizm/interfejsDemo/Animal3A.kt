package oOOP.interfejsyPolimirfizm.interfejsDemo


abstract class Animal3A: Movable {

   abstract val noise:String
   abstract val food: String
   abstract var color: String
   var tired = 0
   open val isBreathing = false
   val isAlive = true

    abstract fun makeNoise()
    abstract fun eat()

    //musimy zaimplementować metodę z interfejsu: interfejs jest kontraktem

    //można z implementacją
    override fun move(){
        println("Biegam")
    }

    //w klasie abstrakcyjnej może to być metoda abstrakcyjna
    //abstract override fun move();


    open fun rest(){
        println("Hibernuję")
    }

}