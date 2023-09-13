package algorithms.leetcode.medium

/**
 * Description: https://leetcode.com/problems/print-immutable-linked-list-in-reverse
 *
 * There not Unit tests as [ImmutableListNode] is placed only as an interface.
 * It does not have implementation
 */
interface ImmutableListNode {
    fun getNext(): ImmutableListNode?
    fun printValue()
}
fun printLinkedListInReverse(head: ImmutableListNode?) {
    val list = mutableListOf<ImmutableListNode>()

    var node = head
    while (node != null) {
        list.add(node)
        node = node.getNext()
    }

    list.reversed().forEach {
        it.printValue()
    }
}