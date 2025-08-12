import java.util.*;

public class Main {

    public int solve(int N, int K, int[] steps) {
        int count = 0;
        int totalDays = N * 7;

        // Slide over all full 3-week blocks (21 days)
        for (int i = 0; i + 21 <= totalDays; i += 21) {
            int week1 = 0, week2 = 0, week3 = 0;

            for (int j = 0; j < 7; j++) {
                week1 += steps[i + j];
                week2 += steps[i + 7 + j];
                week3 += steps[i + 14 + j];
            }

            if (week1 >= K || week2 >= K || week3 >= K) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Main obj = new Main();

        // Test Case 1
        int N1 = 5;
        int K1 = 10000;
        int[] steps1 = {
            // Week 1
            2000, 1500, 1800, 1300, 1700, 1900, 800,
            // Week 2
            3000, 3000, 3000, 3000, 1000, 500, 300,
            // Week 3
            200, 600, 400, 300, 500, 300, 200,
            // Week 4
            4000, 4000, 4000, 2000, 1000, 500, 500,
            // Week 5
            1000, 1000, 1000, 1000, 1000, 1000, 1000
        };

        int result1 = obj.solve(N1, K1, steps1);
        System.out.println(result1);  // Should evaluate 3-week blocks from week 1–3, 4–5 is ignored
    }
}
