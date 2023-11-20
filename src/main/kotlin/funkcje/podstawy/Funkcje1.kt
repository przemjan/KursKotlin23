package funkcje.podstawy

fun main() {
    drukuj1()
    drukuj4() // funkcja w innym pliku (helper)
    val napis = "Programowanie funkcyjne"
    drukuj2(napis)
    drukuj2("Jest fajne")
    
}
//funkcja bez parametrów
fun drukuj1(){
    println("Jestem w funkcji nr1")
}
//funkcja z parametrem
fun drukuj2(napis: String){
    println(napis)
}

