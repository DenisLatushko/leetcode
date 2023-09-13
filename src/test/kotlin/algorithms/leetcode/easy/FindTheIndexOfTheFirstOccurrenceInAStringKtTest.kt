package algorithms.leetcode.easy

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

private const val EMPTY_RESULT = -1

@RunWith(Parameterized::class)
class FindTheIndexOfTheFirstOccurrenceInAStringKtTest(
    private val str: String,
    private val subStr: String,
    private val expectedIndex: Int
) {

    @Test
    fun `given string and substring when call hash windows then return index of the first occurrence`() {
        val actualResult = strStrHashWindow(str, subStr)

        assertEquals(expectedIndex, actualResult)
    }

//    @Test
//    fun `given string and substring when call KMP then return index of the first occurrence`() {
//        val actualResult = strStrKMP(str, subStr)
//
//        assertEquals(expectedIndex, actualResult)
//    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(
            name = "Given string {0} and substring {1} when call function then result {2}"
        )
        fun data() = listOf(
            arrayOf("sadbutsad", "sad", 0),
            arrayOf("sabbutsad", "sad", 6),
            arrayOf("bbbaaaccc", "aaa", 3),
            arrayOf("bbbaaaaccc", "aaa", 3),
            arrayOf("bbbaaaaccc", "ccc", 7),
            arrayOf("bbbaaaacccd", "d", 10),
            arrayOf("leetcode", "leeto", EMPTY_RESULT),
            arrayOf("leeto", "leetcode", EMPTY_RESULT),
            arrayOf("", "leeto", EMPTY_RESULT),
            arrayOf("leetcode", "", EMPTY_RESULT),
            arrayOf("", "", EMPTY_RESULT)
        )
    }
}