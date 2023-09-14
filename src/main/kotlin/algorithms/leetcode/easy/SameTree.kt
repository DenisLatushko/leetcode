package algorithms.leetcode.easy

import algorithms.utils.TreeNode

/**
 * Description: https://leetcode.com/problems/same-tree/
 */

fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean =
    when {
        p == null && q == null -> true
        p == null || q == null -> false
        p.`val` == q.`val` -> isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
        else -> false
    }