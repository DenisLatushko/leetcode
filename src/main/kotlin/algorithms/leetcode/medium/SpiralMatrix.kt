package algorithms.leetcode.medium

private const val RIGHT = 1
private const val LEFT = 2
private const val BOTTOM = 3
private const val TOP = 4

fun spiralOrder(matrix: Array<IntArray>): List<Int> {
    var direction = RIGHT

    var leftBorder = 0
    var rightBorder = matrix.first().lastIndex
    var topBorder = 0
    var bottomBorder = matrix.lastIndex

    val size = matrix.size * matrix.first().size
    val result = mutableListOf<Int>()

    while (result.size < size) {
        if (direction == RIGHT) {
            for (i in leftBorder..rightBorder) {
                result.add(matrix[topBorder][i])
            }
            direction = BOTTOM
            topBorder++
        } else if (direction == BOTTOM) {
            for (i in topBorder..bottomBorder) {
                result.add(matrix[i][rightBorder])
            }
            direction = LEFT
            rightBorder--
        } else if (direction == LEFT) {
            for (i in rightBorder downTo leftBorder) {
                result.add(matrix[bottomBorder][i])
            }
            direction = TOP
            bottomBorder--
        } else {
            for (i in bottomBorder downTo topBorder) {
                result.add(matrix[i][leftBorder])
            }
            direction = RIGHT
            leftBorder++
        }
    }

    return result
}