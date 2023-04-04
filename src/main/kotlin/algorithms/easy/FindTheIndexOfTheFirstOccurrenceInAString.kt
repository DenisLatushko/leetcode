package algorithms.easy

/** Description: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/ **/

private const val EMPTY_RESULT = -1

fun strStrHashWindow(haystack: String, needle: String): Int {
    for(i in 0..(haystack.length - needle.length)) {
        val substring = haystack.subSequence(i, i + needle.length)
        if (substring.hashCode() == needle.hashCode()) {
            var isEqual = false
            for (j in 0..substring.lastIndex) {
                isEqual = substring[j] == needle[j]
                if (!isEqual) break
            }

            if (isEqual) return i
        }
    }
    return EMPTY_RESULT
}

//fun strStrKMP(haystack: String, needle: String): Int {
//    val piArray = IntArray(needle.length)
//}