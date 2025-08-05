 class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        int[] result = new int[nums.length];
        int index1 = 0;
        int index2 = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] >= pivot)
            {
                arr1[index1++] = nums[i];
            }
            else
            {
                arr2[index2++] = nums[i];
            }
        } 
        for(int i = 0 ; i < nums.length ; i++)
        {
            result[arr1.length + 1] = arr2[i];
        }
        return result;
    }
}
// @lc code=end

