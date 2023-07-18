package algorithms.easy

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class SameTreeKtTest(
    private val tree1: TreeNode,
    private val tree2: TreeNode,
    private val expectedResult: Boolean
) {

    @Test
    fun `given trees when call function then result returned`() {
        val actualResult = isSameTree(tree1, tree2)

        assertEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameters(name = "given trees {0} and {1} when call function then {2}")
        fun data() = listOf(
            arrayOf(
                TreeNode(1).apply {
                    left = TreeNode(2)
                    right = TreeNode(3)
                },
                TreeNode(1).apply {
                    left = TreeNode(2)
                    right = TreeNode(3)
                },
                true
            ),
            arrayOf(
                TreeNode(1).apply {
                    left = TreeNode(2)
                },
                TreeNode(1).apply {
                    left = TreeNode(3)
                    right = TreeNode(2)
                },
                false
            ),
        )
    }
}