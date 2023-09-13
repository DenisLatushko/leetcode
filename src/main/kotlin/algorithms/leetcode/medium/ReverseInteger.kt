package algorithms.leetcode.medium

import java.lang.Integer.MAX_VALUE
import java.lang.Integer.MIN_VALUE

/** Description: https://leetcode.com/problems/reverse-integer/editorial/ **/

fun reverse(x: Int): Int {
    val maxResult = MAX_VALUE / 10
    val minResult = MIN_VALUE / 10

    var number = if (x < 0) -x else x
    var result = 0

    while (number > 0) {
        val tail = number % 10
        number /= 10

        if (result > maxResult || (result == maxResult && tail > 7)) return 0
        if (result < minResult || (result == minResult && tail < -8)) return 0

        result = result * 10 + tail
    }

    return if (x < 0) -result else result
}