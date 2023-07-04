package algorithms.medium

import org.junit.Assert.assertArrayEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class RotateArrayKtTest(
    private val array: IntArray,
    private val number: Int,
    private val expectedResult: IntArray
) {

    @Test
    fun `given array and number when call rotate then result array is rotated`() {
        rotate(array, number)

        assertArrayEquals(expectedResult, array)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(
            name = "Given array {0} and number {1} when call rotate then result {2}"
        )
        fun data() = listOf(
            arrayOf(intArrayOf(1,2,3,4,5,6,7), 3, intArrayOf(5,6,7,1,2,3,4)),
            arrayOf(intArrayOf(-1,-100,3,99), 2, intArrayOf(3,99,-1,-100)),
            arrayOf(intArrayOf(-1,-100,3,99), 4, intArrayOf(-1,-100,3,99)),
            arrayOf(intArrayOf(-1,-100,3,99), 8, intArrayOf(-1,-100,3,99)),
            arrayOf(intArrayOf(-1,-100,3,99), 5, intArrayOf(99,-1,-100,3)),
        )
    }
}