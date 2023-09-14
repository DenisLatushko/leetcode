package algorithms.techinterviewhandbook.week1

/**
 * https://leetcode.com/problems/binary-search/
 */
fun search(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.lastIndex

    while (left <= right) {
        val center = right - (right - left) / 2
        val value = nums[center]
        when {
            target == value -> return center
            target < value -> right = center - 1
            else -> left = center + 1
        }
    }

    return -1
}