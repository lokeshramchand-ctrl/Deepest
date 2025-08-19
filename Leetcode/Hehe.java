import java.util.Arrays;

public class Hehe {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int pro = 1;
            for (int j = 0; j < nums.length; j++) {
                if(j == i){
                    continue;
                }
                pro *= nums[j];
            }
            arr[i] = pro;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
