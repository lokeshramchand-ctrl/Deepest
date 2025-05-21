public class MaxTUF {
      public int maxi(int nums[])
      {
            int max = nums[0];
            for(int i = 1 ; i < nums.length - 1  ; i++)
            {
                  if(nums[i] < max)
                  {
                        nums[i] = max;
                  }
            }
            return max;
      }


public class Main {
    public static void main(String[] args) {
        MaxTUF obj = new MaxTUF();
        int[] nums = {5, 2, 8, 1, 9, 3};
        
        int maxValue = obj.maxi(nums);
        
        System.out.println("Maximum value in the array: " + maxValue);
    }
}
}