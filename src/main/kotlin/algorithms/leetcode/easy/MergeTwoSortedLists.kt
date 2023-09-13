package algorithms.leetcode.easy

import algorithms.utils.ListNode

/** Description: https://leetcode.com/problems/merge-two-sorted-lists/ **/

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    if (list1 == null) return list2
    if (list2 == null) return list1

    var head: ListNode? = null
    var nextItem: ListNode? = null

    var item1 = list1
    var item2 = list2

    while (item1 != null && item2 != null) {
        val tempItem = if (item1.`val` < item2.`val`) {
            val temp = item1
            item1 = item1.next
            temp
        } else {
            val temp = item2
            item2 = item2.next
            temp
        }

        nextItem = if (nextItem == null) {
            tempItem
        } else {
            nextItem.apply { next = tempItem }.next
        }

        if (head == null) head = nextItem
    }

    nextItem?.next = item1 ?: item2

    return head
}