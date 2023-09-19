package algorithms.techinterviewhandbook.week2

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class RansomNoteKtTest(
    private val ransomNote: String,
    private val magazine: String,
    private val expectedResult: Boolean
) {

    @Test
    fun `given note and magazine when call then check if note can be constructed by letters from magazine`() {
        val actualResult = canConstruct(ransomNote, magazine)

        assertEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameters(name = "given ransome note {0} and magazine {1} when call function then result {2}")
        fun data() = listOf(
            arrayOf("a", "b", false),
            arrayOf("aa", "ab", false),
            arrayOf("aa", "aab", true)
        )
    }
}