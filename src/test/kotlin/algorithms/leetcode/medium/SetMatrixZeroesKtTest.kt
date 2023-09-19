package algorithms.leetcode.medium

import algorithms.utils.assertArrayEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class SetMatrixZeroesKtTest(
    private val array: Array<IntArray>,
    private val expectedResult: Array<IntArray>
) {

    @Test
    fun `given array when call set zeros then columns and rows are zeroed`() {
        setZeroes(array)

        assertArrayEquals(expectedResult, array)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(
            name = "given array {0} when call set zeros then it updates as {1}"
        )
        fun data() = listOf(
            arrayOf(
                arrayOf(intArrayOf(1,1,1), intArrayOf(1,0,1), intArrayOf(1,1,1)),
                arrayOf(intArrayOf(1,0,1), intArrayOf(0,0,0), intArrayOf(1,0,1)),
            ),
            arrayOf(
                arrayOf(intArrayOf(0,1,2,0), intArrayOf(3,4,5,2), intArrayOf(1,3,1,5)),
                arrayOf(intArrayOf(0,0,0,0), intArrayOf(0,4,5,0), intArrayOf(0,3,1,0)),
            ),
            arrayOf(
                arrayOf(intArrayOf(0,0,0), intArrayOf(3,4,5), intArrayOf(1,3,1)),
                arrayOf(intArrayOf(0,0,0), intArrayOf(0,0,0), intArrayOf(0,0,0)),
            ),
            arrayOf(
                arrayOf(intArrayOf(0,1,1), intArrayOf(0,1,1), intArrayOf(0,1,1)),
                arrayOf(intArrayOf(0,0,0), intArrayOf(0,0,0), intArrayOf(0,0,0)),
            ),
            arrayOf(
                arrayOf(intArrayOf(0,1,1), intArrayOf(1,1,1), intArrayOf(1,1,1)),
                arrayOf(intArrayOf(0,0,0), intArrayOf(0,1,1), intArrayOf(0,1,1)),
            ),
            arrayOf(
                arrayOf(intArrayOf(0), intArrayOf(1), intArrayOf(1)),
                arrayOf(intArrayOf(0), intArrayOf(0), intArrayOf(0)),
            ),
            arrayOf(
                arrayOf(intArrayOf(1), intArrayOf(1), intArrayOf(1)),
                arrayOf(intArrayOf(1), intArrayOf(1), intArrayOf(1)),
            ),
            arrayOf(
                arrayOf(intArrayOf(1,0)),
                arrayOf(intArrayOf(0,0)),
            )
        )
    }
}