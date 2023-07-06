package algorithms.easy

/** Description https://leetcode.com/problems/majority-element/ **/

fun majorityElement(nums: IntArray): Int {
    if (nums.size == 1) return nums.first()
    val halfSize = nums.size / 2
    val itemsCountMap = mutableMapOf<Int, Int>()
    nums.forEach { number ->
        val itemCounter = itemsCountMap[number]
        when {
            itemCounter == null -> itemsCountMap[number] = 1
            itemCounter + 1 > halfSize -> return number
            else -> itemsCountMap[number] = itemCounter + 1
        }
    }
    return 0
}