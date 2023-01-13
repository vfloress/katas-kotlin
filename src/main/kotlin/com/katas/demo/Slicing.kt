package com.katas.demo

object Slicing {

    fun execute(matrix: Array<Array<Int>>): Int {

        return if (matrix.size < 3) {
            matrix.sumOf {
                it.minOrNull() ?: 0
            }
        } else {
            return matrix[0][0] + recursive(0, 1, matrix)
        }

    }

    private fun recursive(sum: Int, level: Int, matrix: Array<Array<Int>>): Int {
        val leftMatrix = smallMatrix(level, 0, matrix)
        val rightMatrix = smallMatrix(level, 1, matrix)
        return if (level + 1 < leftMatrix.size) {
            minOf(sum + recursive(sum, level + 1, leftMatrix), sum + recursive(sum, level + 1, rightMatrix))
        } else {
            minOf(calculateMatrix2(leftMatrix), calculateMatrix2(rightMatrix))
        }
    }

    private fun calculateMatrix2(matrix: Array<Array<Int>>): Int {
        return matrix.sumOf {
            it.minOrNull() ?: 0
        }
    }

    private fun smallMatrix(level: Int, position: Int, matrix: Array<Array<Int>>): Array<Array<Int>> {
        val miniMatrixRoot = matrix[level][position]
        val miniMatrixLevel1Pos0 = matrix[level + 1][position]
        val miniMatrixLevel1Pos1 = matrix[level + 1][position + 1]

        return arrayOf(arrayOf(miniMatrixRoot), arrayOf(miniMatrixLevel1Pos0, miniMatrixLevel1Pos1))
    }
}
