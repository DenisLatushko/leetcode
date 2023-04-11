package algorithms.easy

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class BinarySearchKtTest(
    private val array: IntArray,
    private val target: Int,
    private val expectedResult: Int
) {

    @Test
    fun `given sorted array and tarhet when call search then index returned or -1`() {
        val actualResult = search(array, target)

        assertEquals(expectedResult, actualResult)
    }

    companion object {

        private val array = intArrayOf(-1,0,3,5,9,12)

        @JvmStatic
        @Parameterized.Parameters(
            name = "Given sorted array {0} and target {1} when search called then index is {2}"
        )
        fun data() = listOf(
            arrayOf(array, -1, 0),
            arrayOf(array, 12, 5),
            arrayOf(array, 5, 3),
            arrayOf(array, 10, -1),
        )
    }
}