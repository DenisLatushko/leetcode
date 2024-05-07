package algorithms.leetcode.easy

private const val DIVIDER = ' '

fun reverseWords(s: String): String {
    if (s.length < 2) return s

    val chars = s.toCharArray()
    var left = 0

    for (right in 0..chars.lastIndex) {
        if (right == chars.lastIndex || chars[right + 1] == DIVIDER) {
            var rightTemp = right
            while (left <= rightTemp) {
                val temp = chars[left]
                chars[left] = chars[rightTemp]
                chars[rightTemp] = temp
                left++
                rightTemp--
            }
            left = right + 2
        }
    }

    return String(chars)
}