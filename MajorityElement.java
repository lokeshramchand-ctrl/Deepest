
public class MajorityElement {
        public int removeDuplicates(int[] nums) {
        int left = 1;
        for(int right = 1 ; right < nums.length ; right++)
        {
            if(nums[left] != nums[right])

                left++;
                nums[left] = nums[right];
        
        }
        return left + 1 ;
    }
    
    public class Main {
    public static void main(String[] args) {
        MajorityElement obj = new MajorityElement();
        int[] nums = {0,0,1, 1, 2, 2, 3, 3, 4};

        int newLength = obj.removeDuplicates(nums);

        System.out.println("New length after removing duplicates: " + newLength);
        System.out.print("Array after removal: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
}


