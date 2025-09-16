
class Solution {
    public static void main(String[] args) {
        int[][] nums = { { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 } };
        int m = nums.length;
        int n = nums[0].length;
        boolean zeroi[] = new boolean[m];
        boolean zeroesj[] = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i][j] == 0) {
                    zeroi[i] = true;
                    zeroesj[j] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for(int j = 0 ; j < n ; j++)
            {
                if(zeroi[i] == true || zeroesj[j] == true)
                {
                    nums[i][j] = 0;
                }
            }
        }
        
    }
}
