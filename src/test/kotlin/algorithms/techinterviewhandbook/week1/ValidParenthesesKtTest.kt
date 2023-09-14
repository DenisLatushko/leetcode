package algorithms.techinterviewhandbook.week1

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class ValidParenthesesKtTest(
    private val str: String,
    private val expectedResult: Boolean
) {

    @Test
    fun `given string when call isValid then result returned`() {
        val actualResult = isValid(str)

        assertEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(
            name = "Given string {0} when call isValid then result is {1}"
        )
        fun data() = listOf(
            arrayOf("(", false),
            arrayOf("{", false),
            arrayOf("[", false),

            arrayOf(")", false),
            arrayOf("}", false),
            arrayOf("]", false),

            arrayOf("()", true),
            arrayOf("{)", false),
            arrayOf("[)", false),

            arrayOf("(}", false),
            arrayOf("{}", true),
            arrayOf("[}", false),

            arrayOf("(]", false),
            arrayOf("{]", false),
            arrayOf("[]", true),

            arrayOf("){", false),
            arrayOf("(){}}{", false),

            arrayOf("(){}[]", true),
            arrayOf("({[]})", true),
            arrayOf("([]){}", true),
        )
    }
}