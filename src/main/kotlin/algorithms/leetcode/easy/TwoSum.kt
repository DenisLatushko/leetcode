package algorithms.leetcode.easy

/** Description: https://leetcode.com/problems/two-sum **/

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>()
    for ((ind, num) in nums.withIndex()) {
        val possibleValue = target - num
        if (map.contains(possibleValue)) {
            return intArrayOf(map[possibleValue]!!, ind)
        }
        map[num] = ind
    }
    return intArrayOf()
}