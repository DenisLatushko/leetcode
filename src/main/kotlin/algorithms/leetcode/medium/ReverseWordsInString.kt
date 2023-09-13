package algorithms.leetcode.medium

/**
 * Description: https://leetcode.com/problems/reverse-words-in-a-string
 */
fun reverseWords(s: String): String {
   return s.trim()
       .split(" ")
       .reversed()
       .filter { it.isNotEmpty() }
       .joinToString(separator = " ")
}