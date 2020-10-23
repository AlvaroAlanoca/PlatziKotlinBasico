package model

class Cereal (cantidad:Int,lista:List<String>):Receta(cantidad){

init {



    for ((index,tipoCereal) in lista.withIndex() )
    {
        println("${index.plus(1)}.$tipoCereal")
   }
}

}