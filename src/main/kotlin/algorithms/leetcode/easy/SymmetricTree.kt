package algorithms.leetcode.easy

import algorithms.leetcode.utils.TreeNode

/**
 * Description: https://leetcode.com/problems/symmetric-tree/
 */

fun isSymmetric(root: TreeNode?): Boolean =
    if (root?.left == null && root?.right == null) {
        false
    } else {
        isEqualSubtree(root.left, root.right)
    }

private fun isEqualSubtree(rootLeft: TreeNode?, rootRight: TreeNode?): Boolean =
    if (rootLeft == null && rootRight == null) {
        true
    } else if (rootLeft == null || rootRight == null) {
        false
    } else {
        rootLeft.`val` == rootRight.`val` &&
                isEqualSubtree(rootLeft.right, rootRight.left) &&
                isEqualSubtree(rootLeft.left, rootRight.right)
    }