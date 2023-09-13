package algorithms.leetcode.easy

import algorithms.utils.TreeNode
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class InvertBinaryTreeKtTest (
    private val tree: TreeNode?,
    private val expectedResult: TreeNode?
) {

    @Test
    fun `given tree when invert then tree is mirrored`() {
        val actualResult = invertTree(tree)

        assertEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "given tree {0} when call function then max height is {1}")
        fun data() = listOf(
            arrayOf<TreeNode?>(null, null),
            arrayOf(TreeNode(), TreeNode()),
            arrayOf(
                TreeNode(1).apply {
                    left = TreeNode(21)
                    right = TreeNode(22).apply { left = TreeNode(31) }
                },
                TreeNode(1).apply {
                    left = TreeNode(22).apply { right = TreeNode(31) }
                    right = TreeNode(21)
                }
            )
        )
    }
}