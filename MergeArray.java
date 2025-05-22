/* 
public class MergeArray {
      public int[] merge(int[] nums1, int[] nums2) {
            int n1 = nums1.length;
            int n2 = nums2.length;
            int merged[] = new int[n1 + n2];
            for (int i = 0; i < n1; i++) {
                  merged[i] = nums1[i];
            }
            for (int j = 0; j < n2; j++) {
                  merged[n1 + j] = nums2[j];
            }
                  int j = 0; // Pointer for new valid (odd) elements
                  for (int i = 0; i < merged.length; i++) {
                        if (merged[i] % 2 != 0) { // If odd
                              merged[j++] = merged[i];
                        }
                  }
            
            return merged;
      }

      public static void main(String[] args) {
            MergeArray obj = new MergeArray();

            int[] nums1 = { 1, 3, 5 };
            int[] nums2 = { 2, 4, 6 };

        int[] result = mergeAndRemoveEvens(nums1, nums2);

        System.out.print("Array after removing multiples of 2: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
      }
}
*/