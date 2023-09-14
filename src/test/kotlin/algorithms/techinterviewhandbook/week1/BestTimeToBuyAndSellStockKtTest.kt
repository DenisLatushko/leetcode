package algorithms.techinterviewhandbook.week1

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class BestTimeToBuyAndSellStockKtTest(
    private val prices: IntArray,
    private val expectedResult: Int
) {

    @Test
    fun `given stocks when get max profit then calculate the best days to sell and buy stocks`() {
        val actualResult = maxProfit(prices)

        assertEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameters(name = "")
        fun data() = listOf(
            arrayOf(intArrayOf(7,1,5,3,6,4), 5),
            arrayOf(intArrayOf(7,6,4,3,1), 0),
            arrayOf(intArrayOf(3,2,6,5,0,3), 4),
            arrayOf(intArrayOf(3,3,5,0,0,3,1,4), 4),
        )
    }
}