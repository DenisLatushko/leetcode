package algorithms.leetcode.easy

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class MinimumCommonValueKtTest(
    private val arr1: IntArray,
    private val arr2: IntArray,
    private val expectedResult: Int
) {

    @Test
    fun `given 2 arrays when get common then return the minimum common value`() {
        val actualResult = getCommon(arr1, arr2)

        assertEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(
            name = "Given array1 {0} and array2 {1} when get common then result {2}"
        )
        fun data() = listOf(
            arrayOf(intArrayOf(1,2,3), intArrayOf(2,4), 2),
            arrayOf(intArrayOf(1,2,3), intArrayOf(4, 5, 6), -1),
            arrayOf(intArrayOf(1,2,3,6), intArrayOf(2,3,4,5), 2),
            arrayOf(intArrayOf(1), intArrayOf(1), 1),
            arrayOf(intArrayOf(1), intArrayOf(2), -1)
        )
    }
}