package algorithms.easy

import algorithms.utils.TreeNode

/**
 * Description: https://leetcode.com/problems/invert-binary-tree
 */

fun invertTree(root: TreeNode?): TreeNode? {
    if (root != null) {
        val temp = root.left
        root.left = invertTree(root.right)
        root.right = invertTree(temp)
    }
    return root
}