package algorithms.leetcode.medium

import kotlin.math.max

/**
 * Description: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 */

fun lengthOfLongestSubstring(s: String): Int {
    if (s.isEmpty()) return 0

    val set = mutableSetOf<Char>()

    var left  = 0
    var right = 1
    var result = 0

    set.add(s[left])
    while (right < s.length) {
        if (set.add(s[right])) {
            result = max(result, right - left)
            right++
        } else {
            while (!set.add(s[right])) {
                set.remove(s[left])
                left++
            }
            result = max(result, right - left)
            right++
        }
    }

    return result + 1
}