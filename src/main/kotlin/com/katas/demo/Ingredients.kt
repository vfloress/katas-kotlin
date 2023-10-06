package com.katas.demo

data class Ingredients(
    val pumpkinFlavouring: Int = 0,
    val apples: Int = 0,
    val eggs: Int = 0,
    val milk: Int = 0,
    val sugar: Int = 0
) {
    fun subtract(ingredients: Ingredients): Ingredients {
        val remainingPumpkinFlavouring = this.pumpkinFlavouring - ingredients.pumpkinFlavouring
        val remainingApples = this.apples - ingredients.apples
        val remainingEggs = this.eggs - ingredients.eggs
        val remainingMilk = this.milk - ingredients.milk
        val remainingSugar = this.sugar - ingredients.sugar

        if (remainingPumpkinFlavouring < 0 || remainingApples < 0 || remainingEggs < 0 || remainingMilk < 0 || remainingSugar < 0) {
            throw NotEnoughIngredientsException()
        }

        return Ingredients(
            pumpkinFlavouring = remainingPumpkinFlavouring,
            apples = remainingApples,
            eggs = remainingEggs,
            milk = remainingMilk,
            sugar = remainingSugar,
        )
    }
}
