package algorithms.leetcode.easy

import algorithms.utils.TreeNode
import kotlin.math.min

/**
 * Desription: https://leetcode.com/problems/minimum-depth-of-binary-tree/
 */
fun minDepth(root: TreeNode?): Int {
    return dfs(root)
}

private fun dfs(node: TreeNode?): Int {
    if (node == null) return 0

    if (node.left == null) {
        return dfs(node.right) + 1
    } else if(node.right == null) {
        return dfs(node.left) + 1
    }

    val left = dfs(node.left) + 1
    val right = dfs(node.right) + 1
    return min(left, right)
}
