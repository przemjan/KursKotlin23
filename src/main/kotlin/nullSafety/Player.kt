package nullSafety

class Player {
    var pies: Dog4? = Dog4()

    //to się nie kompiluje!!
    //kod może być zmodyfikowany w trakcie
//    fun dance1(){
//        if(pies != null){
//            println("Ja tańczę.")
//            pies.move()
//        }
//    }

    fun dance2(){
        println("Ja tańczę.")
        pies?.move()
    }
}