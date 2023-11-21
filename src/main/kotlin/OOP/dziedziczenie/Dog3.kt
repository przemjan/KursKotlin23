package OOP.dziedziczenie

// klasa pochodna musi być open, żeby można było po niej dziedziczyć
open class Dog3: Animal() {

    //ale wartości odziedziczone są już open domyślnie
    //można je przesłaniać
    override val noise = "Hau Hau"
    override val food = "mięso"
    //można uniemożliwić dalsze dziedziczenie za pomocą słowa "final"
    //final override val food = "mięso"

    //nowe wartości muszą być open, żeby je można było przesłaniać
    val size = "średni"

    init {color = "brown"}

//    override fun makeNoise() {
//        super.makeNoise()
//    }

    //funkcje odziedziczone są open domyślnie
    override fun makeNoise() {
    println("Robię dźwięk: $noise")
    }

    override fun eat() {
        println("Jem: $food")
    }

}