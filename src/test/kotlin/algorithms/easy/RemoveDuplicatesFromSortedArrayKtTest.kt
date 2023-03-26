package algorithms.easy

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class RemoveDuplicatesFromSortedArrayKtTest(
    private val numbers: List<Int>,
    private val expectedNumbers: List<Int>,
    private val expectedNumbersSize: Int
) {

    @Test
    fun `given numbers when call function them final numbers with expected size`() {
        val numbersArray = numbers.toIntArray()
        val expectedArray = expectedNumbers.toIntArray()

        val resultSize = removeDuplicates(numbersArray)

        assertEquals(expectedNumbersSize, resultSize)
        assertResultItems(numbersArray, expectedArray, resultSize)
    }

    private fun assertResultItems(
        numbers: IntArray,
        expectedArray: IntArray,
        arraySize: Int
    ) {
        for (ind in 0 until arraySize) {
            assertEquals(expectedArray[ind], numbers[ind])
        }
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(
            name = "Given numbers {0} when call function then final numbers {1} with size {2}"
        )
        fun data() = listOf(
            arrayOf(listOf(0,0,1,1,1,2,2,3,3,4), listOf(0, 1, 2, 3, 4), 5),
            arrayOf(listOf(1,1,2), listOf(1,2), 2),
            arrayOf(listOf(1,2,3), listOf(1,2,3), 3),
            arrayOf(listOf(1,1,1), listOf(1), 1),
            arrayOf(emptyList<Int>(), emptyList<Int>(), 0),
        )
    }
}