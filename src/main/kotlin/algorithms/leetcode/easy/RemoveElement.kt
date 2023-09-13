package algorithms.leetcode.easy

/** Description: https://leetcode.com/problems/remove-element/ **/

fun removeElement(nums: IntArray, `val`: Int): Int {
    var ind2 = 0
    for (ind in 0 .. nums.lastIndex) {
        if (nums[ind] != `val`) {
            nums[ind2] = nums[ind]
            ind2++
        }
    }
    return ind2
}