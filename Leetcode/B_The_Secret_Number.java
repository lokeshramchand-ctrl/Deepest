import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B_The_Secret_Number
{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            List<Long> candidates = new ArrayList<>();

            // Try k from 1 until 10^k > n to avoid unnecessary checks
            for (int k = 1; ; k++) {
                // 10^k can be large, use pow carefully and break if exceeds n
                long power = pow10(k);
                if (power > n) break;

                long divisor = 1 + power;
                if (n % divisor == 0) {
                    long x = n / divisor;
                    candidates.add(x);
                }
            }

            if (candidates.isEmpty()) {
                System.out.println(0);
            } else {
                Collections.sort(candidates);
                System.out.println(candidates.size());
                for (long x : candidates) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }

    private static long pow10(int exp) {
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result *= 10;
            if (result < 0) { // overflow safeguard, though won't happen below 19 digits
                return Long.MAX_VALUE;
            }
        }
        return result;
    }
}
