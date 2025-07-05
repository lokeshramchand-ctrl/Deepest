import java.util.Scanner;

public class SumDigits {
      public static void main(String[] args) {
            int n;
            try (Scanner sc = new Scanner(System.in)) {
                  n = sc.nextInt();
            }
            int remainder = 0;
            while(n > 0)
            {
                  int digit = n % 10;
                   remainder = remainder + digit;
                  n = n / 10;
            }
            System.out.println(remainder);
      }
}
