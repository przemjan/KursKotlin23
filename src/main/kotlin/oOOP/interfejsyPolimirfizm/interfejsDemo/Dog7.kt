package oOOP.interfejsyPolimirfizm.interfejsDemo


open class Dog7() : Animal3A() {

    //wszytkie właściwości i funkcje abstract musimy zaimplementować
    // open możemy przesłonić
    override val noise = "Hau Hau"
    override val food = "mięso"
    val size = "średni"
    override var color = "Brown"
    override val isBreathing = true


    override fun makeNoise() {
    println("Robię dźwięk: $noise")
    }
    override fun eat() {
        println("Jem: $food")
    }
    override fun rest() {
        println("śpię")
    }

    //funkcja
    override fun move() {
        println("Biegam na czterech łapach")
    }

}