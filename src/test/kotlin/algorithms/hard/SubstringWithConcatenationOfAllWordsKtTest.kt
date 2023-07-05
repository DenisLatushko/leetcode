package algorithms.hard

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class SubstringWithConcatenationOfAllWordsKtTest(
    private val str: String,
    private val words: Array<String>,
    private val expectedIndList: List<Int>
) {

    @Test
    fun `given string and words when call findSubstring then return substring indices`() {
        val actualResult = findSubstring(str, words)

        assertEquals(expectedIndList, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(
            name = "Given string {0} and words {1} when call findSubstring then result is {2}"
        )
        fun data() = listOf(
            arrayOf("barfoothefoobarman", arrayOf("foo","bar"), listOf(0, 9)),
            arrayOf("wordgoodgoodgoodbestword", arrayOf("word","good","best","word"), emptyList<Int>()),
            arrayOf("barfoofoobarthefoobarman", arrayOf("bar","foo","the"), listOf(6,9,12))
        )
    }
}