two binary strings /*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        int one = Integer.parseInt(a , 2);
        int two = Integer.parseInt(b,2);
        int sum = one + two;
        String result = Integer.toBinaryString(sum);
        return result;
    }
}
// @lc code=end

