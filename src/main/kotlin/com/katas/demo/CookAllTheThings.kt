package com.katas.demo

class CookAllTheThings {
    fun execute(ingredients: Ingredients): CookingResults {
        var maxCookingResults = CookingResults(0, 0)

        for (i in 0..maxApplePies(ingredients)) {
            var remainingIngredients = CookApplePies(i, ingredients)
            var cookingResults = CookingResults(0, i)

            while (true) {
                try {
                    remainingIngredients = PumpkinPie.cook(remainingIngredients)
                    cookingResults = cookingResults.addPumpkinPie()
                } catch (exception: Exception) {
                    break
                }
            }

            if (cookingResults.isGreaterThan(maxCookingResults)) {
                maxCookingResults = cookingResults
            }
        }

        for (i in 0..maxPumpkinPies(ingredients)) {
            var remainingIngredients = CookPumpkinPies(i, ingredients)
            var cookingResults = CookingResults(i, 0)

            while (true) {
                try {
                    remainingIngredients = ApplePie.cook(remainingIngredients)
                    cookingResults = cookingResults.addApplePie()
                } catch (exception: Exception) {
                    break
                }
            }

            if (cookingResults.isGreaterThan(maxCookingResults)) {
                maxCookingResults = cookingResults
            }
        }

        return maxCookingResults
    }

    private fun CookPumpkinPies(amount: Int, ingredients: Ingredients): Ingredients {
        var remainingIngredients = ingredients
        for (i in 1..amount) {
            remainingIngredients = PumpkinPie.cook(remainingIngredients)
        }
        return remainingIngredients
    }

    private fun CookApplePies(amount: Int, ingredients: Ingredients): Ingredients {
        var remainingIngredients = ingredients
        for (i in 1..amount) {
            remainingIngredients = ApplePie.cook(remainingIngredients)
        }
        return remainingIngredients
    }

    fun maxPumpkinPies(ingredients: Ingredients): Int {
        var remainingIngredients = ingredients
        var pumpkinPies = 0

        while (true) {
            try {
                remainingIngredients = PumpkinPie.cook(remainingIngredients)
                pumpkinPies++
            } catch (exception: Exception) {
                break
            }
        }

        return pumpkinPies
    }

    fun maxApplePies(ingredients: Ingredients): Int {
        var remainingIngredients = ingredients
        var applePies = 0

        while (true) {
            try {
                remainingIngredients = ApplePie.cook(remainingIngredients)
                applePies++
            } catch (exception: Exception) {
                break
            }
        }

        return applePies
    }
}

data class CookingResults(val pumpkinPies: Int, val applePies: Int) {
    fun addApplePie(): CookingResults {
        return copy(applePies = applePies + 1)
    }

    fun addPumpkinPie(): CookingResults {
        return copy(pumpkinPies = pumpkinPies + 1)
    }

    fun isGreaterThan(cookingResults: CookingResults): Boolean {
        return cookingResults.pumpkinPies + cookingResults.applePies < pumpkinPies + applePies
    }
}
