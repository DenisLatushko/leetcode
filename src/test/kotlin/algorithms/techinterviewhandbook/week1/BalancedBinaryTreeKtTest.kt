package algorithms.techinterviewhandbook.week1

import algorithms.utils.TreeNode
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class BalancedBinaryTreeKtTest(
    private val tree: TreeNode?,
    private val expectedResult: Boolean
) {

    @Test
    fun `given tree when call check if it is balanced then expect true or false`() {
        val actualResult = isBalanced(tree)

        assertEquals(expectedResult, actualResult)
    }

    companion object {

        @JvmStatic
        @Parameters(name = "given tree {0} when call check if it is balanced then expect {1}")
        fun data() = listOf(
            arrayOf(
                TreeNode(3).apply {
                    left = TreeNode(9)
                    right = TreeNode(20).apply {
                        left = TreeNode(15)
                        right = TreeNode(7)
                    }
                },
                true
            ),
            arrayOf(
                TreeNode(1).apply {
                    left = TreeNode(2).apply {
                        left = TreeNode(3).apply {
                            left = TreeNode(4)
                            right = TreeNode(4)
                        }
                        right = TreeNode(3)
                    }
                    right = TreeNode(2)
                }, false
            ),
            arrayOf(
                null, true
            )
        )
    }
}