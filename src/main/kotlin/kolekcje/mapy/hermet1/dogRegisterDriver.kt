package kolekcje.mapy.hermet1

fun main() {
    val rejestrPies = DogRegister1()

    rejestrPies.rejestr.put(1, Dog("Reksio"))
    rejestrPies.rejestr.put(2, Dog("Dyzio"))
    rejestrPies.rejestr.put(3, Dog("Ares"))


    for(d in rejestrPies.rejestr){
        println(d)
    }
    for(d in rejestrPies.rejestr.keys){
        rejestrPies.rejestr[d] = Dog("Wałkonik")
    }

    for(d in rejestrPies.rejestr){
        println(d)
    }

}