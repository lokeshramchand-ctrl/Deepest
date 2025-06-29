// public class kthlargest {
//     public int findKthLargest(int[] nums , int k)
//     {
//         Arrays.sort(nums);

//         return k;
//     }
//     public static void main(String[] args) {
//         findKthLargest solution = new findKthLargest();
//         int[] nums = {3, 6, 9, 1};
//         System.out.println("Maximum Gap: " + solution.findKthLargest(nums)); // Output: 3
//     }
// }
// /

import java.util.Arrays;

public class kthlargest
{
    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        Arrays.sort(nums);
        int k = 4 ;
        System.out.println((nums.length -1 ) - k); 
    }
}