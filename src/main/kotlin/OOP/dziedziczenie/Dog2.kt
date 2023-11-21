package OOP.dziedziczenie

class Dog2: Animal() {

    override val noise = "Hau Hau"
    override val food = "mięso"

    init {color = "brown"}


    //przesłanianie funkcji
    override fun makeNoise() {
    println("Robię dźwięk: $noise")
    }

    override fun eat() {
        println("Jem: $food")
    }

}