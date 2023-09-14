package algorithms.techinterviewhandbook.week1

/**
 * https://leetcode.com/problems/two-sum/
 */
fun twoSum(nums: IntArray, target: Int): IntArray {
    val valuesHash = mutableMapOf<Int, Int>()

    nums.forEachIndexed { index, item ->
        if (valuesHash.containsKey(item)) {
            return intArrayOf(valuesHash[item]!!, index)
        } else {
            valuesHash[target - item] = index
        }
    }

    return intArrayOf()
}