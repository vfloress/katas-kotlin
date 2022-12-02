package com.katas.demo

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeapYearTest {
    private lateinit var leapYear: LeapYear

    @BeforeEach
    fun setUp() {
        leapYear = LeapYear()
    }

    @Test
    fun `all years divisible by 400 are leap years`() {
        val year = 2400
        val expectedResult = "El año $year es bisiesto"
        val result = leapYear.validateSingleYear(year)
        assertEquals(expectedResult, result)
    }

    @Test
    fun `all years divisible by 100 but not by 400 are NOT leap years, examples 1700, 1900 or 2100`() {
        val year = 1700
        val expectedResult = "El año $year no es bisiesto"
        val result = leapYear.validateSingleYear(year)
        assertEquals(expectedResult, result)
    }

    @Test
    fun `all years divisible by 4 but not by 100 ARE leap years, examples 2008, 2012, 2016`() {
        val year = 2012
        val expectedResult = "El año $year es bisiesto"
        val result = leapYear.validateSingleYear(year)
        assertEquals(expectedResult, result)
    }

    @Test
    fun `all years that are not divisible by 4 are NOT leap years, examples 2017, 2018, 2019`() {
        val year = 2018
        val expectedResult = "El año $year no es bisiesto"
        val result = leapYear.validateSingleYear(year)
        assertEquals(expectedResult, result)
    }

    @Test
    fun `should return all leap years in a year range`() {
        val yearRange = 1800..2400
        val expectedLeapYears = listOf(1804, 1808, 1812, 1816, 1820, 1824, 1828, 1832, 1836, 1840, 1844, 1848, 1852, 1856, 1860, 1864, 1868, 1872, 1876, 1880,
            1884, 1888, 1892, 1896, 1904, 1908, 1912, 1916, 1920, 1924, 1928, 1932, 1936, 1940, 1944, 1948, 1952, 1956, 1960, 1964,
            1968, 1972, 1976, 1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044,
            2048, 2052, 2056, 2060, 2064, 2068, 2072, 2076, 2080, 2084, 2088, 2092, 2096, 2104, 2108, 2112, 2116, 2120, 2124, 2128,
            2132, 2136, 2140, 2144, 2148, 2152, 2156, 2160, 2164, 2168, 2172, 2176, 2180, 2184, 2188, 2192, 2196, 2204, 2208, 2212,
            2216, 2220, 2224, 2228, 2232, 2236, 2240, 2244, 2248, 2252, 2256, 2260, 2264, 2268, 2272, 2276, 2280, 2284, 2288, 2292,
            2296, 2304, 2308, 2312, 2316, 2320, 2324, 2328, 2332, 2336, 2340, 2344, 2348, 2352, 2356, 2360, 2364, 2368, 2372, 2376,
            2380, 2384, 2388, 2392, 2396, 2400)

        val result = leapYear.validateYears(yearRange)
        assertEquals(expectedLeapYears, result)
    }
}
