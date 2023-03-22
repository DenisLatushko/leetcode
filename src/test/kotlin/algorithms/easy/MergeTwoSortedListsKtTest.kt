package algorithms.easy

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class MergeTwoSortedListsKtTest(
    private val list1: ListNode?,
    private val list2: ListNode?,
    private val expectedList: ListNode?,
) {

    @Test
    fun `given lists when call merge then then merged`() {
        assertEquals(expectedList, mergeTwoLists(list1, list2))
    }


    companion object {

        private val list1 = listOf(-1, 0, 2, 5, 7,9)
        private val list2 = listOf(0, 1, 2, 3, 7, 10)
        private val list3 = (list1 + list2).sorted()

        private fun getNodeList(list: List<Int>?): ListNode? {
            if (list == null || list.isEmpty()) return null

            var head: ListNode? = null
            var nextItem: ListNode? = null

            list.forEach { item ->
                if (nextItem == null) {
                    nextItem = ListNode(item)
                } else {
                    nextItem?.next = ListNode(item)
                    nextItem = nextItem?.next
                }

                if (head == null) head = nextItem
            }

            return head
        }

        @JvmStatic
        @Parameterized.Parameters(
            name = "Given nodes {0} and {1} when call function then result list is {2}"
        )
        fun data() = listOf(
            arrayOf(getNodeList(list1), getNodeList(list2), getNodeList(list3)),
            arrayOf(null, getNodeList(list2), getNodeList(list2)),
            arrayOf(getNodeList(list1), null, getNodeList(list1)),
            arrayOf(getNodeList(emptyList()), getNodeList(emptyList()), null)
        )
    }
}