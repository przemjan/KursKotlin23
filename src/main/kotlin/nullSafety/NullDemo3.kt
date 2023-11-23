package nullSafety

fun main() {
    var pies: Dog4? = Dog4()

    val userInput = readln().toInt()
    if(userInput == 0) {
        pies = null
    }

    //celowe wywołanie NullPointerException
    //testowanie kodu

    val zmeczony = pies!!.tired
    println(zmeczony)
}