package algorithms.leetcode.easy

/**
 * Description: https://leetcode.com/problems/minimum-common-value/description/
 */

fun getCommon(nums1: IntArray, nums2: IntArray): Int {
    var ind1 = 0
    var ind2 = 0

    while (ind1 <= nums1.lastIndex && ind2 <= nums2.lastIndex) {
        val val1 = nums1[ind1]
        val val2 = nums2[ind2]

        if (val1 == val2) {
            return val1
        } else if (val1 < val2) {
            ind1++
        } else {
            ind2++
        }
    }

    return -1
}