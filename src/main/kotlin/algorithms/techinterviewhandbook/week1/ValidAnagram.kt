package algorithms.techinterviewhandbook.week1

/**
 * https://leetcode.com/problems/valid-anagram/
 */
fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val sHashMap = getStringHashMap(s)
    val tHashMap = getStringHashMap(t)

    return sHashMap == tHashMap
}

private fun getStringHashMap(str: String): Map<Char, Int> {
    val map = mutableMapOf<Char, Int>()
    str.forEach {
        if (!map.containsKey(it)) {
            map[it] = 1
        } else {
            map[it] = map[it]!! + 1
        }

    }
    return map
}