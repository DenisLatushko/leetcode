package algorithms.leetcode.easy

import algorithms.utils.TreeNode
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.Assert.assertArrayEquals

@RunWith(Parameterized::class)
class AverageOfLevelsInBinaryTreeKtTest(
    private val root: TreeNode,
    private val expectedResult: DoubleArray
) {

    @Test
    fun `given tree when call function then avg values returned`() {
        val actualResult = averageOfLevels(root).toTypedArray()

        assertArrayEquals(expectedResult.toTypedArray(), actualResult)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "given tree {0} when call function then avg values {1}")
        fun data() = listOf(
            arrayOf(
                TreeNode(2147483647).apply {
                    left = TreeNode(2147483647)
                    right = TreeNode(2147483647)
                },
                DoubleArray(2).apply {
                    this[0] = 2147483647.0
                    this[1] = 2147483647.0
                }
            )
        )
    }
}