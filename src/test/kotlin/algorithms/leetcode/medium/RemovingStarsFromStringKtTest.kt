package algorithms.leetcode.medium

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class RemovingStarsFromStringKtTest(
    private val str: String,
    private val expectedResult: String
) {

    @Test
    fun `given string when stars removed then strings returned without stars and removed characters`() {
        val actualResult = removeStars(str)

        assertEquals(expectedResult, actualResult)
    }


    companion object {
        @JvmStatic
        @Parameterized.Parameters(
            name = "Given string {0} when stars removed then strings is {1}"
        )
        fun data() = listOf(
            arrayOf("leet**cod*e", "lecoe"),
            arrayOf("leetcode********", ""),
            arrayOf("l*e*e*t*c*o*d*e*", ""),
            arrayOf("leetcode", "leetcode"),
            arrayOf("********leetcode", "leetcode"),
        )
    }
}