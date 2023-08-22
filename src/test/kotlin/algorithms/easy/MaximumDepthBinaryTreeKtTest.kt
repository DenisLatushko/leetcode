package algorithms.easy

import algorithms.utils.TreeNode
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class MaximumDepthBinaryTreeKtTest(
    private val tree: TreeNode?,
    private val expectedResult: Int
) {

    @Test
    fun `given tree when call max depth then max tree depth returned`() {
        val actualResult = maxDepth(tree)

        assertEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameters(name = "given tree {0} when call function then max height is {1}")
        fun data() = listOf(
            arrayOf(null, 0),
            arrayOf(TreeNode(), 1),
            arrayOf(
                TreeNode(1).apply {
                    left = TreeNode(21)
                    right = TreeNode(22).apply { left = TreeNode(31) }
                },
                3
            )
        )
    }
}