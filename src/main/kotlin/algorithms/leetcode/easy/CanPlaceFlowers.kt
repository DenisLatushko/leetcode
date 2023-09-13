package algorithms.leetcode.easy

/** Description: https://leetcode.com/problems/can-place-flowers/editorial/ **/

private const val FREE = 0
private const val OCCUPIED = 1

fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    var counter = 0
    val lastInd = flowerbed.lastIndex
    for (i in 0..lastInd) {
        if (flowerbed[i] == FREE) {
            val isPrevFree = i == 0 || flowerbed[i - 1] == FREE
            val isNextFree = i == lastInd || flowerbed[i + 1] == FREE

            if (isNextFree && isPrevFree) {
                counter++
                if (counter > n) return true
                flowerbed[i] = OCCUPIED
            }
        }
    }

    return counter >= n
}