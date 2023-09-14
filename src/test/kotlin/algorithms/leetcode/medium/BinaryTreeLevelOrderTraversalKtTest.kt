package algorithms.leetcode.medium

import algorithms.utils.TreeNode
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class BinaryTreeLevelOrderTraversalKtTest(
    private val root: TreeNode?,
    private val expectedResult: List<List<Int>>
) {

    @Test
    fun `given tree when call level order then return the level order traversal of its nodes`() {
        val actualResult = levelOrder(root)

        assertEquals(expectedResult, actualResult)
    }

    companion object {

        @JvmStatic
        @Parameters(name = "Given tree {0} when call level order then result is {1}")
        fun data() = listOf(
            arrayOf(
                TreeNode(3).apply {
                    left = TreeNode(9)
                    right = TreeNode(20).apply {
                        left = TreeNode(15)
                        right = TreeNode(7)
                    }
                },
                listOf(listOf(3), listOf(9, 20), listOf(15, 7))
            ),
            arrayOf(TreeNode(1), listOf(listOf(1))),
            arrayOf(null, emptyList<Int>()),
            arrayOf(
                TreeNode(1).apply {
                    left = TreeNode(2).apply {
                        left = TreeNode(4)
                    }
                    right = TreeNode(3).apply {
                        left = TreeNode(5)
                    }
                },
                listOf(listOf(1), listOf(2, 3), listOf(4,5))
            )
        )
    }
}