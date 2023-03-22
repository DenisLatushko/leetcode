package algorithms.easy

/** Description: https://leetcode.com/problems/merge-two-sorted-lists/ **/

data class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    if (list1 == null) return list2
    if (list2 == null) return list1

    var head: ListNode? = null
    var nextItem: ListNode? = null

    var item1 = list1
    var item2 = list2

    while (item1 != null && item2 != null) {
        if (item1.`val` < item2.`val`) {
            if (nextItem == null) {
                nextItem = item1
            } else {
                nextItem.next = item1
                nextItem = nextItem.next
            }
            item1 = item1.next
        } else {
            if (nextItem == null) {
                nextItem = item2
            } else {
                nextItem.next = item2
                nextItem = nextItem.next
            }
            item2 = item2.next
        }
        if (head == null) head = nextItem
    }

    nextItem?.next = item1 ?: item2

    return head
}