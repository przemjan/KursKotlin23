package doZrobienia.OOP.interfejsyPolimirfizm.abstractDemo


open class Dog6() : Animal2A() {

    //wszytkie właściwości i funkcje abstract musimy zaimplementować
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

}