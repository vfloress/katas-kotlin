package com.katas.demo

import kotlin.test.Test
import kotlin.test.assertEquals

class SlicingTest {

    @Test
    fun `should return 3`() {
        val matrix = arrayOf(arrayOf(1), arrayOf(2, 3))
        val result = Slicing.execute(matrix)
        assertEquals(3, result)
    }

    @Test
    fun `should return 7`() {
        val matrix = arrayOf(arrayOf(1), arrayOf(2, 3), arrayOf(4, 5, 6))
        val result = Slicing.execute(matrix)
        assertEquals(7, result)
    }

    @Test
    fun `should return 5`() {
        val matrix = arrayOf(arrayOf(1), arrayOf(2, 3), arrayOf(4, 5, 1))
        val result = Slicing.execute(matrix)
        assertEquals(5, result)
    }

    @Test
    fun `should return 16`() {
        val matrix = arrayOf(arrayOf(3), arrayOf(7, 4), arrayOf(2,4,6), arrayOf(8,5,9,3))
        val result = Slicing.execute(matrix)
        assertEquals(16, result)
    }


}
