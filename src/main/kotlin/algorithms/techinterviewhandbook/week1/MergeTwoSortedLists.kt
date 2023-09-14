package algorithms.techinterviewhandbook.week1

import algorithms.utils.ListNode

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    if (list1 == null) return list2
    if (list2 == null) return list1

    var itemList1: ListNode? = list1
    var itemList2: ListNode? = list2

    var head: ListNode? = null
    var nextItem: ListNode? = null

    while (itemList1 != null && itemList2 != null) {
        val item = if (itemList1.`val` <= itemList2.`val`) {
            val tempItem = itemList1
            itemList1 = itemList1.next
            tempItem
        } else {
            val tempItem = itemList2
            itemList2 = itemList2.next
            tempItem
        }

        nextItem = if (nextItem == null) {
            item
        } else {
            nextItem.next = item
            item
        }

        if (head == null) head = item
    }

    nextItem?.next = itemList1 ?: itemList2

    return head
}