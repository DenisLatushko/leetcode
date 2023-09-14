package algorithms.techinterviewhandbook.week1

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class ValidPalindromeKtTest(
    private val str: String,
    private val expectedResult: Boolean
) {

    @Test
    fun `given string when call check if palindrome then do that check`() {
        val actualResult = isPalindrome(str)

        assertEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameters(name = "given string {0} when call check if palindrome then result is {1}")
        fun data() = listOf(
            arrayOf("A man, a plan, a canal: Panama", true),
            arrayOf("race a car", false),
            arrayOf(" ", true),
            arrayOf("0P", false),
        )
    }
}