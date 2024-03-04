package algorithms.leetcode.easy

fun generate(numRows: Int): List<List<Int>> {
    if (numRows <= 0) return emptyList()

    val result = mutableListOf<List<Int>>().apply {
        add(listOf(1))
        if (numRows > 1) add(listOf(1, 1))
    }

    for (rowNum in 3 .. numRows) {
        val lastRow = result.last()
        val newRow = mutableListOf<Int>().apply { add(1) }

        for (itemInd in 1 until lastRow.size) {
            newRow.add(lastRow[itemInd] + lastRow[itemInd - 1])
        }

        newRow.add(1)
        result.add(newRow)
    }

    return result
}