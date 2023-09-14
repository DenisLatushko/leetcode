package algorithms.leetcode.medium

import algorithms.utils.ListNode
import algorithms.leetcode.utils.toInvertedList
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import kotlin.test.assertEquals

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
        @Parameters(name = "Given numbers {0} and {1} when add then result is {2}")
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