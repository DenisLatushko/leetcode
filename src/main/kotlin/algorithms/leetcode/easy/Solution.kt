package algorithms.leetcode.easy

/** Description: https://leetcode.com/problems/first-bad-version/ **/

abstract class VersionControl(
    private val badVersion: Int
) {

    abstract fun firstBadVersion(n: Int) : Int

    fun isBadVersion(version: Int): Boolean {
        return version >= badVersion
    }
}

class Solution(badVersion: Int): VersionControl(badVersion) {

    override fun firstBadVersion(n: Int): Int {
        var minVersion = 0
        var maxVersion = n
        while (minVersion < maxVersion) {
            val midVersion = minVersion + (maxVersion - minVersion) / 2

            when {
                isBadVersion(midVersion) -> maxVersion = midVersion
                else -> minVersion = midVersion + 1
            }
        }

        return minVersion
    }
}