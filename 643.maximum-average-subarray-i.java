/*
 * @lc app=leetcode id=643 lang=java
 *
 * [643] Maximum Average Subarray I
 */

// @lc code=start
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0 ; 
        for(int i = 0 ; i < k ; i++)
        {
            sum+= nums[i];
        
        }
        double maxSum = sum;
        for(int j = k ; j < nums.length ; j++)
        {
         sum = sum  - nums[j - k]+ nums[j];
         maxSum = Math.max(maxSum , sum);
        }
        return maxSum / k ;
    }
}
// @lc code=end
