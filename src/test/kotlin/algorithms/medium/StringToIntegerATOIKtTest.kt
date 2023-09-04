package algorithms.medium

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class StringToIntegerATOIKtTest(
    private val stringNumber: String,
    private val expectedResult: Int
) {

    @Test
    fun `given any string when call function then it should be converted to Int value or 0`() {
        val actualResult = myAtoi(stringNumber)

        assertEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameters(name = "Given string {0} when call function then result is {1}")
        fun data() = listOf(
            arrayOf("42", 42),
            arrayOf("   -42", -42),
            arrayOf("4193 with words", 4193),
            arrayOf("    4193 with words     ", 4193),
            arrayOf("99999999999999999999999999999999999999999999999", Int.MAX_VALUE),
            arrayOf("-99999999999999999999999999999999999999999999999", Int.MIN_VALUE),
        )
    }

}