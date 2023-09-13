package algorithms.leetcode.medium

import algorithms.utils.TreeNode

/**
 * Description: https://leetcode.com/problems/binary-tree-level-order-traversal/
 */

fun levelOrder(root: TreeNode?): List<List<Int>> {
    val result = mutableListOf<MutableList<Int>>()

    if (root != null) {
        result.add(mutableListOf(root.`val`))
        goToLevels(root, result, 1)
    }

    return result
}

private fun goToLevels(node: TreeNode?, list: MutableList<MutableList<Int>>, level: Int){
    if (node != null) {
        val innerList = if (level > list.lastIndex) mutableListOf() else list[level]

        if (node.left != null) {
            innerList.add(node.left!!.`val`)
        }

        if (node.right != null) {
            innerList.add(node.right!!.`val`)
        }

        if (innerList.isNotEmpty()) {
            if (level > list.lastIndex) {
                list.add(innerList)
            }

            goToLevels(node.left, list, level + 1)
            goToLevels(node.right, list, level + 1)
        }
    }
}