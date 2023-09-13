package algorithms.leetcode.medium

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class Search2DMatrixKtTest(
    private val matrix: Array<IntArray>,
    private val target: Int,
    private val expectedResult: Boolean
) {

    @Test
    fun `given 2D matrix and target when call function then find target in matrix`() {
        val actualResult = searchMatrix(matrix, target)

        assertEquals(expectedResult, actualResult)
    }

    companion object {

        private val m1 = arrayOf(
            intArrayOf(1,3,5,7),
            intArrayOf(10,11,16,20),
            intArrayOf(23,30,34,60)
        )

        private val m2 = arrayOf(
            intArrayOf(1,3,5,7)
        )

        private val m3 = arrayOf(
            intArrayOf(1),
            intArrayOf(3),
            intArrayOf(5),
            intArrayOf(7),
        )

        @JvmStatic
        @Parameters(name = "given 2D matrix {0} and target {1} when call function then result is {2}")
        fun data() = listOf(
            arrayOf(m1, 3, true),
            arrayOf(m1, 4, false),
            arrayOf(m1, 100, false),
            arrayOf(m2, 3, true),
            arrayOf(m2, 100, false),
            arrayOf(m3, 3, true),
            arrayOf(m3, 100, false),
        )
    }
}