package algorithms.easy

import algorithms.utils.TreeNode
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class SymmetricTreeKtTest(
    private val tree: TreeNode?,
    private val expectedResult: Boolean
) {

    @Test
    fun `given tree when call max depth then max tree depth returned`() {
        val actualResult = isSymmetric(tree)

        assertEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "given tree {0} when call function then max height is {1}")
        fun data() = listOf(
            arrayOf(TreeNode(), false),
            arrayOf(TreeNode(0).apply { left = TreeNode(11) }, false),
            arrayOf(TreeNode(0).apply { right = TreeNode(21) }, false),
            arrayOf(
                TreeNode(0).apply {
                    left = TreeNode(11)
                    right = TreeNode(21)
                }, false
            ),
            arrayOf(
                TreeNode(0).apply {
                    left = TreeNode(11).apply { left = TreeNode(21) }
                    right = TreeNode(11).apply { left = TreeNode(21) }
                }, false
            ),
            arrayOf(
                TreeNode(0).apply {
                    left = TreeNode(11).apply { right = TreeNode(21) }
                    right = TreeNode(11).apply { right = TreeNode(21) }
                }, false
            ),
            arrayOf(
                TreeNode(0).apply {
                    left = TreeNode(11).apply { left = TreeNode(21) }
                    right = TreeNode(11).apply { right = TreeNode(21) }
                }, true
            ),
            arrayOf(
                TreeNode(0).apply {
                    left = TreeNode(11).apply { right = TreeNode(21) }
                    right = TreeNode(11).apply { left = TreeNode(21) }
                },
                true
            ),
            arrayOf(
                TreeNode(0).apply {
                    left = TreeNode(11).apply {
                        left = TreeNode(21)
                        right = TreeNode(22)
                    }
                    right = TreeNode(11).apply {
                        left = TreeNode(22)
                        right = TreeNode(21)
                    }
                },
                true
            )
        )
    }
}