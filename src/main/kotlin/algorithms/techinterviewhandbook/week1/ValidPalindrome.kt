package algorithms.techinterviewhandbook.week1

/**
 * https://leetcode.com/problems/valid-palindrome
 */

fun isPalindrome(s: String): Boolean {
    var leftSide = 0
    var rightSide = s.lastIndex

    while (leftSide <= rightSide) {
        if (!s[leftSide].isLetterOrDigit()) {
            leftSide++
        } else if (!s[rightSide].isLetterOrDigit()) {
            rightSide--
        } else if (s[leftSide].equals(s[rightSide], true)) {
            leftSide++
            rightSide--
        } else {
            return false
        }
    }

    return true
}