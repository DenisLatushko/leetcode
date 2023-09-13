package algorithms.leetcode.easy

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(Parameterized::class)
class MajorityElementKtTest(
    private val nums: IntArray,
    private val expectedResult: Int
) {

    @Test
    fun `given array of numbers when call function then the majority element returned`() {
        val actualResult = majorityElement(nums)

        assertEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameters(name = "given array {0} when call function then the majority alement is {1}")
        fun data() = listOf(
            arrayOf(intArrayOf(3,2,3), 3),
            arrayOf(intArrayOf(2,2,1,1,1,2,2), 2),
            arrayOf(intArrayOf(1), 1),
            arrayOf(intArrayOf(), 0),
        )
    }
}