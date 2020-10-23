package model

class Leche(cantidad:Int,lista:List<String>):Receta(cantidad) {

    init {



        for ((index,marcaLeche) in lista.withIndex() )
        {
            println("${index.plus(1)}.$marcaLeche")
        }


    }
}

