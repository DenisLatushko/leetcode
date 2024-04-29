package algorithms.leetcode.easy

/**
 * Description: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 */
fun maxProfit(prices: IntArray): Int {
    var minPrice = Int.MAX_VALUE
    var maxProfit = 0

    prices.forEach { price ->
        if (minPrice > price) {
            minPrice = price
        } else if (price - minPrice > maxProfit) {
            maxProfit = price - minPrice
        }
    }

    return maxProfit
}