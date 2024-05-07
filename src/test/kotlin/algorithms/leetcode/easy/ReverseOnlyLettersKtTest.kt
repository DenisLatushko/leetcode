package algorithms.leetcode.easy

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class ReverseOnlyLettersKtTest (
    private val s: String,
    private val expectedResult: String
) {
    @Test
    fun `given string when call reverse only letters then each character except dash reversed`() {
        val actualResult = reverseOnlyLetters(s)

        assertEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "given string {0} when call reverse then result is {1}")
        fun data() = listOf(
            arrayOf("ab-cd", "dc-ba"),
            arrayOf("a-bC-dEf-ghIj", "j-Ih-gfE-dCba"),
            arrayOf("Test1ng-Leet=code-Q!", "Qedo1ct-eeLg=ntse-T!"),
            arrayOf("A", "A"),
            arrayOf("-A", "-A"),
            arrayOf("-AB", "-BA"),
            arrayOf("A-", "A-"),
            arrayOf("-", "-")
        )
    }
}