package model

class Frutas (cantidad:Int, lista:List<String>):Receta(cantidad){
    init {



        for ((index,tipoFruta) in lista.withIndex() )
        {
            println("${index.plus(1)}.$tipoFruta")
        }


    }


}