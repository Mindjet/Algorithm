/**
 * 动态规划
 * 
 * 找出临界情况 分段计算最优解
 */

/**
 * Example 1
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 * 
 * 买卖股票的最佳时机，只交易一笔，计算最大收益
 * 
 * 1、临界情况：第i天的最大收益 = Max(第i-1天的最大收益，第i天价格-前i-1天的最低价)
 * 2、第i天的最大收益即是分段的最优解
 */
function oneTimeStockMaxProfit(pricesTrend) {
    let minPrice = 0;
    for (let i = 0; i < pricesTrend.length; i++) {
        if (i == 0) {
            minPrice = pricesTrend[0];
        } else {
            minPrice = Math.min(minPrice, pricesTrend[i]);
            pricesTrend[i] = Math.max(pricesTrend[i - 1], pricesTrend[i] - minPrice);
        }
    }
    return pricesTrend[pricesTrend.length - 1];
}

const pricesTrend = [2, 3, 1, 2, 7, 8];
const maxProfit = oneTimeStockMaxProfit(pricesTrend);
console.log(maxProfit);
