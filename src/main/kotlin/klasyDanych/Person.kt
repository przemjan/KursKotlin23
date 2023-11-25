package klasyDanych

//nie mogą być open ani abstract natomiast mogą dziedziczyć
//jeżeli wszystkie zmienne zadeklarujemy jako val będą w pełni immutable
data class Person (val name: String, val pesel: Int) {
}