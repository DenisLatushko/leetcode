package algorithms.leetcode.easy

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class RemoveDuplicatesFromSortedArrayKtTest(
    private val numbers: IntArray,
    private val expectedNumbers: IntArray,
    private val expectedNumbersSize: Int
) {

    private val numbersTest = numbers.copyOf()

    @Test
    fun `given numbers when call function then return final number`() {
        val resultSize = removeDuplicates(numbersTest)

        assertEquals(expectedNumbersSize, resultSize)
    }

    @Test
    fun `given numbers when call function then update incoming array`() {
        val resultSize = removeDuplicates(numbersTest)

        assertArrayEquals(expectedNumbers, numbersTest.copyOfRange(0, resultSize))
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(
            name = "Given numbers {0} when call function then final numbers {1} with size {2}"
        )
        fun data() = listOf(
            arrayOf(intArrayOf(0,0,1,1,1,2,2,3,3,4), intArrayOf(0, 1, 2, 3, 4), 5),
            arrayOf(intArrayOf(1,1,2), intArrayOf(1,2), 2),
            arrayOf(intArrayOf(1,2,3), intArrayOf(1,2,3), 3),
            arrayOf(intArrayOf(1,1,1), intArrayOf(1), 1),
            arrayOf(intArrayOf(), intArrayOf(), 0),
        )
    }
}