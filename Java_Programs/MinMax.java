 import java.util.Scanner;

public class MinMax {
      public static void main(String[] args) {
            int n;
            try (Scanner sc = new Scanner(System.in)) {
                  n = sc.nextInt();
                  int arr[] = new int[n];
                  for(int i = 0 ; i < n ; i++)
                  {
                        arr[i] = sc.nextInt();
                  }
                  int max = arr[0];
                  for(int i = 1 ; i < n ; i++)
                  {
                        if(arr[i] > max)
                        {
                              max = arr[i];
                        }
                  }
                  System.out.println(max);
            }
      }
}

