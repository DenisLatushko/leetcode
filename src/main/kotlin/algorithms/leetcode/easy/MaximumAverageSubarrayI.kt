package algorithms.leetcode.easy

import kotlin.math.max

fun findMaxAverage(nums: IntArray, k: Int): Double {
    var sum = nums.slice(0 until k).sum()
    var result = sum

    (k..nums.lastIndex).forEach { ind ->
        sum = sum - nums[ind - k] + nums[ind]
        result = max(result, sum)
    }

    return result.toDouble() / k
}