package algorithms.leetcode.medium

import java.util.Stack

/**
 * Description: https://leetcode.com/problems/evaluate-reverse-polish-notation/
 */

fun evalRPN(tokens: Array<String>): Int {
    val numbersStack = Stack<Int>()

    for (item in tokens) {
        val potentialNumber = item.toIntOrNull()
        if (potentialNumber == null) {
            val num2 = numbersStack.pop()
            val num1 = numbersStack.pop()
            val mathResult = doMath(num1, num2, item)
            numbersStack.push(mathResult)
        } else {
            numbersStack.push(potentialNumber)
        }
    }

    return if (numbersStack.isEmpty()) 0 else numbersStack.peek()
}

private fun doMath(
    num1: Int,
    num2: Int,
    operation: String
): Int = when(operation) {
    "+" -> num1 + num2
    "-" -> num1 - num2
    "*" -> num1 * num2
    else -> num1 / num2
}