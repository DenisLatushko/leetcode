package algorithms.techinterviewhandbook.week1

import java.util.Stack

/**
 * https://leetcode.com/problems/valid-parentheses/
 */

fun isValid(s: String): Boolean {
    val bracketsMap = mapOf(
        ')' to '(',
        ']' to '[',
        '}' to '{',
    )

    val bracketsStack = Stack<Char>()
    s.forEach { char ->
        if (bracketsMap.values.contains(char)) {
            bracketsStack.add(char)
        } else {
            val correctOpenBracket = bracketsMap[char]
            if (bracketsStack.isNotEmpty() && correctOpenBracket == bracketsStack.peek()) {
                bracketsStack.pop()
            } else {
                return false
            }
        }
    }

    return bracketsStack.isEmpty()
}