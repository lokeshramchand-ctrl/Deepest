/*
 * @lc app=leetcode id=122 lang=java
 *
 * [122] Best Time to Buy and Sell Stock II
 */

// @lc code=start
class Solution {
    /**
     * Returns the maximum possible profit from at most two transactions.
     * 
     * @param prices an array of integers, where prices[i] is the price of a given stock on the ith day
     * @return the maximum possible profit from at most two transactions
     */
    public int maxProfit(int[] prices) {
        int maxi = 0;
        for(int i = 1 ; i < prices.length ; i++)
        {
            if(prices[i] > prices[i-1])
            {
                maxi += prices[i] - prices[i-1];
            }
        }
        return maxi;
    }
}
// @lc code=end

