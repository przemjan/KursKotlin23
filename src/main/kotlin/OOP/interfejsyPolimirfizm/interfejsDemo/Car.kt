package doZrobienia.OOP.interfejsyPolimirfizm.interfejsDemo

class Car: Movable {
    //musimy zaimplementować funkcję z interfejsu: interfejs jest kontraktem
    override fun move() {
        println("Brum Brum")
    }
    fun drive(){
        println("Gaz do dechy!")
    }

}