package doZrobienia.kolekcje.listy


open class Dog(nameParam: String) : Animal() {

    //wszytkie właściwości i funkcje abstract musimy zaimplementować
    override val noise = "Hau Hau"
    override val food = "mięso"
    val size = "średni"

    override var color = "Brown"
    override val isBreathing = true

    val name = nameParam


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