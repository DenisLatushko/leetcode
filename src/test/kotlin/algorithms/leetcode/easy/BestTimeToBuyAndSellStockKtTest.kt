package algorithms.leetcode.easy

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class BestTimeToBuyAndSellStockKtTest(
    private val prices: IntArray,
    private val expectedResult: Int
) {

    @Test
    fun `given array of stocks when call max profit then find best profitable day`() {
        val actualResult = maxProfit(prices)

        assertEquals(expectedResult, actualResult)
    }

    companion object {

        @JvmStatic
        @Parameterized.Parameters(name = "Given array of stocks {0} when call max profit then result is {1}")
        fun data() = listOf(
            arrayOf(intArrayOf(7,1,5,3,6,4), 5),
            arrayOf(intArrayOf(7,6,4,3,1), 0),
            arrayOf(intArrayOf(1), 0),
            arrayOf(intArrayOf(0), 0)
        )
    }

}