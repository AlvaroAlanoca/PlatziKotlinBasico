package model

class Huevos (cantidad:Int, lista :List<String>):Receta(cantidad){
    init {



        for ((index,marcaHuevo) in lista.withIndex() )
        {
            println("${index.plus(1)}.$marcaHuevo")
        }


    }

}