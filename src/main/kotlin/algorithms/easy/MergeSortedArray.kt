package algorithms.easy

/** Description: https://leetcode.com/problems/merge-sorted-array/ **/

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
    var ind1 = m - 1
    var ind2 = n - 1
    var ind3 = nums1.lastIndex

    while (ind3 >= 0) {
        if (ind2 < 0) break

        if (ind1 >= 0 && nums1[ind1] >= nums2[ind2]) {
            nums1[ind3] = nums1[ind1]
            ind1--
        } else {
            nums1[ind3] = nums2[ind2]
            ind2--
        }

        ind3--
    }
}