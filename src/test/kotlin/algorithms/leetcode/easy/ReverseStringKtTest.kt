package algorithms.leetcode.easy

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.Assert.assertArrayEquals


@RunWith(Parameterized::class)
class ReverseStringKtTest(
    private val array: CharArray,
    private val expectedResult: CharArray
) {

    @Test
    fun `given array when call reverse then result returned as reversed array`() {
        reverseString(array)

        assertArrayEquals(expectedResult, array)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "given array {0} when call reverse then result is {1}")
        fun data() = listOf(
            arrayOf(charArrayOf('h','e','l','l','o'), charArrayOf('o','l','l','e','h')),
            arrayOf(charArrayOf('H','a','n','n','a','h'), charArrayOf('h','a','n','n','a','H')),
            arrayOf(charArrayOf('H'), charArrayOf('H')),
        )
    }
}