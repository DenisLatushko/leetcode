package algorithms.medium

import java.util.*

/**
 * Description: https://leetcode.com/problems/group-anagrams
 */
fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val strsMaps: LinkedList<String> = LinkedList(
        strs.map {
            it.toCharArray()
                .apply { sort() }
                .joinToString(separator = "")
        }
    )

    val stringsMap = mutableMapOf<String, MutableList<String>>()
    strsMaps.forEachIndexed { index, str ->
        if (!stringsMap.containsKey(key = str)) {
            stringsMap[str] = mutableListOf()
        }
        stringsMap[str]?.add(strs[index])
    }

    return stringsMap.values.toList()
}
