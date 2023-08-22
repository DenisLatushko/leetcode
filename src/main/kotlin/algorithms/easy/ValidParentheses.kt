package algorithms.easy

import java.util.*

private val BRACKETS = mapOf(')' to '(', '}' to '{', ']' to '[')

/** Description: https://leetcode.com/problems/valid-parentheses/ **/

fun isValid(s: String): Boolean {
    val itemList = Stack<Char>()
    for (i in 0..s.lastIndex) {
        if (BRACKETS.containsKey(s[i])) {
            if (itemList.isEmpty() || itemList.pop() != BRACKETS[s[i]]) {
                return false
            }
        } else {
            itemList.push(s[i])
        }
    }
    return itemList.isEmpty()
}