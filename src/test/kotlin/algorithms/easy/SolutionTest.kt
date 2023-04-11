package algorithms.easy

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class SolutionTest(
    private val buildNumber: Int,
    private val badBuildNumber: Int
) {

    private val solution = Solution(badBuildNumber)

    @Test
    fun `given solution and build number when get bad build number then it is returned`() {
        val actualResult = solution.firstBadVersion(buildNumber)

        assertEquals(badBuildNumber, actualResult)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(
            name = "Given number of builds as {0} and the bad build number is {1}}"
        )
        fun data() = listOf(
            arrayOf(1, 1),
            arrayOf(5, 4),
            arrayOf(3, 1),
            arrayOf(4, 1)
        )
    }
}