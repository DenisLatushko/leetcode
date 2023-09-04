package algorithms.medium

/**
 * Description: https://leetcode.com/problems/string-to-integer-atoi
 */
fun myAtoi(s: String): Int {
    val maxDividedByTen = Int.MAX_VALUE / 10
    val maxTailByTen = Int.MAX_VALUE % 10
    var result = 0
    var sign = 1

    var numberInd = 0
    while (numberInd < s.length && s[numberInd] == ' ') {
        numberInd++
    }

    if (numberInd < s.length) {
        if (s[numberInd] == '-') sign = -1

        val start = if (s[numberInd] == '-' || s[numberInd] == '+') numberInd + 1 else numberInd

        (start..s.lastIndex).forEach {
            val char = s[it]
            if (char.isDigit()) {
                val number = char.digitToInt()
                if ((result > maxDividedByTen) || (result == maxDividedByTen && number > maxTailByTen)) {
                    return if (sign == 1) Int.MAX_VALUE else Int.MIN_VALUE
                } else {
                    result = (result * 10) + number
                }
            } else {
                return result * sign
            }
        }
    }

    return result * sign
}