package algorithms.medium

import algorithms.utils.TreeNode

/**
 * Description: https://leetcode.com/problems/sum-root-to-leaf-numbers/
 */

fun sumNumbers(root: TreeNode?): Int {
    return sumTreeNodes(root, 0, 0)
}

private fun sumTreeNodes(
    node: TreeNode?,
    currentNumber: Int,
    sumResult: Int
): Int {
    if (node == null) return 0

    val number = currentNumber * 10 + node.`val`

    return if (node.left == null && node.right == null) {
        sumResult + number
    } else {
        val leftSum = sumTreeNodes(node.left, number, sumResult)
        val rightSum = sumTreeNodes(node.right, number, sumResult)
        leftSum + rightSum
    }
}