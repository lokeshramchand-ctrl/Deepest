/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 *
 * https://leetcode.com/problems/contains-duplicate/description/
 *
 * algorithms
 * Easy (63.29%)
 * Likes:    13045
 * Dislikes: 1337
 * Total Accepted:    5.3M
 * Total Submissions: 8.4M
 * Testcase Example:  '[1,2,3,1]'
 *
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [1,2,3,1]
 * 
 * Output: true
 * 
 * Explanation:
 * 
 * The element 1 occurs at the indices 0 and 3.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [1,2,3,4]
 * 
 * Output: false
 * 
 * Explanation:
 * 
 * All elements are distinct.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * 
 * Output: true
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 * 
 * 
 */

// @lc code=start

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
    HashSet<Integer> st = new HashSet<>();
            for(int num : nums)
        {
            st.add(num);
        }
        int k = st.size();
        if(n == k)
        {
            return false;
        }
        return true;
    }
}
// @lc code=end

