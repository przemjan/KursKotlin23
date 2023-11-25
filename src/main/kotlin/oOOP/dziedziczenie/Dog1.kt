package oOOP.dziedziczenie

class Dog1: Animal() {


    //przesłaniamy ze słowem override
    override val noise = "Hau Hau"
    override val food = "mięso"

    //wartości typu var można przesłonić bez override
    init {color = "brown"}

}