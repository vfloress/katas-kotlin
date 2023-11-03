package com.katas.demo

fun main() {
    println("Bienvenidxs a las sesiones de coding!")
}

data class Ingredients(
    val pumpkinSyrup: Int,
    val apples: Int,
    val eggs: Int,
    val milkCups: Int,
    val sugarCups: Int,
){
    fun basicsEmpty(): Boolean {
        return eggs < 0 || milkCups < 0|| sugarCups < 0
    }
    fun somethingEmpty(): Boolean {
        return pumpkinSyrup < 0 || apples < 0|| basicsEmpty()
    }
}

/*

    10 cucharadas de saborizante sabor calabaza
    14 manzanas
    10 huevos
    42 tazas de leche
    24 tazas de azúcar

 */
