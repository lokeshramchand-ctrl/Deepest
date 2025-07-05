import java.util.Scanner;

public class PrintPrime {
      public static void main(String[] args) {
            int n;
            try (Scanner sc = new Scanner(System.in)) {
                  n = sc.nextInt();
            }
            for (int j = 2; j <= n; j++) {
                  boolean isPrime = true; 

                  for (int i = 2; i <= j - 1; i++) {
                        if (j % i == 0) {
                              isPrime = false;
                              break; 
                        }
                  }

                  if (isPrime) {
                        System.out.println(j); // Print only once
                  }
            }

      }

}