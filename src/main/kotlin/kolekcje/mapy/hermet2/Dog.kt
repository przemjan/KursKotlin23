package kolekcje.mapy.hermet2


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

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Dog

        if (noise != other.noise) return false
        if (food != other.food) return false
        if (size != other.size) return false
        if (color != other.color) return false
        if (isBreathing != other.isBreathing) return false
        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        var result = noise.hashCode()
        result = 31 * result + food.hashCode()
        result = 31 * result + size.hashCode()
        result = 31 * result + color.hashCode()
        result = 31 * result + isBreathing.hashCode()
        result = 31 * result + name.hashCode()
        return result
    }

    override fun toString(): String {
        return "Dog(color='$color', name='$name')"
    }


}