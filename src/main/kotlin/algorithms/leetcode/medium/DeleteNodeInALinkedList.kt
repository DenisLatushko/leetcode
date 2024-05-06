package algorithms.leetcode.medium

import algorithms.utils.ListNode

fun deleteNode(node: ListNode?) {
    if (node == null) return

    node.`val` = node.next!!.`val`

    node.next = node.next?.next
}
