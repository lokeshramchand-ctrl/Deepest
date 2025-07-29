/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 *
 * https://leetcode.com/problems/valid-anagram/description/
 *
 * algorithms
 * Easy (66.87%)
 * Likes:    13276
 * Dislikes: 443
 * Total Accepted:    5M
 * Total Submissions: 7.5M
 * Testcase Example:  '"anagram"\n"nagaram"'
 *
 * Given two strings s and t, return true if t is an anagram of s, and false
 * otherwise.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "anagram", t = "nagaram"
 * 
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "rat", t = "car"
 * 
 * Output: false
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length, t.length <= 5 * 10^4
 * s and t consist of lowercase English letters.
 * 
 * 
 * 
 * Follow up: What if the inputs contain Unicode characters? How would you
 * adapt your solution to such a case?
 * 
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] la = s.toCharArray();
        char[] le = t.toCharArray();
        Arrays.sort(la);
        Arrays.sort(le);
return Arrays.equals(la,le);
    }
}
// @lc code=end

