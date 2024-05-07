package algorithms.leetcode.medium

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class MaxConsecutiveOnesIIIKtTest(
    private val arr: IntArray,
    private val k: Int,
    private val expectedResult: Int
) {

    @Test
    fun `given array and number when find logiest sub array then return its length`() {
        val actualResult = longestOnes3(arr, k)

        assertEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "given array {0} and number {1} when find logiest sub array then {2}")
        fun data() = listOf(
//            arrayOf(intArrayOf(1,1,1,0,0,0,1,1,1,1,0), 2, 6),
            arrayOf(intArrayOf(0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1), 3, 10),
//            arrayOf(intArrayOf(0, 0, 0, 1, 1), 1, 3),
//            arrayOf(intArrayOf(0, 0, 0), 0, 0),
//            arrayOf(intArrayOf(0), 1, 1),
//            arrayOf(intArrayOf(0), 0, 0),
        )
    }
}