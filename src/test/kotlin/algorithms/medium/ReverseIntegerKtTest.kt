package algorithms.medium

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class ReverseIntegerKtTest(
    private val number: Int,
    private val reversedNumber: Int
) {

    @Test
    fun `given number when call function then return reversed number`() {
        val actualResult = reverse(number)

        assertEquals(reversedNumber, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(
            name = "Given number {0} when call reverse then result {1}"
        )
        fun data() = listOf(
            arrayOf(1534236469, 0),
            arrayOf(0, 0),
            arrayOf(1, 1),
            arrayOf(-1, -1),
            arrayOf(123, 321),
            arrayOf(-123, -321),
            arrayOf(1230, 321),
            arrayOf(-1230, -321),
        )
    }
}