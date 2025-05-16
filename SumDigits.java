import java.util.Scanner;

public class SumDigits {
      public static void main(String[] args) {
            int n;
            try (Scanner sc = new Scanner(System.in)) {
                  n = sc.nextInt();
            }
            while(n > 0)
            {
                  int digit = n % 10;
                  n = n / 10;
                  System.out.println(digit+n);


            }
      }
}
