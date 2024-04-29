package algorithms.leetcode.hard

import kotlin.test.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class MedianOfTwoSortedArraysKtTest(
    private val arr1: IntArray,
    private val arr2: IntArray,
    private val expectedResult: Double
) {

    @Test
    fun `given array1 {0} and array2 {1} when calculate median then return it`() {
        val actualResult = findMedianSortedArrays(arr1, arr2)

        assertEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "given array1 {0} and array2 {1} when cll median then result is {2}")
        fun data() = listOf(
            arrayOf(intArrayOf(1, 3), intArrayOf(2), 2.0),
            arrayOf(intArrayOf(1, 2), intArrayOf(3, 4), 2.50),
            arrayOf(intArrayOf(), intArrayOf(1, 3, 4), 3.0),
            arrayOf(intArrayOf(1, 2), intArrayOf(), 1.50),
        )
    }
}