import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
        }

        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }

        if (original == reversed) {
            System.out.println("It is a palindrome number");
        } else {
            System.out.println("It is not a palindrome number");
        }
    }
}
