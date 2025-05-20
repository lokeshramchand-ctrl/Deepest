import java.util.Scanner;

public class ReverseArray {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = 5;
            int temp = 0;
            int arr[] = new int[n];
            int left = 0;
            int right = n - 1;

            for (int i = 0; i < n; i++) {
                  arr[i] = sc.nextInt();
            }
            while (left < right) {
                  temp = arr[left];
                  arr[left] = arr[right];
                  arr[right] = temp;
                  left++;
                  right--;

            }
            for (int i = 0; i < n; i++) {
                  System.out.println(arr[i]);
            }

      }
}
