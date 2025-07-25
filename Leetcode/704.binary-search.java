/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 *
 * https://leetcode.com/problems/binary-search/description/
 *
 * algorithms
 * Easy (59.64%)
 * Likes:    12686
 * Dislikes: 278
 * Total Accepted:    3.2M
 * Total Submissions: 5.4M
 * Testcase Example:  '[-1,0,3,5,9,12]\n9'
 *
 * Given an array of integers nums which is sorted in ascending order, and an
 * integer target, write a function to search target in nums. If target exists,
 * then return its index. Otherwise, return -1.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 10^4
 * -10^4 < nums[i], target < 10^4
 * All the integers in nums are unique.
 * nums is sorted in ascending order.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums , 0 , nums.length - 1 , target);
    }
    private int binarySearch(int nums[] , int low , int high , int target)
    {
        if(high >= low)
        {
            int mid = low + (high - low) / 2;
            if(nums[mid] == target)
            {
                return mid;
            }
           else if(nums[mid] > target)
            {
                return binarySearch(nums, low, mid-1, target);
            }
            return binarySearch(nums, mid+1, high, target);

        }
        return -1;
    } 
}
// @lc code=end
