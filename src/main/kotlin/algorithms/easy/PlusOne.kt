package algorithms.easy

/** Description: https://leetcode.com/problems/plus-one/ **/

fun plusOne(digits: IntArray): IntArray {
    if (digits.isEmpty()) return digits

    for (i in digits.lastIndex downTo 0) {
        if (digits[i] == 9) {
            digits[i] = 0
        } else {
            digits[i]++
            return digits
        }
    }

    return IntArray(digits.size + 1)
        .apply { set(0, 1) }
}