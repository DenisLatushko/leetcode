package algorithms.leetcode.easy

import org.junit.Assert.assertArrayEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class MergeSortedArrayKtTest(
    private val array1: IntArray,
    private val m: Int,
    private val array2: IntArray,
    private val n: Int,
    private val expectedResult: IntArray
) {

    @Test
    fun `given array1 number m array2 number n when call merge then array1 changed and equal expected array`() {
        merge(array1, m, array2, n)

        assertArrayEquals(expectedResult, array1)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(
            name = """
                Given array 1 {0} with number {1} and array 2 {2} with number {3} when 
                call function then the final array is {4}
            """
        )
        fun data() = listOf(
            arrayOf(intArrayOf(1,2,3,0,0,0), 3, intArrayOf(2,5,6), 3, intArrayOf(1,2,2,3,5,6)),
            arrayOf(intArrayOf(1), 1, intArrayOf(), 0, intArrayOf(1)),
            arrayOf(intArrayOf(0), 0, intArrayOf(1), 1, intArrayOf(1)),
        )
    }

}