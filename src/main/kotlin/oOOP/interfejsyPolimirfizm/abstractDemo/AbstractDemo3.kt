package oOOP.interfejsyPolimirfizm.abstractDemo

fun main() {
    val animalList = ArrayList<Animal2A>()

    animalList.add(Fish())
    animalList.add(Dog6())

    for(a in animalList){
        a.makeNoise()
        a.move()
        a.eat()
        println("Czy oddycha: ${a.isBreathing}")
        println()
    }
}