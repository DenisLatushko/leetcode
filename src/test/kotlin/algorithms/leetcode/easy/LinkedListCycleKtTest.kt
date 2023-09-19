package algorithms.leetcode.easy

import algorithms.utils.ListNode
import algorithms.utils.getCyclicList
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class LinkedListCycleKtTest(
    private val rootNode: ListNode?,
    private val expectedResult: Boolean
) {

    @Test
    fun `given linked list when call has cycle then check is last node has reference to another node`() {
        val actualResult = hasCycle(rootNode)

        assertEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(
            name = "Given list {0} when call has cycle then result is {1}"
        )
        fun data() = listOf(
            arrayOf(getCyclicList(1, 3204), true),
            arrayOf(getCyclicList(0, 12), true),
            arrayOf(getCyclicList(null, 3204), false),
            arrayOf(getCyclicList(null, 1), false),
        )
    }
}