package nullSafety

fun main() {
    var piesek: Dog4? = Dog4()
    piesek?.tired = 7

    println("Podaj liczbę: ")
    val userInput = readln().toInt()
    if(userInput == 0) {
        piesek = null
    }


    //?.let wykona kod tylko wtedy gdy piesek nie jest null
    piesek?.let{
        if(piesek.tired < 10){
            piesek.move()
        }

    }


}