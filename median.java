import java.util.Arrays;

public class median {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        double merged[] = new double[m + n];
        for (int i = 0; i < m; i++) {
            merged[i] = nums1[i];
        }
        for (int j = 0; j < n; j++) {
            merged[m + j] = nums2[j];
        }
        Arrays.sort(merged);
        int count = merged.length;
        int half = count / 2;
        double hehe = (merged[half] + merged[(half - 1)]) / 2;
        return hehe;

    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2 };
        int[] nums2 = { 3, 4 };
        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("The median is: " + median);
    }
}