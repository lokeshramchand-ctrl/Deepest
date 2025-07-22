/*
 * @lc app=leetcode id=1095 lang=java
 *
 * [1095] Find in Mountain Array
 *
 * https://leetcode.com/problems/find-in-mountain-array/description/
 *
 * algorithms
 * Hard (40.54%)
 * Likes:    3458
 * Dislikes: 143
 * Total Accepted:    172.8K
 * Total Submissions: 426.1K
 * Testcase Example:  '[1,2,3,4,5,3,1]\n3'
 *
 * (This problem is an interactive problem.)
 * 
 * You may recall that an array arr is a mountain array if and only if:
 * 
 * 
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * 
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * 
 * 
 * 
 * 
 * Given a mountain array mountainArr, return the minimum index such that
 * mountainArr.get(index) == target. If such an index does not exist, return
 * -1.
 * 
 * You cannot access the mountain array directly. You may only access the array
 * using a MountainArray interface:
 * 
 * 
 * MountainArray.get(k) returns the element of the array at index k
 * (0-indexed).
 * MountainArray.length() returns the length of the array.
 * 
 * 
 * Submissions making more than 100 calls to MountainArray.get will be judged
 * Wrong Answer. Also, any solutions that attempt to circumvent the judge will
 * result in disqualification.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: mountainArr = [1,2,3,4,5,3,1], target = 3
 * Output: 2
 * Explanation: 3 exists in the array, at index=2 and index=5. Return the
 * minimum index, which is 2.
 * 
 * Example 2:
 * 
 * 
 * Input: mountainArr = [0,1,2,4,2,1], target = 3
 * Output: -1
 * Explanation: 3 does not exist in the array, so we return -1.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 3 <= mountainArr.length() <= 10^4
 * 0 <= target <= 10^9
 * 0 <= mountainArr.get(index) <= 10^9
 * 
 * 
 */

// @lc code=start
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int length = mountainArr.length();
        int low = 1;
        int high = length - 2;
        int peak=0;
        while(low <= high)
        {

            int mid = low + (high - low) / 2;
            if(mountainArr.get(mid) > mountainArr.get(mid+1))
            {
                peak = mid;
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        low = 0;
        high = peak;
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            if(mountainArr.get(mid) == target)
            {
                return mid;
            }
            else if(mountainArr.get(mid) < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        low = peak + 1;
        high = length - 1;
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            if(mountainArr.get(mid) == target)
            {
                return mid;
            }
            else if(mountainArr.get(mid) < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return -1;
        }

    }

// @lc code=end

