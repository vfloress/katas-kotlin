package com.katas.demo

object LeapYears {
    fun isLeap(year: Int): Boolean {
        return when {
            year.isDivisibleBy400() -> true
            year.isDivisibleBy100() -> false
            year.isDivisibleBy4() -> true
            else -> false
        }
    }

    fun leapYearsInRange(min: Int, max: Int): List<Int> {
        val years = mutableListOf<Int>()
        (min..max).forEach {
           years.add(it)
        }

        return years.filter { isLeap(it) }
    }
}

private fun Int.isDivisibleBy400() = this % 400 == 0
private fun Int.isDivisibleBy100() = this % 100 == 0
private fun Int.isDivisibleBy4() = this % 4 == 0
