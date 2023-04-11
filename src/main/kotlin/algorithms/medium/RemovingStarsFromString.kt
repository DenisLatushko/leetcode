package algorithms.medium

fun removeStars(s: String): String {
    val sb = StringBuilder()
    s.forEach { charItem ->
        if (charItem == '*') {
            if (sb.isNotEmpty()) {
                sb.deleteCharAt(sb.lastIndex)
            }
        } else {
            sb.append(charItem)
        }
    }
    return sb.toString()
}