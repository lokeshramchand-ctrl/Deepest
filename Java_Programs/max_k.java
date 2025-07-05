public class max_k {
    public int maxOperations(int[] nums, int k) {
        int max_sum = 0;
        int window_sum = 0;
        for(int i = 0 ; i < k ; i++)
        {
            window_sum += nums[i];
        }
        for(int i = k ; i < nums.length ; i++)
        {
            window_sum += nums[i] - nums[i - k];
            max_sum = Math.max(max_sum,window_sum);
        }
        return max_sum;
    }
    public static void main(String[] args) {
        max_k solution = new max_k();
        int[] nums = {3,1,3,4,3};
        int k = 6;
        System.out.println("Maximum sum of subarray of size " + k + ": " + solution.maxOperations(nums, k));
    }



}
