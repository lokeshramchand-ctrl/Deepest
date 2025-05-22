
public class Duplicate {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[left] != nums[right])
                left++;
            nums[left] = nums[right];

        }
        return left + 1;
    }

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
