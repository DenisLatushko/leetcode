package algorithms.techinterviewhandbook.week1

import algorithms.utils.TreeNode
import kotlin.math.abs
import kotlin.math.max

fun isBalanced(root: TreeNode?): Boolean =
    if (root != null) {
        abs(getNodeHeight(root.left) - getNodeHeight(root.right)) <= 1 &&
                isBalanced(root.left) && isBalanced(root.right)
    } else {
        true
    }

private fun getNodeHeight(node: TreeNode?): Int =
    if (node == null) {
        -1
    } else {
        1 + max(getNodeHeight(node.left), getNodeHeight(node.right))
    }