package doZrobienia.OOP.interfejsyPolimirfizm.interfejsDemo

class Fish:Animal3A() {
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

    override fun move() {
        println("Pływam")
    }
    fun layEggs(){
        println("Składam ikrę")
    }
}