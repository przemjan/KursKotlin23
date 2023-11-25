package oOOP.interfejsyPolimirfizm.abstractDemo

class Fish: Animal2A() {
    override val noise = "Bul Bul"

    override val food = "Plankton"
    override var color = "Srebrny"

    override val isBreathing = false

    override fun makeNoise() {
        println("Robię $noise")
    }

    override fun eat() {
        println("Wciągam plankton")
    }
}