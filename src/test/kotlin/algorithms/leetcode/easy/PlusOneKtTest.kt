package algorithms.leetcode.easy

import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class PlusOneKtTest(
    private val number: List<Int>,
    private val expectedNumber: List<Int>
) {

    @Test
    fun `Given number when add 1 then result is bigger on 1`(){
        val actualResult = plusOne(number.toIntArray())

        assertTrue(expectedNumber.toIntArray() contentEquals actualResult)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(
            name = "Given number {0} when add 1 then result is {1}"
        )
        fun data() = listOf(
            arrayOf(listOf(0), listOf(1)),
            arrayOf(listOf(1, 2, 3), listOf(1, 2, 4)),
            arrayOf(listOf(4, 3, 2, 1), listOf(4, 3, 2, 2)),
            arrayOf(listOf(4, 3, 2, 9), listOf(4, 3, 3, 0)),
            arrayOf(listOf(9, 9, 9, 9), listOf(1, 0, 0, 0, 0)),
            arrayOf(emptyList(), emptyList()),
        )
    }
}