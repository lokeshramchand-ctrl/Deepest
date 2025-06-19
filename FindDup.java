import java.util.Scanner;

public class FindDup {
      public static void main(String[] args) {
            int n;
            try (Scanner sc = new Scanner(System.in)) {
                  n = sc.nextInt();
                  int arr[] = new int[n];
                  for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                  }
                  int temp = 0;
                  for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                              if (arr[j] > arr[j + 1]) {
                                    temp = arr[j];
                                    arr[j] = arr[j + 1];
                                    arr[j + 1] = temp;
                              }

                        }
                  }
                  for (int i = 0; i < n; ++i)
                        System.out.print(arr[i] + " ");

                  int left = 0;
                  int is_dup = 0;
                  for (int i = 0; i < n; i++) {
                        if (arr[i] != arr[left]) {
                              is_dup = 0;
                                                            left++;
                              left++;

                        } else {
                              is_dup = 1;
                              break;
                        }
                  }
                  if (is_dup == 1) {
                        System.out.println("True");
                  } else {
                        System.out.println("False");
                  }

            }
      }
}
