package algorithms.leetcode.easy

import algorithms.utils.TreeNode
import kotlin.math.max

/**
 * Description: https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */

fun maxDepth(root: TreeNode?): Int =
    if (root != null) {
        val leftH = maxDepth(root.left)
        val rightH = maxDepth(root.right)
        max(leftH, rightH) + 1
    } else {
        0
    }