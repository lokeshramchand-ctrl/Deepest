import java.util.*;

public class C_1_The_Cunning_Seller_easy_version {
    static int MAX_EXP = 40; // more to handle carry overflow safely
    static long[] powers = new long[MAX_EXP + 1];
    static long[] costs = new long[MAX_EXP + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Precompute powers of 3
        powers[0] = 1;
        for (int i = 1; i <= MAX_EXP; i++) {
            powers[i] = powers[i - 1] * 3;
        }

        // Precompute costs according to problem formula
        for (int i = 0; i <= MAX_EXP; i++) {
            if (i == 0) {
                costs[i] = 3; // direct from problem note
            } else {
                costs[i] = (long) Math.pow(3, i + 1) + 1 + i * (long) Math.pow(3, i - 1);
            }
        }

        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();

            // Convert n to ternary digits
            int[] ternary = new int[MAX_EXP + 1];
            int idx = 0;
            long temp = n;
            while (temp > 0) {
                ternary[idx++] = (int)(temp % 3);
                temp /= 3;
            }

            // Process digits with carry to minimize cost
            long totalCost = 0;
            int carry = 0;
            for (int i = 0; i <= idx; i++) {
                int cur = ternary[i] + carry;
                carry = 0;
                if (cur <= 1) {
                    totalCost += cur * costs[i];
                } else if (cur == 2) {
                    // Instead of two deals, buy one deal now, and carry 1 to next digit
                    totalCost += costs[i];
                    carry = 1;
                } else if (cur == 3) { // 3 means 0 now + carry 1 to next
                    carry = 1;
                }
            }

            // If carry leftover after last digit, add cost for deal of next power
            if (carry == 1) {
                totalCost += costs[idx + 1];
            }

            System.out.println(totalCost);
        }

        sc.close();
    }
}
