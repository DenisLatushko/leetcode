package algorithms.leetcode.easy

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class ReverseWordsInAStringIIIKtTest(
    private val s: String,
    private val expectedResult: String
) {

    @Test
    fun `given string when call reverse then each word characters reversed`() {
        val actualResult = reverseWords(s)

        assertEquals(expectedResult, actualResult)
    }


    companion object {
        @JvmStatic
        @Parameters(name = "given string {0} when call reverse then result is {1}")
        fun data() = listOf(
            arrayOf("Let's take LeetCode contest", "s'teL ekat edoCteeL tsetnoc"),
            arrayOf("Mr Ding", "rM gniD"),
            arrayOf("A", "A"),
        )
    }
}