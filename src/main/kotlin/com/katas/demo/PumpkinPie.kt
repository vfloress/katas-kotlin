package com.katas.demo

class PumpkinPie {
    companion object{
        private val ingredients = Ingredients(
            pumpkinFlavouring = 1,
            eggs = 3,
            milk = 4,
            sugar = 3
        )

        fun cook(ingredients: Ingredients): Ingredients {
            return ingredients.subtract(this.ingredients)
        }
    }
}

