package algorithms.leetcode.easy

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.Assert.assertArrayEquals

@RunWith(Parameterized::class)
class SquaresOfASortedArrayKtTest(
    private val arr: IntArray,
    private val expectedResult: IntArray
) {

    @Test
    fun `given array when call sorted squares then all items sorted after pow2`() {
        val actualResult = sortedSquares(arr)

        assertArrayEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "given array {0} when call sorted squares then result is {1}")
        fun data() = listOf(
            arrayOf(intArrayOf(-4,-1,0,3,10), intArrayOf(0,1,9,16,100)),
            arrayOf(intArrayOf(-7,-3,2,3,11), intArrayOf(4,9,9,49,121)),
            arrayOf(intArrayOf(1), intArrayOf(1)),
            arrayOf(intArrayOf(-1), intArrayOf(1)),
        )
    }
}