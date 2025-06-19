import java.util.Scanner;
import java.util.Arrays;

public class ArraySkip {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr); 
            System.out.println("Sorted Array: " + Arrays.toString(arr));

            int i;
            for (i = 0; i < n - 1; i += 2) {
                if (arr[i] != arr[i + 1]) {
                    System.out.println("Single element: " + arr[i]);
                    return;
                }
            }

            // If no unique element found in pairs, it must be the last element
            System.out.println("Single element: " + arr[n - 1]);
        }
    }
}
