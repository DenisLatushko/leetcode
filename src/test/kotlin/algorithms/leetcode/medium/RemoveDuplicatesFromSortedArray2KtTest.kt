package algorithms.leetcode.medium

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class RemoveDuplicatesFromSortedArray2KtTest(
    numbers: IntArray,
    private val expectedNumbersSize: Int,
    private val expectedNumbers: IntArray
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

        val actualArray = numbersTest.take(resultSize).toIntArray()

        assertArrayEquals(expectedNumbers, actualArray)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(
            name = "Given array {0} when call remove then number result {1} and array {2}"
        )
        fun data() = listOf(
            arrayOf(intArrayOf(1,1,1,2,2,3), 5, intArrayOf(1,1,2,2,3)),
            arrayOf(intArrayOf(0,0,1,1,1,1,2,3,3), 7, intArrayOf(0,0,1,1,2,3,3)),
            arrayOf(intArrayOf(0), 1, intArrayOf(0)),
            arrayOf(intArrayOf(), 0, intArrayOf()),
        )
    }
}