package algorithms.techinterviewhandbook.week2

/**
 * https://leetcode.com/problems/ransom-note/description/
 */
fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val ransomMap = getCharsMap(ransomNote)
    val magazineMap = getCharsMap(magazine)

    ransomMap.entries.forEach { entry ->
        val occurrences = magazineMap.getOrDefault(entry.key, 0)
        if (entry.value > occurrences) return false
    }

    return true
}

private fun getCharsMap(str: String): Map<Char, Int> {
    val charsMap = mutableMapOf<Char, Int>()
    str.forEach { cr ->
        charsMap[cr] = charsMap.getOrDefault(cr, 0) + 1
    }
    return charsMap
}