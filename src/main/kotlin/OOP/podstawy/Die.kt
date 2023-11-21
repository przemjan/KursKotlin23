package doZrobienia.OOP.podstawy
import java.util.*


//konstruktor bezargumentowy
class Die {

    val chaos =  Random()
    val size = 6

    fun sayNumber() = chaos.nextInt(size)+1

    fun sayNumber2(): Int{
        //size = 13
        drukuj()
        return chaos.nextInt(size)+1
    }
    private fun drukuj(){
        println("jestem w metodzie prywatnej")
    }
}

    //modyfikatory dostępu:
    //w klasach:
    //public -- domyślny, private - widoczne tylko dla klasy,
    // protected -- klasa bazowa i klasy pochodne
    //internal -- wewnątrz danego modułu,
        // wszystko co "widzi" klasę widzi jej elementy internal

    //w plikach:
    //public -- domyślny, private -- widoczne tylko w obrębie pliku
    // internal -- w obrębie modułu, protected -- nieobecny