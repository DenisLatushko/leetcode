package algorithms.easy

import java.util.*

private val CLOSING_BRACKETS = arrayOf(')', '}', ']')
private val OPEN_BRACKETS = arrayOf('(', '{', '[')

/** Description: https://leetcode.com/problems/valid-parentheses/ **/

fun isValid(s: String): Boolean {
    val itemList = Stack<Char>()

    for (i in 0..s.lastIndex) {
        val closingBracketIndex = CLOSING_BRACKETS.indexOf(s[i])
        if (closingBracketIndex >= 0) {
            if (itemList.isNotEmpty() && itemList.peek() == OPEN_BRACKETS[closingBracketIndex]) {
                itemList.pop()
            } else {
                return false
            }
        } else {
            itemList.add(s[i])
        }
    }

    return itemList.isEmpty()
}