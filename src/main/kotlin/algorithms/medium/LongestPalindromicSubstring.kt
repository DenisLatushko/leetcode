package algorithms.medium

/**
 * Description: https://leetcode.com/problems/longest-palindromic-substring
 */
fun longestPalindrome(s: String): String {
    if (s.length < 2) return s

    var result = ""
    for (i in 0 until s.lastIndex) {
        var midResult = ""
        for (j in i .. s.lastIndex) {
            midResult += s[j]
            if (isPalindrome(midResult) && midResult.length > result.length) {
                result = midResult
            }
        }
    }

    return result
}

private fun isPalindrome(str: String): Boolean {
    var left = 0
    var right = str.lastIndex

    while (left <= right) {
        if (str[left] != str[right]) {
            return false
        }
        left++
        right--
    }

    return true
}