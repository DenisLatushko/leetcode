package algorithms.medium

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class EvaluateReversePolishNotationKtTest(
    private val rpnExpression: Array<String>,
    private val expectedResult: Int
) {

    @Test
    fun `given RPN when call evaluation then result is calculated`() {
        val actualResult = evalRPN(rpnExpression)

        assertEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(
            name = "Given RPN {0} when call evaluation then result is {1}"
        )
        fun data() = listOf(
            arrayOf(arrayOf("2","1","-","3","*"), 3),
            arrayOf(arrayOf("2","1","+","3","*"), 9),
            arrayOf(arrayOf("4","13","5","/","+"), 6),
            arrayOf(arrayOf("10","6","9","3","+","-11","*","/","*","17","+","5","+"), 22)
        )
    }
}