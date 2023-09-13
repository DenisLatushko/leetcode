package algorithms.leetcode.medium

fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    if (matrix.isNotEmpty()) {
        val rowSize = matrix.first().size
        var left = 0
        var right = matrix.size * matrix.first().size - 1
        while (left <= right) {
            val center = left + (right - left) / 2
            val item = matrix[center / rowSize][center % rowSize]
            when {
                item == target -> return true
                item > target -> right = center - 1
                else -> left = center + 1
            }
        }
    }

    return false
}