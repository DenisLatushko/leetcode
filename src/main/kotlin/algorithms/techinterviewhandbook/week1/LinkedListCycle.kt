package algorithms.techinterviewhandbook.week1

import algorithms.utils.ListNode

fun hasCycle(head: ListNode?): Boolean {
    val nodeSet = mutableSetOf<ListNode>()
    var itemNode = head
    while (itemNode != null) {
        if (!nodeSet.add(itemNode)) {
            return true
        }
        itemNode = itemNode.next
    }

    return false
}