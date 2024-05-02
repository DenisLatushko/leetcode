package algorithms.leetcode.easy

import algorithms.utils.TreeNode
import java.util.LinkedList
import java.util.Queue

fun averageOfLevels(root: TreeNode?): DoubleArray {
    var queue: Queue<TreeNode?> = LinkedList<TreeNode?>().apply { add(root) }
    val result = mutableListOf<Double>()

    while (queue.isNotEmpty()) {
        var sum = .0
        var oneLevelItemsCount = 0

        val tempQueue: Queue<TreeNode?> = LinkedList()
        while (queue.isNotEmpty()) {
            queue.poll()?.run {
                sum += `val`.toDouble()
                oneLevelItemsCount++
                if (left != null) tempQueue.add(left)
                if (right != null) tempQueue.add(right)
            }
        }

        queue = tempQueue
        result.add(sum.toDouble() / oneLevelItemsCount)
    }

    return result.toDoubleArray()
}