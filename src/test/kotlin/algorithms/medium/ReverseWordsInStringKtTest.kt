package algorithms.medium

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class ReverseWordsInStringKtTest(
    private val str: String,
    private val expectedResult: String
) {

    @Test
    fun `given string when reverse then the result string contains reversed words`() {
        val actualResult = reverseWords(str)

        assertEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameters(name = "Given string {0} when call reverse then the result is {1}")
        fun data() = listOf(
            arrayOf("the sky is blue", "blue is sky the"),
            arrayOf("  hello world  ", "world hello"),
            arrayOf("a good   example", "example good a"),
            arrayOf("a", "a"),
        )
    }
}