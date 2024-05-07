package algorithms.leetcode.easy

/**
 * Description: https://leetcode.com/problems/reverse-only-letters
 */

fun reverseOnlyLetters(s: String): String {
    if (s.length < 2) return s

    val chars = s.toCharArray()
    var left = 0
    var right = s.lastIndex

    while (left < right) {
        if (!chars[left].isLetter()) {
            left++
        }

        if (!chars[right].isLetter()) {
            right--
        }

        val temp = chars[left]
        chars[left] = chars[right]
        chars[right] = temp

        left++
        right--
    }

    return String(chars)
}