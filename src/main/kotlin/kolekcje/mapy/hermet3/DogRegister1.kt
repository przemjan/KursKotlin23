package kolekcje.mapy.hermet3

class DogRegister1 {

    private val rejestr = HashMap<Int, Dog>()

    //zwracamy kopię rejestru
    fun getRejestr(): HashMap<Int, Dog> {
        val rejestrCopy = HashMap<Int, Dog>()

        for((k,v) in rejestr){
            rejestrCopy.put(k,v.copy())
        }
        return rejestrCopy
    }

    fun putDog(klucz: Int, pies: Dog){
        rejestr.put(klucz, pies)
    }

    //zwracamy konkretnego psa
    //może być nullem
    fun getDog(klucz: Int): Dog?{
        return rejestr[klucz]?.copy()
    }

    //zwracamy klucze
    fun getkeys():Set<Int>{
        return rejestr.keys
    }



}