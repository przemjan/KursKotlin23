package kolekcje.mapy.hermet4

interface Registrable {

    val name: String

    var color: String
    fun copy():Registrable

}