package algorithms.medium

import algorithms.utils.TreeNode
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(Parameterized::class)
class SumRootToLeafNumbersKtTest (
    private val tree: TreeNode?,
    private val expectedResult: Int
) {

    @Test
    fun `given tree when call function then result is sum of each branch numbers`() {
        val actualResult = sumNumbers(tree)

        assertEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameters(name = "given tree {0} when call function then result is {1}")
        fun data() = listOf(
            arrayOf(null, 0),
            arrayOf(TreeNode(1), 1),
            arrayOf(
                TreeNode(1).apply {
                    left = TreeNode(2)
                    right = TreeNode(3)
                },
                25
            ),

            arrayOf(
                TreeNode(4).apply {
                    left = TreeNode(9).apply {
                        left = TreeNode(5)
                        right = TreeNode(1)
                    }
                    right = TreeNode(0)
                },
                1026
            )
        )
    }
}