//Check if a number is Prime
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            n = sc.nextInt();
        }

        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false; // 0 and 1 are not prime
        } else {
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break; // Exit loop early since it's not prime
                }
            }
        }

        if (isPrime) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number isn't prime");
        }
    }
}
