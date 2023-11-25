package kolekcje.mapy.hermet2

class DogRegister1 {

    private val rejestr = HashMap<Int, Dog>()

    //zwracamy kopię rejestru
    fun getRejestr() = rejestr.toMutableMap()

    fun putDog(klucz: Int, pies: Dog){
        rejestr.put(klucz, pies)
    }

    //zwracamy konkretnego psa
    //może być nullem
    fun getDog(klucz: Int): Dog?{
        return rejestr[klucz]
    }

    //zwracamy klucze
    fun getkeys():Set<Int>{
        return rejestr.keys
    }



}