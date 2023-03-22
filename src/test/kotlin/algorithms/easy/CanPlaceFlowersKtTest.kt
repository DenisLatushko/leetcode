package algorithms.easy

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class CanPlaceFlowersKtTest(
    private val flowerbed: List<Int>,
    private val requiredFlowers: Int,
    private val expectedResult: Boolean
) {

    @Test
    fun `given flowerbed and N flowers required when call function the return flag`() {
        val actualResult = canPlaceFlowers(flowerbed.toIntArray(), requiredFlowers)

        assertEquals(expectedResult, actualResult)
    }

    companion object {
        private val flowerbed1 = listOf(1, 1, 1, 1, 1)
        private val flowerbed1Flags = listOf(false, false, false, false, false)

        private val flowerbed2 = listOf(0, 0, 0, 0, 0)
        private val flowerbed2Flags = listOf(true, true, true, false, false)

        private val flowerbed3 = listOf(1, 0, 1, 0, 1)
        private val flowerbed3Flags = listOf(false, false, false, false, false)

        private val flowerbed4 = listOf(0, 0, 1, 0, 0)
        private val flowerbed4Flags = listOf(true, true, false, false, false)

        private val flowerbed5 = listOf(1, 1, 0, 0, 0)
        private val flowerbed5Flags = listOf(true, false, false, false, false)

        @JvmStatic
        @Parameterized.Parameters(
            name = "Given flowerbed {0} and {1} flowers required when call function then result is {2}"
        )
        fun data() = mutableListOf<Array<*>>().apply {
            flowerbed1Flags.forEachIndexed { ind, item -> add(arrayOf(flowerbed1, ind + 1, item)) }
            flowerbed2Flags.forEachIndexed { ind, item -> add(arrayOf(flowerbed2, ind + 1, item)) }
            flowerbed3Flags.forEachIndexed { ind, item -> add(arrayOf(flowerbed3, ind + 1, item)) }
            flowerbed4Flags.forEachIndexed { ind, item -> add(arrayOf(flowerbed4, ind + 1, item)) }
            flowerbed5Flags.forEachIndexed { ind, item -> add(arrayOf(flowerbed5, ind + 1, item)) }
        }
    }
}