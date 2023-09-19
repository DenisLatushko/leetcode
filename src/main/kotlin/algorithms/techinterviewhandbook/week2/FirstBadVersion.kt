package algorithms.techinterviewhandbook.week2

import algorithms.leetcode.easy.VersionControl

/**
 * https://leetcode.com/problems/first-bad-version/description/
 */
class Solution(badVersion: Int): VersionControl(badVersion) {
    override fun firstBadVersion(n: Int) : Int {
        var minVersion = 0
        var maxVersion = n

        while (minVersion < maxVersion) {
            val midVersion = minVersion + (maxVersion - minVersion) / 2

            if (isBadVersion(midVersion)) {
                maxVersion = midVersion
            } else {
                minVersion = midVersion + 1
            }
        }
        return minVersion
    }
}