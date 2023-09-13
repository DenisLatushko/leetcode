package algorithms.leetcode.easy

import algorithms.utils.ListNode

/**
 * Description: https://leetcode.com/problems/linked-list-cycle
 */
fun hasCycle(head: ListNode?): Boolean {
    val nodeSet = mutableSetOf<ListNode>()

    var node = head
    while (node != null) {
        if (!nodeSet.add(node)) return true
        node = node.next
    }

    return false
}