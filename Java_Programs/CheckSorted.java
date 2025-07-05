
import java.util.Scanner;

public class CheckSorted {
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
                  for(int i = 0 ; i <= n-2 ; i++)
                  {
                        if(arr[i] <= arr[i+1])
                        {
                        }
                        else
                        {
                              System.out.println("Not Sorted");
                                                            break;

                        }
                  }
            }

      }
}



/*import java.util.Scanner;

public class CheckSorted {
    public static void main(String[] args) {
        int n;
        boolean isSorted = true;

        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    break;
                }
            }

            if (isSorted) {
                System.out.println("Sorted");
            } else {
                System.out.println("Not Sorted");
            }
        }
    }
}
 */