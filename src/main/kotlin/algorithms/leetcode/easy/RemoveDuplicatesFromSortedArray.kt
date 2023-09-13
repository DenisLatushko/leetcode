package algorithms.leetcode.easy

/** Description: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/ **/

fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var insertInd = 1
    var counter = 1

    for (ind in 1..nums.lastIndex) {
        if (nums[ind] != nums[ind - 1]) {
            nums[insertInd] = nums[ind]
            counter++
            insertInd++
        }
    }

    return counter
}