package algorithms.easy

fun searchInsert(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.lastIndex

    while (left <= right) {
        val midInd = left + (right - left) / 2
        val value = nums[midInd]

        when {
            target == value -> return midInd
            target > value -> left = midInd + 1
            target < value -> right = midInd - 1
        }
    }
    return left
}