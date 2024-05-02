package algorithms.leetcode.medium

import algorithms.utils.TreeNode
import java.util.LinkedList
import java.util.Queue

fun rightSideView(root: TreeNode?): List<Int> {
    if (root == null) return emptyList()

    var queue: Queue<TreeNode>
    var nextQueue: Queue<TreeNode> = LinkedList<TreeNode>().apply { add(root) }
    val resultList = mutableListOf<Int>()

    var node: TreeNode? = null
    while (nextQueue.isNotEmpty()) {
        queue = nextQueue

        nextQueue = LinkedList()
        while (queue.isNotEmpty()) {
            with(queue.poll()) {
                node = this
                if (left != null) nextQueue.add(left)
                if (right != null) nextQueue.add(right)
            }
        }

        if (queue.isEmpty()) node?.run { resultList.add(this.`val`) }
    }

    return resultList
}