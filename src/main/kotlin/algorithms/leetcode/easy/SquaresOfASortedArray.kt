package algorithms.leetcode.easy

/**
 * Description: https://leetcode.com/problems/squares-of-a-sorted-array/description/
 */

fun sortedSquares(nums: IntArray): IntArray {
    if (nums.size == 1) return nums.apply { this[0] = pow(this[0]) }

    var left = 0
    var right = nums.lastIndex
    var ind = nums.lastIndex
    val result = IntArray(nums.size)

    while (left <= right) {
        val numLeftPow = pow(nums[left])
        val numRightPow = pow(nums[right])
        if (numLeftPow >= numRightPow) {
            result[ind] = numLeftPow
            left++
        } else {
            result[ind] = numRightPow
            right--
        }
        ind--
    }

    return result
}

private fun pow(value: Int): Int =
    if (Int.MAX_VALUE / 2 >= value) {
        value * value
    } else {
        Int.MAX_VALUE
    }