package algorithms.easy

/** Description: https://leetcode.com/problems/binary-search/ **/

fun search(nums: IntArray, target: Int): Int {
    var rightInd = nums.lastIndex
    var leftInd = 0

    while (leftInd <= rightInd) {
        val midInd = leftInd + (rightInd - leftInd) / 2
        val value = nums[midInd]

        when {
            value == target -> return midInd
            value > target -> rightInd = midInd - 1
            else -> leftInd = midInd + 1
        }
    }

    return -1
}