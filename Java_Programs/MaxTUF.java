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


    public static void main(String[] args) {
        MaxTUF obj = new MaxTUF();
        int[] nums = {5, 2, 8, 1, 9, 3};
        
        int maxValue = obj.maxi(nums);
        
        System.out.println("Maximum value in the array: " + maxValue);
    }
}

/*
public class Duplicate {
    public int removeDuplicates(int[] nums) {
        int left = 1;
        for (int right = 1; right < nums.length; right++) {
            if (nums[left] != nums[right])

                left++;
            nums[left] = nums[right];

        }
        return left + 1;
    }

    public class Main {
        public static void main(String[] args) {
            Duplicate obj = new Duplicate();
            int[] nums = { 0, 0, 1, 1, 2, 2, 3, 3, 4 };

            int newLength = obj.removeDuplicates(nums);

            System.out.println("New length after removing duplicates: " + newLength);
            System.out.print("Array after removal: ");
            for (int i = 0; i < newLength; i++) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}
 */