package algorithms.leetcode.medium

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class SpiralMatrixKtTest(
    private val arr: Array<IntArray>,
    private val expectedResult: List<Int>
) {

    @Test
    fun `given array when call spiral then spiral path returned`(){
        val actualResult = spiralOrder(arr)

        assertEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(
            name = "given array {0} when call spiral then spiral path returned {1}"
        )
        fun data() = listOf(
            arrayOf(
                arrayOf(intArrayOf(1,2,3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9)),
                listOf(1,2,3,6,9,8,7,4,5)
            )
        )
    }
}