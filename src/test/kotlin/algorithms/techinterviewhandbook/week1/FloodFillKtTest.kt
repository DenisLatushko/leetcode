package algorithms.techinterviewhandbook.week1

import algorithms.leetcode.utils.assertArrayEquals
import junit.framework.TestCase
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class FloodFillKtTest(
    private val matrix: Array<IntArray>,
    private val sr: Int,
    private val sc: Int,
    private val color: Int,
    private val expectedResult: Array<IntArray>
) {

    @Test
    fun `given matrix sr, sc and color when call fill then update pixels`() {
        val actualResult = floodFill(matrix, sr, sc, color)

        assertArrayEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameters(name = "given matrix {0} sr={1}, sc={2} and color {3} when call fill then update pixels")
        fun data() = listOf(
            arrayOf(
                arrayOf(
                    intArrayOf(1, 1, 1), intArrayOf(1, 1, 0), intArrayOf(1, 0, 1)
                ),
                1,
                1,
                2,
                arrayOf(
                    intArrayOf(2, 2, 2), intArrayOf(2, 2, 0), intArrayOf(2, 0, 1)
                )
            ),
            arrayOf(
                arrayOf(
                    intArrayOf(0, 0, 0), intArrayOf(0, 0, 0), intArrayOf(0, 0, 0)
                ),
                0,
                0,
                0,
                arrayOf(
                    intArrayOf(0, 0, 0), intArrayOf(0, 0, 0), intArrayOf(0, 0, 0)
                )
            )
        )
    }
}