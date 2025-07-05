import java.util.Scanner;

public class ArrayInit {
      public static void main(String[] args)
      {
            int n;
            try (Scanner sc = new Scanner(System.in)) {
                  n = sc.nextInt();
                  int arr[] = new int[n];
                  for(int i = 0 ; i < n ; i++)
                  {
                        arr[i] = sc.nextInt();
                  }
            }
      }
}
