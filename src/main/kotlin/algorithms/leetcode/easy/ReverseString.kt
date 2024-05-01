package algorithms.leetcode.easy

fun reverseString(s: CharArray) {
    if (s.size <= 1) return

    var left = 0
    var right = s.lastIndex

    while (left < right) {
        val temp = s[left]
        s[left] = s[right]
        s[right] = temp
        left++
        right--
    }
}