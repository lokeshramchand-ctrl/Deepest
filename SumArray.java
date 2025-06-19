 import java.util.Scanner;

public class SumArray {
      public static void main(String[] args) {
            int n;
            int sum = 0;
            try (Scanner sc = new Scanner(System.in)) {
                  n = sc.nextInt();
                  int arr[] = new int[n];
                  for(int i = 0 ; i < n ; i++)
                  {
                        arr[i] = sc.nextInt();
                  }
                  for(int i = 0 ; i < n ; i++)
                  {
                        sum += arr[i];
                  }
                  System.out.println(sum);
            }
      }
}

