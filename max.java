import java.util.Arrays;
// LeetCode Problem: https://leetcode.com/problems/maximum-gap/
// Problem Statement: Given an unsorted array, find the maximum difference between the successive elements in its sorted form.
// If the array contains less than 2 elements, return 0.
// Note: You may assume that all elements in the array are non-negative integers and that the
public class max {
    public int maximumGap(int[] nums)
    {
        Arrays.sort(nums);
        int maxGap = 0;
        for (int i = 1; i < nums.length; i++) {
            int gap = nums[i] - nums[i - 1];
            if (gap > maxGap) {
                maxGap = gap;
            }
        }
        return maxGap;
    }
    public static void main(String[] args) {
        max solution = new max();
        int[] nums = {3, 6, 9, 1};
        System.out.println("Maximum Gap: " + solution.maximumGap(nums)); // Output: 3
    }
}
