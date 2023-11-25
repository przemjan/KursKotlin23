package oOOP.interfejsyPolimirfizm.abstractDemo


open class Dog5: Animal() {


    override val noise = "Hau Hau"
    override val food = "mięso"
    val size = "średni"

    init {color = "brown"}



    override fun makeNoise() {
    println("Robię dźwięk: $noise")
    }

    override fun eat() {
        println("Jem: $food")
    }

}