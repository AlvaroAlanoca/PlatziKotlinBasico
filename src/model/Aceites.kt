package model

class Aceites (cantidad:Int, lista :List<String>):Receta(cantidad){
    init {



        for ((index,tipoAceite) in lista.withIndex() )
        {
            println("${index.plus(1)}.$tipoAceite")
        }


    }

}