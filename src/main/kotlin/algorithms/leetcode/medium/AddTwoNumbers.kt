package algorithms.leetcode.medium

import algorithms.leetcode.utils.ListNode

/** Description: https://leetcode.com/problems/add-two-numbers/ **/

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode {
    return when {
        l1 == null && l2 != null -> l2
        l1 != null && l2 == null -> l1
        l1 == null && l2 == null -> ListNode(0)
        else -> add(l1 as ListNode, l2 as ListNode)
    }
}

private fun add(l1: ListNode, l2: ListNode): ListNode {

    var item1: ListNode? = l1
    var item2: ListNode? = l2

    var setToHead = true
    var rank = 0
    val resultNodeHead = ListNode(0)
    var resultNode = resultNodeHead

    while (item1 != null || item2 != null || rank != 0) {
        val addResult = (item1?.`val` ?: 0) + (item2?.`val` ?: 0) + rank
        val nodeValue = addResult % 10

        if (setToHead) {
            resultNode.`val` = nodeValue
            setToHead = false
        } else {
            val newListNode = ListNode(nodeValue)
            resultNode.next = newListNode
            resultNode = newListNode
        }

        rank = addResult / 10
        item1 = item1?.next
        item2 = item2?.next
    }

    return resultNodeHead
}