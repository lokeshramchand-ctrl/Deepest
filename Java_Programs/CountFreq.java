import java.util.Scanner;

public class CountFreq {
      public static void main(String[] args) {
            int n;
            try (Scanner sc = new Scanner(System.in)) {
                  n = sc.nextInt();
                  int arr[] = new int[n];
                  int freq[] = new int[101];
                  for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                  }
                  for (int i = 0; i < n; i++) {
                        freq[arr[i]]++;
                  }
                  for (int i = 0; i < 101; i++) {
                        if (freq[i] > 0) {
                              System.out.println(i + ": " + freq[i]);
                        }
                  }

            }
      }
}
