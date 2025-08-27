/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

// @lc code=start
class Solution {
          private int getNext(int x)
        {
            int sum = 0;
            while(x > 0)
            {
                int digit = x % 10;
                sum+= digit * digit;
                x = x / 10;
            }
            return sum;
        }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);
        while(fast != 1 && slow != fast)
        {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        return fast == 1;
    }
}
// @lc code=end

