package algorithms.techinterviewhandbook.week1

import algorithms.utils.TreeNode
import junit.framework.TestCase
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class LowestCommonAncestorOfBinarySearchTreeKtTest(
    private val tree: TreeNode,
    private val p: TreeNode,
    private val q: TreeNode,
    private val expectedResult: TreeNode
) {

    @Test
    fun `given BST, P and Q when call function then common ancestor is found`() {
        val actualResult = lowestCommonAncestor(tree, p, q)

        assertEquals(expectedResult.`val`, actualResult?.`val`)
    }

    companion object {

        private val bst = TreeNode(6).apply {
            left = TreeNode(2).apply {
                left = TreeNode(0)
                right = TreeNode(4).apply {
                    left = TreeNode(3)
                    right = TreeNode(5)
                }
            }
            right = TreeNode(8).apply {
                left = TreeNode(7)
                right = TreeNode(9)
            }
        }

        @JvmStatic
        @Parameters(name = "given BST {0}, p {1} and q {2} when call function then lowest common ancestor is {3}")
        fun data() = listOf(
            arrayOf(bst, TreeNode(2), TreeNode(8), TreeNode(6)),
            arrayOf(bst, TreeNode(2), TreeNode(4), TreeNode(2))
        )

    }
}