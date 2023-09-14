package algorithms.techinterviewhandbook.week1

import algorithms.utils.TreeNode

/**
 * https://leetcode.com/problems/invert-binary-tree/
 */
fun invertTree(root: TreeNode?): TreeNode? {
    if (root != null) {
        val temp = invertTree(root.left)
        root.left = invertTree(root.right)
        root.right = temp
    }
    return root
}