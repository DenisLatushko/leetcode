package algorithms.leetcode.easy

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(Parameterized::class)
class RemoveElementKtTest(
    nums: IntArray,
    private val value: Int,
    private val expectedArray: IntArray,
    private val expectedArraySize: Int
) {

    private val numsArray = nums.copyOf()

    @Test
    fun `given array and value when call remove elements then return the array size`() {
        val resultSize = removeElement(numsArray, value)

        assertEquals(expectedArraySize, resultSize)
    }

    @Test
    fun `given array and value when call remove elements then return updated array`() {
        val resultSize = removeElement(numsArray, value)

        assertArrayEquals(expectedArray, numsArray.copyOfRange(0, resultSize))
    }

    companion object {
        @JvmStatic
        @Parameters(name = "given array {0} and value {1} when call remove elements then return updated array {2}")
        fun data() = listOf(
            arrayOf(intArrayOf(3,2,2,3), 3, intArrayOf(2,2), 2),
            arrayOf(intArrayOf(0,1,2,2,3,0,4,2), 2, intArrayOf(0,1,3,0,4), 5),
            arrayOf(intArrayOf(0,1,2,2,3,0,4,2), 99, intArrayOf(0,1,2,2,3,0,4,2), 8),
            arrayOf(intArrayOf(), 1, intArrayOf(), 0),
        )
    }
}