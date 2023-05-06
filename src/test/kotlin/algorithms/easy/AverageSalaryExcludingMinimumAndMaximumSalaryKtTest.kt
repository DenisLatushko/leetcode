package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

private const val DEFAULT_DELTA = .0

@RunWith(Parameterized::class)
class AverageSalaryExcludingMinimumAndMaximumSalaryKtTest(
    private val values: List<Int>,
    private val expectedResult: Double
) {

    @Test
    fun `given array when called function then result is average value except min and max values`() {
        val actualResult = average(values.toIntArray())

        assertEquals(expectedResult, actualResult, DEFAULT_DELTA)
    }

    companion object {

        @JvmStatic
        @Parameterized.Parameters(
            name = "Given array {0} when called average then result is {1}"
        )
        fun data() = listOf(
            arrayOf(listOf(4000,3000,1000,2000), 2500.0),
            arrayOf(listOf(1000,2000,3000), 2000.0),
        )
    }
}