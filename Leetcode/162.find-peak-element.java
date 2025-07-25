/*
 * @lc app=leetcode id=162 lang=java
 *
 * [162] Find Peak Element
 *
 * https://leetcode.com/problems/find-peak-element/description/
 *
 * algorithms
 * Medium (46.52%)
 * Likes:    13517
 * Dislikes: 4861
 * Total Accepted:    2M
 * Total Submissions: 4.3M
 * Testcase Example:  '[1,2,3,1]'
 *
 * A peak element is an element that is strictly greater than its neighbors.
 * 
 * Given a 0-indexed integer array nums, find a peak element, and return its
 * index. If the array contains multiple peaks, return the index to any of the
 * peaks.
 * 
 * You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is
 * always considered to be strictly greater than a neighbor that is outside the
 * array.
 * 
 * You must write an algorithm that runs in O(log n) time.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [1,2,3,1]
 * Output: 2
 * Explanation: 3 is a peak element and your function should return the index
 * number 2.
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [1,2,1,3,5,6,4]
 * Output: 5
 * Explanation: Your function can return either index number 1 where the peak
 * element is 2, or index number 5 where the peak element is 6.
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 1000
 * -2^31 <= nums[i] <= 2^31 - 1
 * nums[i] != nums[i + 1] for all valid i.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;

        // Base case: single element
        if (n == 1) return 0;

        // Check if the first element is a peak
        if (nums[0] > nums[1]) return 0;

        // Check middle elements
        for (int i = 1; i < n - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                return i;
            }
        }

        // Check if the last element is a peak
        if (nums[n - 1] > nums[n - 2]) return n - 1;

        // Default case (though problem guarantees a peak exists)
        return -1;
    }
}

// @lc code=end

