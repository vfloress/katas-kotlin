package com.katas.demo

import kotlin.math.max

class PieCooker() {
    val pumpkinPieIngredients = Ingredients(
        pumpkinSyrup = 1,
        apples = 0,
        eggs = 3,
        milkCups = 4,
        sugarCups = 3
    )
    val applePieIngredients = Ingredients(
        pumpkinSyrup = 0,
        apples = 1,
        eggs = 4,
        milkCups = 3,
        sugarCups = 2
    )

    fun cook(pantry: Ingredients): CookingResult {
        val pumpkinPieAmount = calculatePieAmount(pumpkinPieIngredients, pantry)
        val applePieAmount = calculatePieAmount(applePieIngredients, pantry)

        return if (pumpkinPieAmount>applePieAmount){
            val remainingIng = with(pumpkinPieIngredients){
                Ingredients(
                    pumpkinSyrup = pantry.pumpkinSyrup-(pumpkinSyrup*pumpkinPieAmount),
                    apples = pantry.apples-(apples*pumpkinPieAmount),
                    eggs = pantry.eggs-(eggs*pumpkinPieAmount),
                    milkCups = pantry.milkCups-(milkCups*pumpkinPieAmount),
                    sugarCups = pantry.sugarCups-(sugarCups*pumpkinPieAmount),
                )
            }
            CookingResult(pumpkinPieAmount, calculatePieAmount(applePieIngredients, remainingIng))
        }else{
            val remainingIng = with(applePieIngredients){
                Ingredients(
                    pumpkinSyrup = pantry.pumpkinSyrup-(pumpkinSyrup*applePieAmount),
                    apples = pantry.apples-(apples*applePieAmount),
                    eggs = pantry.eggs-(eggs*applePieAmount),
                    milkCups = pantry.milkCups-(milkCups*applePieAmount),
                    sugarCups = pantry.sugarCups-(sugarCups*applePieAmount),
                )
            }
            CookingResult(calculatePieAmount(pumpkinPieIngredients, remainingIng), applePieAmount)
        }

    }

    private fun calculatePieAmount(pie: Ingredients, pantry: Ingredients): Int {
        val pantryLeft = Ingredients(
            pumpkinSyrup = pantry.pumpkinSyrup-pie.pumpkinSyrup,
            apples = pantry.apples-pie.apples,
            eggs = pantry.eggs-pie.eggs,
            milkCups = pantry.milkCups-pie.milkCups,
            sugarCups = pantry.sugarCups-pie.sugarCups
        )
        return if (pantryLeft.somethingEmpty()) {
            0
        } else {
            calculatePieAmount(pie, pantryLeft)+1
        }
    }


}

data class CookingResult(
    val pumpkinPieAmount: Int,
    val applePieAmount: Int
)
