package algorithms.leetcode.medium

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class LongestPalindromicSubstringKtTest(
    private val str: String,
    private val expectedResult: String
) {

    @Test
    fun `given string when call function then return a longest palindrome subscribing`() {
        val actualResult = longestPalindrome(str)

        assertEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameters(name = "given string {0} when call function then a longest palindrome subscribing is {1}")
        fun data() = listOf(
            arrayOf("babad", "bab"),
            arrayOf("cbbd", "bb"),
            arrayOf("aabbbcccdd", "bbb"),
            arrayOf("", ""),
            arrayOf("ab", "a"),
        )
    }
}