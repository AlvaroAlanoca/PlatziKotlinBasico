package model

class Verduras (cantidad:Int,lista:List<String>):Receta(cantidad) {
    init {



        for ((index,tipoVerdura) in lista.withIndex() )
        {
            println("${index.plus(1)}.$tipoVerdura")
        }


    }

}