package algorithms.techinterviewhandbook.week1

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import kotlin.test.assertEquals

private const val VALUE = 0

class MyQueueTest {

    private val queue = MyQueue()

    @Test
    fun `given queue when call push then it is not empty`() {
        queue.push(0)

        assertFalse(queue.empty())
    }

    @Test
    fun `given queue when empty function then it is true`() {
        assertTrue(queue.empty())
    }

    @Test
    fun `given queue when push and pop then it is empty`() {
        queue.apply { push(VALUE) }.pop()

        assertTrue(queue.empty())
    }

    @Test
    fun `given queue when push and pop then return first value`() {
        val actualResult = queue.apply { push(VALUE) }.pop()

        assertEquals(VALUE, actualResult)
    }

    @Test
    fun `given queue when push and peek then it is not empty`() {
        queue.apply { push(VALUE) }.peek()

        assertFalse(queue.empty())
    }

    @Test
    fun `given queue when push and peek then return first value`() {
        val actualResult = queue.apply { push(VALUE) }.peek()

        assertEquals(VALUE, actualResult)
    }
}