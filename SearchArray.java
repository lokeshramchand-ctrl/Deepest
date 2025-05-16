import java.util.Scanner;

public class SearchArray {
      public static void main(String[] args) {
            int n;
            int count = 0 ; 
            try (Scanner sc = new Scanner(System.in)) {
                  n = sc.nextInt();
                  int arr[] = new int[n];
                  int search = sc.nextInt();
                  for(int i = 0 ; i < n ; i++)
                  {
                        arr[i] = sc.nextInt();
                  }
                  for(int i = 0 ; i < n ; i++)
                  {
                        if(arr[i] == search)
                        {
                              count++;
                        }
                  }
                  System.out.println(count);
            }
      }
}
