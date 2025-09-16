
class Solution {
    public static void main(String[] args) {
        int[] nums =  {2,6,4,8,10,9,15};
        int count = 0;
        for(int i = 0 ; i < nums.length - 1 ; i++)
        {
            if(nums[i + 1] != nums[i] + 1)
            {
                count++;
            }
        }
        System.out.println(count - 1);
        
        
    }
}
