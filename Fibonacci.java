//Fibonacci Numbers Sequence
import java.util.Scanner;

class Fibonacci {
      public static void main(String[] args) {
            int n;
            try (Scanner sc = new Scanner(System.in)) {
                  n = sc.nextInt();
            }
            int a = 0, b = 1;
            int next = 0;
            for (int i = 0; i < n; i++) {
                  next = a + b ; 
                  a = b ;
                  b = next;
                  System.out.println(a);

            }
      }
}