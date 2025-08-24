/*
 * @lc app=leetcode id=43 lang=java
 *
 * [43] Multiply Strings
 */

// @lc code=start
class Solution {
    public String multiply(String num1, String num2) {
        int a = Integer.parseInt(num1,10);
        int b = Integer.parseInt(num2,10);
        int mul = a * b ;
        String res = Integer.toString(mul);
        return res;
    }
}
// @lc code=end

