package algorithms.medium

import kotlin.math.max
import kotlin.math.min

/**
 * Description: https://leetcode.com/problems/container-with-most-water/
 */

fun maxArea(height: IntArray): Int {
    var indLeft = 0
    var indRight = height.lastIndex

    var result = 0
    while (indLeft < indRight) {
        val heightLeft = height[indLeft]
        val heightRight = height[indRight]

        result = max(result, min(heightLeft, heightRight) * (indRight - indLeft))

        if (heightLeft <= heightRight) {
            indLeft++
        } else {
            indRight--
        }
    }

    return result
}