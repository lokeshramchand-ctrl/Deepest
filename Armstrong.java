import java.util.Scanner;

public class Armstrong {
      public static void main(String[] args) {
            int n;
            try (Scanner sc = new Scanner(System.in)) {
                  n = sc.nextInt();
            }
            int original = n;
            int remainder = 0;
            while(n > 0)
            {
                  int digit = n % 10;
                  remainder = remainder + (digit * digit * digit);
                  n = n / 10;
            }
            if(remainder == original)
            {
                  System.out.println("The num is armstrong");
            }
            else
            {
                  System.out.println("Not an Armstrong number");
            }
      }
}
