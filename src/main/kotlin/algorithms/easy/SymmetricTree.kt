package algorithms.easy

import algorithms.utils.TreeNode

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