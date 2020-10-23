package model

class Carne (cantidad : Int, lista:List<String>):Receta(cantidad ){
    init {



        for ((index,tipoCarne) in lista.withIndex() )
        {
            println("${index.plus(1)}.$tipoCarne")
        }


}

 }