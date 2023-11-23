package nullSafety

fun main() {
    var gracz: Player? = Player()

    go1(gracz)
    go2(gracz)
//    gracz = null
//    go1(gracz)
//    go2(gracz)

}
// łączenie w łańcuchy wywołań
fun go1(gracz: Player?){
    gracz?.pies?.move()
}

fun go2(gracz: Player?){
    //można zwrócić
    val tir = gracz?.pies?.tired

    //można przypisać
    gracz?.pies?.tired = 7
    //uwaga!

    if(gracz?.pies?.tired!! < 10){
        gracz.dance2()
    }


    if (tir != null &&  tir < 10) {
        gracz.dance2()
    }

    if(gracz?.pies?.tired != null &&  gracz?.pies?.tired!! < 10){
        gracz.dance2()
    }
//    gracz?.let{
//        gracz.pies?.let{
//            if(gracz.pies!!.tired < 10){
//                gracz.dance2()
//            }
//        }
//
//    }
}

// elvis operator
//fun go3(gracz: Player?){
//    val tir = gracz?.pies?.tired ?: 0
//}