package algorithms.easy

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class SearchInsertPositionKtTest(
    private val array: IntArray,
    private val target: Int,
    private val expectedResult: Int
) {

    @Test
    fun `given array and target when call search then return index`() {
        val actualResult = searchInsert(array, target)

        assertEquals(expectedResult, actualResult)
    }

    companion object {
        private val array = intArrayOf(2,4,6,7)

        @JvmStatic
        @Parameterized.Parameters(
            name = "Given array {0} and target is {1} when call search then return index {2}"
        )
        fun data() = listOf(
//            arrayOf(array, 2, 0),
//            arrayOf(array, 7, 3),
//            arrayOf(array, 4, 1),
            arrayOf(array, 3, 1),
//            arrayOf(array, 8, 4),
//            arrayOf(array, 1, 0),
        )
    }
}