package algorithms.leetcode.hard

/** Description: https://leetcode.com/problems/substring-with-concatenation-of-all-words **/

fun findSubstring(s: String, words: Array<String>): List<Int> {
    val wordSize = words.first().length
    val windowSize = words.size * wordSize
    val wordsNumberMap = getWordsNumberMap(words)
    val result = mutableListOf<Int>()

    for (charInd in 0 .. (s.length - windowSize)) {
        val firstSubstring = s.substring(charInd, charInd + wordSize)
        if (words.contains(firstSubstring)) {
            val array = Array(words.size) { "" }.apply { set(0, firstSubstring) }
            for (wordInd in 1 .. words.lastIndex) {
                val substringInd = wordInd * wordSize + charInd
                array[wordInd] = s.substring(substringInd, substringInd + wordSize)
            }
            val substringsHashMap = getWordsNumberMap(array)
            if (wordsNumberMap == substringsHashMap) {
                result.add(charInd)
            }
        }
    }

    return result
}

private fun getWordsNumberMap(words: Array<String>): Map<String, Int> =
    mutableMapOf<String, Int>().apply {
        words.forEach { word ->
            val wordNumber = get(word)
            put(word, if (wordNumber == null) 1 else wordNumber + 1)
        }
    }