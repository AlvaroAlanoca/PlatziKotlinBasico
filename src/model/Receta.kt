package model

abstract class Receta (var cantidad: Int){
    override fun toString(): String {
        return "Cantidad de alimentos $cantidad"
    }
}