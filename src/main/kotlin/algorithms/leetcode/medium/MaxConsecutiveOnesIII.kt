package algorithms.leetcode.medium

fun longestOnes3(nums: IntArray, k: Int): Int {
    var left = 0
    var right = 0
    var kTemp = k

    while (right < nums.size) {
        if (nums[right] == 0) {
            kTemp--
        }

        if (kTemp < 0) {
            if (nums[left] == 0) {
                kTemp++
            }
            left++
        }

        right++
    }

    return right - left
}