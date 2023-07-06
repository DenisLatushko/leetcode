package algorithms.medium

/** Description: https://leetcode.com/problems/set-matrix-zeroes/ **/

fun setZeroes(matrix: Array<IntArray>) {
    val firstRow = matrix.first()
    val isZeroFirstRow = firstRow.any { it == 0 }
    val isZeroFirstCol = matrix.map { it.first() }.any { it == 0 }

    for (col in 1..firstRow.lastIndex) {
        for (row in 0..matrix.lastIndex) {
            if (matrix[row][col] == 0) {
                firstRow[col] = 0
            }
        }
    }

    for (row in 1 .. matrix.lastIndex) {
        for (col in 0..firstRow.lastIndex) {
            if (matrix[row][col] == 0) {
                matrix[row][0] = 0
            }
        }
    }

    for (col in 1 .. firstRow.lastIndex) {
        if (firstRow[col] == 0) {
            for (row in 0..matrix.lastIndex) {
                matrix[row][col] = 0
            }
        }
    }

    for (row in 1..matrix.lastIndex) {
        if (matrix[row][0] == 0) {
            for (col in 0..firstRow.lastIndex) {
                matrix[row][col] = 0
            }
        }
    }

    if (isZeroFirstRow) {
        for (col in 0..firstRow.lastIndex) {
            matrix[0][col] = 0
        }
    }

    if (isZeroFirstCol) {
        for (row in 0..matrix.lastIndex) {
            matrix[row][0] = 0
        }
    }
}