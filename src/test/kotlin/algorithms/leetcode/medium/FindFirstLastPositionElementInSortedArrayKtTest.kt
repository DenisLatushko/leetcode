package algorithms.leetcode.medium

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class FindFirstLastPositionElementInSortedArrayKtTest(
    private val arr: IntArray,
    private val target: Int,
    private val expectedResult: IntArray
) {

    @Test
    fun `given array when call search range then result`() {
        val actualResult = searchRange(arr, target)

        assertArrayEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "given array {0} when call search range then result {2}")
        fun data() = listOf(
            arrayOf(intArrayOf(5,7,7,8,8,10), 8, intArrayOf(3, 4)),
            arrayOf(intArrayOf(5,7,7,8,8,10), 6, intArrayOf(-1, -1)),
            arrayOf(intArrayOf(1), 1, intArrayOf(0, 0)),
            arrayOf(intArrayOf(2, 2), 3, intArrayOf(-1, -1)),
            arrayOf(intArrayOf(), 0, intArrayOf(-1, -1)),
        )
    }
}