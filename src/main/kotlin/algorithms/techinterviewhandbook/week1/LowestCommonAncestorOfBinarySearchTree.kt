package algorithms.techinterviewhandbook.week1

import algorithms.utils.TreeNode

/**
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 */
fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
    if (root == null || p == null || q == null) return null

    val parentValue = root.`val`
    val pValue = p.`val`
    val qValue = q.`val`

    return if (pValue > parentValue && qValue > parentValue) {
        lowestCommonAncestor(root.right, p, q)
    } else if (pValue < parentValue && qValue < parentValue) {
        lowestCommonAncestor(root.left, p, q)
    } else {
        root
    }
}