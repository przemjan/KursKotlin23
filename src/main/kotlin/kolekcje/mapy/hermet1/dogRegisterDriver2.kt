package kolekcje.mapy.hermet1

fun main() {
    val rejestrPies = DogRegister1()

    rejestrPies.rejestr.put(1, Dog("Reksio"))
    rejestrPies.rejestr.put(2, Dog("Dyzio"))
    rejestrPies.rejestr.put(3, Dog("Ares"))


    for(d in rejestrPies.rejestr){
        println(d)
    }

    val rejestrCopy = rejestrPies.rejestr

    rejestrCopy.clear()

    println("Rozmiar mapy w rejestrze psów: ${rejestrPies.rejestr.size}")

    for(d in rejestrPies.rejestr){
        println(d)
    }
}