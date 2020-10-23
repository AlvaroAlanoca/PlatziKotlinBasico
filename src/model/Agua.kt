package model

 class Agua (cantidad: Int,lista:List<String>): Receta(cantidad) {

  init {



        for ((index,marcaAgua) in lista.withIndex() )
        {
            println("${index.plus(1)}.$marcaAgua")
        }


}

}