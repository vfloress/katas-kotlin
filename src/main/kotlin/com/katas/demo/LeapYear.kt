package com.katas.demo

class LeapYear {

    fun validateSingleYear(year: Int): String {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 && year % 100 == 0)) {
            return yearIsLeap(year)
        }

        return yearIsNotLeap(year)
    }

    fun validateYears(yearsRange: IntRange): ArrayList<Int> {
        val leapYears = ArrayList<Int>()
        for (year in yearsRange) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 && year % 100 == 0)) {
               leapYears.add(year)
            }
        }
        return leapYears
    }

    private fun yearIsNotLeap(year: Int) = "El año $year no es bisiesto"

    private fun yearIsLeap(year: Int) = "El año $year es bisiesto"

}
