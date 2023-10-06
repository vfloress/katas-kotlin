package com.katas.demo

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CookAllTheThingsTest {
    @Test
    fun firstTest() {
        val ingredients = Ingredients(
            pumpkinFlavouring = 10,
            apples = 14,
            eggs = 10,
            milk = 42,
            sugar = 24
        )
        val cookAllTheThings = CookAllTheThings()
        val cookingResults = cookAllTheThings.execute(ingredients)

        assertEquals(CookingResults(pumpkinPies = 3, applePies = 0), cookingResults)
    }

    @Test
    fun secondTest() {
        val ingredients = Ingredients(
            12, 4, 40, 30, 40
        )
        val cookAllTheThings = CookAllTheThings()
        val cookingResults = cookAllTheThings.execute(ingredients)

        assertEquals(CookingResults(pumpkinPies = 5, applePies = 3), cookingResults)
    }

    @Test
    fun thirdTest() {
        val ingredients = Ingredients(
            12,14,20,42,24
        )
        val cookAllTheThings = CookAllTheThings()
        val cookingResults = cookAllTheThings.execute(ingredients)

        assertEquals(CookingResults(pumpkinPies = 5, applePies = 1), cookingResults)
    }
}
