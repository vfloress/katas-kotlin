package com.katas.demo

class LeapYears {
    fun isLeap(year: Int): Boolean {
        return when {
            isDivisibleBy400(year) -> true
            isDivisibleBy100(year) -> false
            isDivisibleBy4(year) -> true
            else -> false
        }
    }

    private fun isDivisibleBy400(year: Int) = year % 400 == 0
    private fun isDivisibleBy100(year: Int) = year % 100 == 0
    private fun isDivisibleBy4(year: Int) = year % 4 == 0

    fun leapYearsInRange(min: Int, max: Int): List<Int> {
        val leapYears = mutableListOf<Int>()
        (min..max).forEach {
            if (isLeap(it)) {
                leapYears.add(it)
            }
        }

        return leapYears
    }
}
