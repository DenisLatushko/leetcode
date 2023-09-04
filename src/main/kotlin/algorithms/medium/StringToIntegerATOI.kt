package algorithms.medium

/**
 * Description: https://leetcode.com/problems/string-to-integer-atoi
 */
fun myAtoi(s: String): Int {
    val maxDividedByTen = Int.MAX_VALUE / 10
    val maxTailByTen = Int.MAX_VALUE % 10
    var result = 0
    var sign = 1

    s.forEach { char ->
        if (char == '-' && result == 0) {
            sign = -1
        }

        if (char.isDigit()) {
            val number = char.digitToInt()
            if ((result > maxDividedByTen) || (result == maxDividedByTen && number > maxTailByTen)) {
                return if (sign == 1) Int.MAX_VALUE else Int.MIN_VALUE
            } else {
                result = (result * 10) + number
            }
        }
    }
    return result * sign
}