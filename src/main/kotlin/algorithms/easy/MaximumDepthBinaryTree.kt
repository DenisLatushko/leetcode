package algorithms.easy

import algorithms.utils.TreeNode
import kotlin.math.max

fun maxDepth(root: TreeNode?): Int =
    if (root != null) {
        val leftH = maxDepth(root.left)
        val rightH = maxDepth(root.right)
        max(leftH, rightH) + 1
    } else {
        0
    }