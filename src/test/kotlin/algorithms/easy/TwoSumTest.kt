package algorithms.easy

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class TwoSumTest(
    private val givenNums: List<Int>,
    private val givenTarget: Int,
    private val expectedPositions: List<Int>
) {

    @Test
    fun `given numbers when call sum then the expected positions returned`() {
        val actualResult = twoSum(givenNums.toIntArray(), givenTarget)

        assertEquals(expectedPositions, actualResult.toList())
    }

    companion object {
        private val array = listOf(2, 7, 11, 15)

        @JvmStatic
        @Parameterized.Parameters(
            name = "Given array of {0} with target number {1} when call twoSum function then positions are {2}"
        )
        fun data() = listOf(
            arrayOf(array, 9, listOf(0, 1)),
            arrayOf(array, 13, listOf(0, 2)),
            arrayOf(array, 22, listOf(1, 3)),
            arrayOf(array, 18, listOf(1, 2)),
            arrayOf(array, 17, listOf(0, 3)),
        )
    }
}