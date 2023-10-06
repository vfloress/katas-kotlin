package com.katas.demo

class ApplePie {
    companion object{
        private val ingredients = Ingredients(
            apples = 1,
            eggs = 4,
            milk = 3,
            sugar = 2
        )

        fun cook(ingredients: Ingredients): Ingredients {
            return ingredients.subtract(this.ingredients)
        }
    }
}
