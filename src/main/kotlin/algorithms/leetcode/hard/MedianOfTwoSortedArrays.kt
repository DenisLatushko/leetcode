package algorithms.leetcode.hard

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    if (nums1.isEmpty() && nums2.isEmpty()) return .0

    val merged = mutableListOf<Int>()

    var numInd1 = 0;
    var numInd2 = 0;

    while (numInd1 <= nums1.lastIndex && numInd2 <= nums2.lastIndex) {
        if (nums1[numInd1] <= nums2[numInd2]) {
            merged.add(nums1[numInd1++])
        } else {
            merged.add(nums2[numInd2++])
        }
    }

    if (numInd1 <= nums1.lastIndex) {
        merged.addAll(nums1.slice(numInd1..nums1.lastIndex))
    }

    if (numInd2 <= nums2.lastIndex) {
        merged.addAll(nums2.slice(numInd2..nums2.lastIndex))
    }

    return if (merged.size % 2 == 0) {
        val ind = merged.lastIndex / 2
        (merged[ind].toDouble() + merged[ind + 1]) / 2
    } else {
        merged[merged.lastIndex / 2].toDouble()
    }
}