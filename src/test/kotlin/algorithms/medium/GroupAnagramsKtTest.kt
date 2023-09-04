package algorithms.medium

import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import kotlin.test.assertContains
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class GroupAnagramsKtTest(
    private val stringArr: Array<String>,
    private val expectedResult: List<List<String>>
) {

    @Test
    fun `given string array when group anagrams then it should be done`() {
        val actualResult = groupAnagrams(stringArr)

        assertEquals(expectedResult.size, actualResult.size)
        assertEquals(prepareListForAssertion(expectedResult), prepareListForAssertion(actualResult))
    }

    private fun prepareListForAssertion(
        list: List<List<String>>
    ): List<List<String>> = list
        .map { it.sorted() }
        .sortedBy { it.size }

    companion object {
        @JvmStatic
        @Parameters(name = "Given array of strings {0} when call function then result is {1}")
        fun data() = listOf(
            arrayOf(
                arrayOf("eat", "tea", "tan", "ate", "nat", "bat"),
                listOf(listOf("bat"), listOf("nat", "tan"), listOf("ate", "eat", "tea"))
            ),
            arrayOf(arrayOf(""), listOf(listOf(""))),
            arrayOf(arrayOf("a"), listOf(listOf("a"))),
        )
    }
}