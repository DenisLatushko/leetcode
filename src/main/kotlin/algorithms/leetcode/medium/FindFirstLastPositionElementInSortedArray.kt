package algorithms.leetcode.medium

/**
 * Description: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
 */

fun searchRange(nums: IntArray, target: Int): IntArray {
    if (nums.isNotEmpty()) {
        var left = 0
        var right = nums.size
        var mid = -1

        while (left <= right) {
            mid = (right - left) / 2
            when {
                nums[mid] > target -> right = mid - 1
                nums[mid] < target -> left = mid + 1
                else -> break
            }
        }

        if (nums[mid] == target) {
            return when (target) {
                nums[mid + 1] -> intArrayOf(mid, mid + 1)
                nums[mid - 1] -> intArrayOf(mid - 1, mid)
                else -> intArrayOf(-1, -1)
            }
        }
    }

    return intArrayOf(-1, -1)
}