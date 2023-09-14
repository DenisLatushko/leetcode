package algorithms.techinterviewhandbook.week1

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
fun maxProfit(prices: IntArray): Int {
    var minValue = Int.MAX_VALUE
    var result = 0

    for (ind in 0 .. prices.lastIndex) {
        val item = prices[ind]
        if (item < minValue) {
            minValue = item
        } else if (item - minValue > result) {
            result = item - minValue
        }
    }

    return result
}