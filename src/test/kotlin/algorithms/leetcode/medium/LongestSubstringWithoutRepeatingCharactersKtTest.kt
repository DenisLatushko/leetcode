package algorithms.leetcode.medium

import algorithms.utils.toInvertedList
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class LongestSubstringWithoutRepeatingCharactersKtTest(
    private val s: String,
    private val expectedResult: Int
) {

    @Test
    fun `given string when find when find then find longest substring`() {
        val actualResult = lengthOfLongestSubstring(s)

        assertEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "Given string {0} when find the longest substring then result {1}")
        fun data() = listOf(
            arrayOf("abcabcbb", 3),
            arrayOf("bbbbb", 1),
            arrayOf("pwwkew", 3),
            arrayOf("a", 1),
            arrayOf("", 0),
            arrayOf("dvdf", 3)
        )
    }
}