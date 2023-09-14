package algorithms.techinterviewhandbook.week1

import junit.framework.TestCase
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class ValidAnagramKtTest(
    private val s: String,
    private val t: String,
    private val expectedResult: Boolean
) {

    @Test
    fun `given strings when check if anagram then do that check`() {
        val actualResult = isAnagram(s, t)

        assertEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameters(name = "given strings {0} and {1} when check if anagram then result is {2}")
        fun data() = listOf(
            arrayOf("anagram", "nagaram", true),
            arrayOf("rat", "car", false),
        )
    }
}