package algorithms.medium

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(Parameterized::class)
class ContainerWithMostWaterKtTest(
    private val height: IntArray,
    private val expectedResult: Int
) {

    @Test
    fun `given height array when call max area then max area returned`() {
        val actualResult = maxArea(height)

        assertEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameters(name = "given heights {0} when call max area then result is {1}")
        fun data() = listOf(
            arrayOf(intArrayOf(1,8,6,2,5,4,8,3,7), 49),
            arrayOf(intArrayOf(1,1), 1),
            arrayOf(intArrayOf(0, 0, 0), 0),
            arrayOf(intArrayOf(3, 2, 0), 2),
            arrayOf(intArrayOf(0, 2, 3), 2),
            arrayOf(intArrayOf(0, 3, 0), 0)
        )
    }
}