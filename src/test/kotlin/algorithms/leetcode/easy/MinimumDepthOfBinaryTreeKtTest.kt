package algorithms.leetcode.easy

import algorithms.utils.TreeNode
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class MinimumDepthOfBinaryTreeKtTest(
    private val root: TreeNode,
    private val expectedResult: Int
) {

    @Test
    fun `given tree {0} when call function then min depth as expected`() {
        val actualResult = minDepth(root)

        assertEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "given tree {0} when call function then min depth is {5}")
        fun data() = listOf(
            arrayOf(
                TreeNode(2).apply {
                    right = TreeNode(3).apply {
                        right = TreeNode(4).apply {
                            right = TreeNode(5).apply {
                                right = TreeNode(6)
                            }
                        }
                    }
                }, 5
            )
        )
    }
}