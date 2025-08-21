import java.util.*;
public class C_1_The_Cunning_Seller_easy
{
      static int MAX_EXP = 20; // 3^20 > 10^9
    static long[] powers = new long[MAX_EXP + 1];
    static long[] costs = new long[MAX_EXP + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Precompute powers of 3 and costs
        powers[0] = 1;
        for (int i = 1; i <= MAX_EXP; i++) {
            powers[i] = powers[i - 1] * 3;
        }

        for (int i = 0; i <= MAX_EXP; i++) {
            // cost(x) = 3^(x+1) + 1 + x * 3^(x-1), careful about x=0 case for 3^(x-1)
            if (i == 0) {
                costs[i] = (long) Math.pow(3, 1) + 1 + 0; // 3^1 + 1 + 0 = 3 + 1 = 4 (but example test 1 cost = 3)
                // The problem example says cost of 1 watermelon (3^0) = 3 coins, so cost(0)=3
                costs[i] = 3; // override per problem note
            } else {
                costs[i] = (long) Math.pow(3, i + 1) + 1 + i * (long) Math.pow(3, i - 1);
            }
        }

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            // Convert n to base 3:
            int[] ternary = new int[MAX_EXP + 1];
            int idx = 0;
            int temp = n;
            while (temp > 0) {
                ternary[idx++] = temp % 3;
                temp /= 3;
            }

            // Calculate total cost as sum of ternary digits * cost of respective deal
            long totalCost = 0;
            for (int i = 0; i < idx; i++) {
                totalCost += ternary[i] * costs[i];
            }

            System.out.println(totalCost);
        }

        sc.close();
    }
}