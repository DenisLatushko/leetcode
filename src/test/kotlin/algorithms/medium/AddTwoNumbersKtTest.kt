package algorithms.medium

import algorithms.utils.ListNode
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals

/**
 * Convert the [Int] number to a linked list of [ListNode] items.
 * The number is always non-negative (0 <= Node.val <= 9).
 */
private fun Int.toInvertedList(): ListNode {
    val invertedNumberStr = this.toString().reversed()
    val listHead = ListNode(invertedNumberStr[0].digitToInt())
    var listNode = listHead

    invertedNumberStr.forEachIndexed { ind, item ->
        if (ind > 0) {
            val newListNode = ListNode(item.digitToInt())
            listNode.next = newListNode
            listNode = newListNode
        }
    }

    return listHead
}

@RunWith(Parameterized::class)
class AddTwoNumbersKtTest(
    private val numberX: ListNode?,
    private val numberY: ListNode?,
    private val expectedResult: ListNode
) {

    @Test
    fun `given 2 numbers when add then to each other then result is a sum of two of them`() {
        val actualResult = addTwoNumbers(numberX, numberY)

        assertEquals(expectedResult, actualResult)
    }

    companion object {

        private val num1 = 111.toInvertedList()
        private val num2 = 222.toInvertedList()
        private val num3 = 0.toInvertedList()
        private val num4 = 1111.toInvertedList()
        private val num5 = 999.toInvertedList()
        private val num6 = 9999.toInvertedList()

        @JvmStatic
        @Parameterized.Parameters(
            name = "Given numbers {0} and {1} when add then result is {2}"
        )
        fun data() = listOf(
            arrayOf(num1, num2, 333.toInvertedList()),
            arrayOf(num3, num3, num3),
            arrayOf(num1, num3, num1),
            arrayOf(num3, num1, num1),
            arrayOf(num1, num4, 1222.toInvertedList()),
            arrayOf(num4, num1, 1222.toInvertedList()),
            arrayOf(null, null, 0.toInvertedList()),
            arrayOf(null, num1, num1),
            arrayOf(num1, null, num1),
            arrayOf(num5, num5, 1998.toInvertedList()),
            arrayOf(num5, num6, 10998.toInvertedList())
        )
    }
}