package algorithms.leetcode.utils

/**
 * Convert the [Int] number to a linked list of [ListNode] items.
 * The number is always non-negative (0 <= Node.val <= 9).
 */
internal fun Int.toInvertedList(): ListNode = separateStringToListNodes(this.toString().reversed())

internal fun Int.toListNodes(): ListNode = separateStringToListNodes(this.toString())

private fun separateStringToListNodes(str: String): ListNode {
    val listHead = ListNode(str[0].digitToInt())
    var listNode = listHead

    str.forEachIndexed { ind, item ->
        if (ind > 0) {
            val newListNode = ListNode(item.digitToInt())
            listNode.next = newListNode
            listNode = newListNode
        }
    }

    return listHead
}