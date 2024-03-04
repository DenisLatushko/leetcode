package algorithms.leetcode.easy

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class PascalsTriangleKtTest(
    private val numRows: Int,
    private val expectedResult: List<List<Int>>
) {

    @Test
    fun `Given number of rows when call function then return pascal's triangle`() {
        assertEquals(expectedResult, generate(numRows))
    }
    companion object {
        @JvmStatic
        @Parameterized.Parameters(
            name = "Given number of rows {0} when call function then array is {1}"
        )
        fun data() = listOf(
            arrayOf(5, listOf(listOf(1),listOf(1,1),listOf(1,2,1),listOf(1,3,3,1), listOf(1,4,6,4,1))),
            arrayOf(1, listOf(listOf(1)))
        )
    }
}