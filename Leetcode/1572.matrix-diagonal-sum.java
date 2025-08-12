/*
 * @lc app=leetcode id=1572 lang=java
 *
 * [1572] Matrix Diagonal Sum
 */

// @lc code=start
class Solution {
    public int diagonalSum(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int sum = 0;
        for(int i = 0 ; i < r ; i++)
        {
            for(int j = 0 ; j < c ; j++)
            {
                if(i == j)
                {
                    sum+=mat[i][j];
                }
                else if ((i + j) == (c - 1)) {
                   sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
}
// @lc code=end

