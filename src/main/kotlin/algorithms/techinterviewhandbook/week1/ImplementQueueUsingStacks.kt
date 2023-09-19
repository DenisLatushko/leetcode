package algorithms.techinterviewhandbook.week1

import java.util.Stack

/**
 * https://leetcode.com/problems/implement-queue-using-stacks/
 */
class MyQueue {

    private val mainStack = Stack<Int>()
    private val secondaryStack = Stack<Int>()

    fun push(x: Int) {
        moveItems(mainStack, secondaryStack)

        mainStack.push(x)

        moveItems(secondaryStack, mainStack)
    }

    private fun moveItems(stack1: Stack<Int>, stack2: Stack<Int>) {
        while (stack1.isNotEmpty()) {
            stack2.push(stack1.pop())
        }
    }

    fun empty(): Boolean = mainStack.isEmpty()

    fun pop(): Int = mainStack.pop()

    fun peek(): Int = mainStack.peek()
}