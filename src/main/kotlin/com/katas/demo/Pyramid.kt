package com.katas.demo

class Pyramid(i: Int, vararg nodeValues: List<Int>) {
    private val nodes: List<Int>
    private val minimumValuesForNodes: MutableMap<Int, Int>

    init {
        if (nodeValues.size != i) {
            throw Exception("The pyramid should have a height of $i but it has been given ${nodeValues.size}")
        }
        nodes = mutableListOf()
        minimumValuesForNodes = mutableMapOf()
        nodeValues.forEach { nodesInFloor ->
            nodesInFloor.forEach {
                nodes.add(it)
            }
        }
    }

    private fun getFloor(floorValue: Int): List<Int> {
        val startVal = (0 until floorValue).sum()
        return nodes.subList(startVal, startVal + floorValue)
    }

    private fun floorExists(floorValue: Int): Boolean {
        val endVal = (0 until floorValue).sum() + floorValue
        return endVal <= nodes.size
    }

    fun getPyramidMinimumWeight(): Int {
        return getNodeMinValue(1, 0)
    }

    private fun getNodeMinValue(floor: Int, position: Int): Int {
        val cachedValue = getCachedMinNodeValue(floor, position)
        if (cachedValue != null) return cachedValue

        val currentNodeValue = getFloor(floor)[position]
        if (!floorExists(floor + 1)) {
            cacheMinNodeValue(floor, position, currentNodeValue)
            return currentNodeValue
        }
        val minVal =
            minOf(getNodeMinValue(floor + 1, position), getNodeMinValue(floor + 1, position + 1)) + currentNodeValue
        cacheMinNodeValue(floor, position, minVal)
        return minVal
    }

    private fun cacheMinNodeValue(floor: Int, position: Int, value: Int) {
        val listPosition = (0 until floor).sum() + position
        minimumValuesForNodes[listPosition] = value
    }

    private fun getCachedMinNodeValue(floor: Int, position: Int): Int? {
        val listPosition = (0 until floor).sum() + position
        if (minimumValuesForNodes.containsKey(listPosition)) {
            return minimumValuesForNodes[listPosition]
        }

        return null
    }
}
