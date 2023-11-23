package nullSafety

fun main() {
    var piesek: Dog4? = Dog4()
    piesek?.tired = 7

    println("Podaj liczbę: ")
    val userInput = readln().toInt()
    if(userInput == 0) {
        piesek = null
    }

    val zmeczony1 = if( piesek != null){
        piesek.tired
    }
    else{
        -1
    }
    println(zmeczony1)

    //elvis operator
    val zmeczony2 = piesek?.tired ?: -2
    println(zmeczony2)


    var gracz:Player? = Player()

    if(userInput == 0){
        gracz = null
    }


    //łączenie
    val zmeczony3 = gracz?.pies?.tired ?: piesek?.tired ?: -3

    println(zmeczony3)
}