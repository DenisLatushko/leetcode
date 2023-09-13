package algorithms.leetcode.medium

/** Description: https://leetcode.com/problems/rotate-array/ **/

fun rotate(nums: IntArray, k: Int) {
    fun reverse(arr: IntArray, fromInd: Int, toInd: Int) {
        var from = fromInd
        var to = toInd
        while (from < to) {
            val temp = arr[from]
            arr[from] = arr[to]
            arr[to] = temp
            from++
            to--
        }
    }

    val kReal = k % nums.size
    if (kReal != nums.size) {
        reverse(nums, 0, nums.lastIndex)
        reverse(nums, 0, kReal - 1)
        reverse(nums, kReal, nums.lastIndex)
    }
}

