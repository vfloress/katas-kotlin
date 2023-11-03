package com.katas.demo

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PieCookerTest {

    @Test
    fun `should do 3 pumpkin and 0 apple`() {
        val result = PieCooker().cook(pantry= Ingredients(
            pumpkinSyrup = 10,
            apples = 14,
            eggs = 10,
            milkCups = 42,
            sugarCups = 24
        ))

        assertEquals(CookingResult(3,0), result)
    }
    @Test
    fun `should do 5 pumpkin and 3 apple`() {

        val result = PieCooker().cook(pantry= Ingredients(
            pumpkinSyrup = 12,
            apples = 4,
            eggs = 40,
            milkCups = 30,
            sugarCups = 40
        ))

        assertEquals(CookingResult(5,3), result)
    }
    @Test
    fun `should do 5 pumpkin and 1 apple`() {

        val result = PieCooker().cook(pantry= Ingredients(
            pumpkinSyrup = 12,
            apples = 14,
            eggs = 20,
            milkCups = 42,
            sugarCups = 24
        ))

        assertEquals(CookingResult(5,1), result)
    }
}
