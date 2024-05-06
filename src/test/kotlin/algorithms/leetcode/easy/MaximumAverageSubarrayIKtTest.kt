package algorithms.leetcode.easy

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class MaximumAverageSubarrayIKtTest(
    private val arr:IntArray,
    private val k: Int,
    private val expectedResult: Double
) {

    @Test
    fun `given array when call find max average then return max average value in the array`() {
        val actualResult = findMaxAverage(arr, k)

        assertEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "given array {0} with K {1} when call find max average then result {2}")
        fun data() = listOf(
            arrayOf(intArrayOf(1,12,-5,-6,50,3), 4, 12.75),
            arrayOf(intArrayOf(0,4,0,3,2), 1, 4.0),
            arrayOf(intArrayOf(0,1,1,3,3), 4, 2.0),
            arrayOf(intArrayOf(5), 1, 5.0),
        )
    }
}