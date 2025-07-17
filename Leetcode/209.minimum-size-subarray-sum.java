/*
 * @lc app=leetcode id=209 lang=java
 *
 * [209] Minimum Size Subarray Sum
 *
 * https://leetcode.com/problems/minimum-size-subarray-sum/description/
 *
 * algorithms
 * Medium (49.51%)
 * Likes:    13570
 * Dislikes: 504
 * Total Accepted:    1.5M
 * Total Submissions: 3M
 * Testcase Example:  '7\n[2,3,1,2,4,3]'
 *
 * Given an array of positive integers nums and a positive integer target,
 * return the minimal length of a subarray whose sum is greater than or equal
 * to target. If there is no such subarray, return 0 instead.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: The subarray [4,3] has the minimal length under the problem
 * constraint.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: target = 4, nums = [1,4,4]
 * Output: 1
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: target = 11, nums = [1,1,1,1,1,1,1,1]
 * Output: 0
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= target <= 10^9
 * 1 <= nums.length <= 10^5
 * 1 <= nums[i] <= 10^4
 * 
 * 
 * 
 * Follow up: If you have figured out the O(n) solution, try coding another
 * solution of which the time complexity is O(n log(n)).
 */

// @lc code=start


class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    int start = 0;
    int windowSum = 0;
    int minLength = Integer.MAX_VALUE;

    for(int end = 0 ; end < nums.length ; end++)
    {
        windowSum += nums[end];
        while(windowSum >= target)
        {
            minLength = Math.min(minLength , end - start + 1);
            windowSum -= nums[start];
            start++;
        }
    }
    return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }


}
// @lc code=end
