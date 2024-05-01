package algorithms.leetcode.medium

/**
 * Description: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
 */

fun searchRange(nums: IntArray, target: Int): IntArray {
    if (nums.isNotEmpty()) {
        var left = 0
        var right = nums.lastIndex
        var mid = -1

        while (left <= right) {
            mid = left + (right - left) / 2
            when {
                nums[mid] > target -> right = mid - 1
                nums[mid] < target -> left = mid + 1
                else -> break
            }
        }

        val midL = mid - 1
        val midR = mid + 1

        return if (midL >= 0 && nums[midL] == target) {
            intArrayOf(midL, mid)
        } else if (midR <= nums.lastIndex && nums[midR] == target) {
            intArrayOf(mid, midR)
        } else if (nums[mid] == target){
            intArrayOf(mid, mid)
        } else {
            intArrayOf(-1, -1)
        }
    }

    return intArrayOf(-1, -1)
}