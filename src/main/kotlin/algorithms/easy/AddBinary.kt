package algorithms.easy

/** Description: https://leetcode.com/problems/add-binary/ **/

private const val BIT_1 = '1'
private const val BIT_0 = '0'

fun addBinary(a: String, b: String): String {
    val (longNum, shortNum) = if (a.length > b.length) a to b else b to a

    val result = StringBuilder()
    var extraBit = BIT_0
    for (i in 0..longNum.lastIndex) {
        val n1 = longNum[longNum.lastIndex - i]
        val n2 = if (i <= shortNum.lastIndex) shortNum[shortNum.lastIndex - i] else BIT_0

        result.append(add(add(n1, n2), extraBit))

        extraBit = if ((n1 == BIT_1 && n2 == BIT_1) ||
            (n1 == BIT_1 && extraBit == BIT_1) ||
            (n2 == BIT_1 && extraBit == BIT_1)
        ) {
            BIT_1
        } else {
            BIT_0
        }
    }

    if (extraBit == BIT_1) result.append(extraBit)

    return result.toString().reversed()
}

fun add(n1: Char, n2: Char): Char = when {
    n1 == BIT_1 && n2 == BIT_1 -> BIT_0
    n1 == BIT_0 && n2 == BIT_1 -> BIT_1
    n1 == BIT_1 && n2 == BIT_0 -> BIT_1
    else -> BIT_0
}