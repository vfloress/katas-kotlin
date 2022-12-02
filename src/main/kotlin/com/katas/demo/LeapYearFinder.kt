package com.katas.demo

class LeapYearFinder {
    fun isLeapYear(year: Int): Boolean {
        if (Math.floorMod(year, 400) == 0) return true
        if (Math.floorMod(year, 100) == 0) return false
        if (Math.floorMod(year, 4) == 0) return true

        return false
    }

    fun leapYearsFromRange(start: Int, end: Int) = (start..end).filter { isLeapYear(it) }
}
