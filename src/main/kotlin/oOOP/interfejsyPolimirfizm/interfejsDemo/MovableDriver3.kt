package oOOP.interfejsyPolimirfizm.interfejsDemo

fun main() {

    val ruchomeList = ArrayList<Movable>()

    ruchomeList.add(Car())
    ruchomeList.add(Dog7())
    ruchomeList.add(Fish())


    for(m in ruchomeList){
        m.move()

        //smartcast
        if(m is Fish){
            m.layEggs()
        }

        if(m is Dog7){
            (m).makeNoise()
        }
        //bezpieczne wywołanie
        if(m is Car){
            m?.drive()
        }

        if(m !is Car){
            println("Żyję: ${(m as Animal3A).isAlive}")
            //println("Żyję: ${m.isAlive}")
        }

        println()
    }

}