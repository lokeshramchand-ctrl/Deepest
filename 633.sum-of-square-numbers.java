
/*
 * @lc app=leetcode id=633 lang=java
 *
 * [633] Sum of Square Numbers
 */
import java.util.*;

// @lc code=start
class Solution {
    public boolean judgeSquareSum(int c) {
        int left = 0;
        int right = (int) Math.sqrt(c);
        int[] nums = new int[right + 1]; // array from 0 to sqrt(c)

        for (int i = 0; i <= right; i++) {
            nums[i] = i;
        }
        while (left <= right) {
             long sum = (long) left * left + (long) right * right;
            if (sum == c) {
                return true;
            } else if (sum > c) {
                right--;
            } else {
                left++;
            }
        }
        return false;

    }
}
// @lc code=end
