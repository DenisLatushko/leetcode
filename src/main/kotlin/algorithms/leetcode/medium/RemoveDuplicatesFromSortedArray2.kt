package algorithms.leetcode.medium

/** Description: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii **/

fun removeDuplicates(nums: IntArray): Int {
    var result = nums.size

    var ind = 0
    while (ind < result - 2) {
        if (nums[ind + 2] == nums[ind]) {
            for (i in (ind + 3) until result) {
                nums[i - 1] = nums[i]
            }
            result--
        } else {
            ind++
        }
    }

    return result
}