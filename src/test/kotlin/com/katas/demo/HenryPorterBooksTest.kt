package com.katas.demo

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class HenryPorterBooksTest {
    @ParameterizedTest(name = "BasicTests without discounts for {0}")
    @MethodSource("getBasicTestData")
    fun shouldReturnPriceWithoutDiscount(input: List<Int>, expectedPrice: Double) {
        val henryPorterBooksPrice = HenryPorterBooks().getBestPrice(input)
        assertEquals(expectedPrice, henryPorterBooksPrice)
    }

    @ParameterizedTest(name = "Tests with basic discounts for {0}")
    @MethodSource("getSimpleDiscountTestData")
    fun shouldReturnPriceWithBasicDiscount(input: List<Int>, expectedPrice: Double) {
        val henryPorterBooksPrice = HenryPorterBooks().getBestPrice(input)
        assertEquals(expectedPrice, henryPorterBooksPrice)
    }

    @ParameterizedTest(name = "Tests with multiple discounts for {0}")
    @MethodSource("getMultipleDiscountTestData")
    fun shouldReturnPriceWithMultipleDiscounts(input: List<Int>, expectedPrice: Double) {
        val henryPorterBooksPrice = HenryPorterBooks().getBestPrice(input)
        assertEquals(expectedPrice, henryPorterBooksPrice)
    }

    @ParameterizedTest(name = "Tests with extreme discounts for {0}")
    @MethodSource("getExtremeCasesDiscountTestData")
    fun shouldReturnPriceWithExtremeDiscounts(input: List<Int>, expectedPrice: Double) {
        val henryPorterBooksPrice = HenryPorterBooks().getBestPrice(input)
        assertEquals(expectedPrice, henryPorterBooksPrice)
    }

    companion object {
        @JvmStatic
        fun getBasicTestData(): List<Arguments> = listOf(
            Arguments.of(listOf<Int>(), 0.0),
            Arguments.of(listOf(1), 8.0),
            Arguments.of(listOf(2), 8.0),
            Arguments.of(listOf(3), 8.0),
            Arguments.of(listOf(4), 8.0),
            Arguments.of(listOf(1, 1, 1), 24.0),
        )

        @JvmStatic
        fun getSimpleDiscountTestData(): List<Arguments> = listOf(
            Arguments.of(listOf(0, 1), 15.2),
            Arguments.of(listOf(0, 2, 4), 21.6),
            Arguments.of(listOf(0, 1, 2, 4), 25.6),
            Arguments.of(listOf(0, 1, 2, 3, 4), 30.0),
        )

        @JvmStatic
        fun getMultipleDiscountTestData(): List<Arguments> = listOf(
            Arguments.of(listOf(0, 0, 1), 23.2),
            Arguments.of(listOf(0, 0, 1, 1), 30.4),
            Arguments.of(listOf(0, 0, 1, 2, 2, 3), 40.8),
            Arguments.of(listOf(0, 1, 1, 2, 3, 4), 38),
        )

        @JvmStatic
        fun getExtremeCasesDiscountTestData(): List<Arguments> = listOf(
            Arguments.of(listOf(0, 0, 1, 1, 2, 2, 3, 4), 51.2),
            Arguments.of(listOf(0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4), 141.2),
        )
    }
}
