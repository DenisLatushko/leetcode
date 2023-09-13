package algorithms.leetcode.easy

import java.lang.Integer.max
import java.lang.Integer.min

/** https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/ */

fun average(salary: IntArray): Double {
    var minValue = Int.MAX_VALUE
    var maxValue = Int.MIN_VALUE
    var sum = 0

    salary.forEach {
        sum += it
        minValue = min(minValue, it)
        maxValue = max(maxValue, it)
    }

    return (sum - minValue - maxValue ).toDouble() / (salary.size - 2)
}