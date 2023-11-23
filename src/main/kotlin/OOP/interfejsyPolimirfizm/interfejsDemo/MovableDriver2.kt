package doZrobienia.OOP.interfejsyPolimirfizm.interfejsDemo

fun main() {

    val ruchomeList = ArrayList<Movable>()

    ruchomeList.add(Car())
    ruchomeList.add(Dog7())
    ruchomeList.add(Fish())

    for(m in ruchomeList){
        m.move()
    }


}