package OOP.dziedziczenie

class Rattler1: Dog3() {


    override val noise = "Skiau Skiau"
    override val food = "Łydki"
    //nie można przesłonić właściwości które nie są open
    //override val size = "mały"


    override fun makeNoise() {
        println("Cicho skamlę: $noise")
    }
}