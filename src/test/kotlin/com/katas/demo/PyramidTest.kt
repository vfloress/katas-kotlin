package com.katas.demo

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL
import javax.net.ssl.HttpsURLConnection

class PyramidTest {
    @Test
    fun testWithFourArguments() {
        val pyramid = Pyramid(4, listOf(1), listOf(2, 3), listOf(4, 5, 6), listOf(7, 8, 9, 10))
        val slideValue = pyramid.getPyramidMinimumWeight()
        Assertions.assertEquals(14, slideValue)
    }

    @Test
    fun testWithFourArguments2() {
        val pyramid = Pyramid(4, listOf(3), listOf(7, 4), listOf(2, 4, 6), listOf(5, 5, 9, 3))
        val slideValue = pyramid.getPyramidMinimumWeight()
        Assertions.assertEquals(16, slideValue)
    }

    @Test
    fun testWith15Arguments() {
        val pyramid = Pyramid(
            15,
            listOf(75),
            listOf(95, 64),
            listOf(17, 47, 82),
            listOf(18, 35, 87, 10),
            listOf(20, 4, 82, 47, 65),
            listOf(19, 1, 23, 75, 3, 34),
            listOf(88, 2, 77, 73, 7, 63, 67),
            listOf(99, 65, 4, 28, 6, 16, 70, 92),
            listOf(41, 41, 26, 56, 83, 40, 80, 70, 33),
            listOf(41, 48, 72, 33, 47, 32, 37, 16, 94, 29),
            listOf(53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14),
            listOf(70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57),
            listOf(91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48),
            listOf(63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31),
            listOf(4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23),
        )
        val slideValue = pyramid.getPyramidMinimumWeight()
        Assertions.assertEquals(447, slideValue)
    }

    @Test
    fun testWith500Arguments() {
        val params = readFile()
        val numberOfFloors = params.removeFirst().first()
        val pyramid = Pyramid(numberOfFloors, *params.toTypedArray())
        val slideValue = pyramid.getPyramidMinimumWeight()
        Assertions.assertEquals(130572, slideValue)
    }

    private fun readFile(): MutableList<List<Int>> {
        val url = URL("https://pastebin.com/raw/1A9u3epn")
        val uc: HttpsURLConnection = url.openConnection() as HttpsURLConnection
        val br = BufferedReader(InputStreamReader(uc.inputStream))
        var line: String?
        val params = mutableListOf<List<Int>>()
        while (br.readLine().also { line = it } != null) {
            params.add(line?.split("\\s".toRegex())!!.map { it.toInt() })
        }
        return params
    }
}
