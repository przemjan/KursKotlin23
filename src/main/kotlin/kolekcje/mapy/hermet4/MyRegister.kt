package kolekcje.mapy.hermet4

class MyRegister {

    private val rejestr = HashMap<Int, Registrable>()

    //zwracamy kopię rejestru
    fun getRejestr(): HashMap<Int, Registrable> {
        val rejestrCopy = HashMap<Int,Registrable>()

        for((k,v) in rejestr){
            rejestrCopy.put(k,v.copy())
        }
        return rejestrCopy
    }

    fun putElement(klucz: Int, element: Registrable){
        rejestr.put(klucz, element)
    }

    //zwracamy kopię elementu
    //może być nullem
    fun getDog(klucz: Int):Registrable?{
        return rejestr[klucz]?.copy()
    }

    //zwracamy klucze
    fun getkeys():Set<Int>{
        return rejestr.keys
    }



}