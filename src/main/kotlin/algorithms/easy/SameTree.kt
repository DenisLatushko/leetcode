package algorithms.easy

/**
 * Description: https://leetcode.com/problems/same-tree/
 */

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean =
    when {
        p == null && q == null -> true
        p == null || q == null -> false
        p.`val` == q.`val` -> isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
        else -> false
    }