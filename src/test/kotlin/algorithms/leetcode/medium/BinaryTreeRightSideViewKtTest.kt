package algorithms.leetcode.medium

import algorithms.utils.TreeNode
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class BinaryTreeRightSideViewKtTest(
    private val root: TreeNode,
    private val expectedResult: List<Int>
) {

    @Test
    fun `Given tree when call right side then return a list of right nodes values`() {
        val actualResult = rightSideView(root)

        assertEquals(expectedResult, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "Given tree {0} when call right side then result {1}")
        fun data() = listOf(
            arrayOf(
                TreeNode(1).apply {
                    left = TreeNode(2).apply {
                        right = TreeNode(2)
                    }
                    right = TreeNode(3).apply {
                        right = TreeNode(4)
                    }
                },
                listOf(1, 3, 4)
            ),

            arrayOf(
                TreeNode(1).apply {
                    right = TreeNode(3)
                },
                listOf(1, 3)
            ),
        )
    }
}