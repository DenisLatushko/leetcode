package algorithms.leetcode.easy

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class AddBinaryKtTest(
    private val numberX: String,
    private val numberY: String,
    private val expectedResult: String
) {

    @Test
    fun `given binary numbers X and Y when add them then result returned`() {
        val actualResult = algorithms.leetcode.easy.addBinary(numberX, numberY)

        assertEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameters(name = "given binary numbers {0} and {1} when add them then result {2}")
        fun data() = listOf(
            arrayOf("11", "1", "100"),
            arrayOf("10101", "1011", "100000"),
            arrayOf("1011", "10101", "100000"),
            arrayOf("1010", "1011", "10101"),
            arrayOf("0000", "1011", "1011"),
        )
    }
}