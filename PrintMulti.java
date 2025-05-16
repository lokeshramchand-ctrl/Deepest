import java.util.Scanner;

public class PrintMulti {
      public static void main(String[] args) {
            int n;
            try (Scanner sc = new Scanner(System.in)) {
                  n = sc.nextInt();
            }
            for (int i = 1; i <= 10; i++) {
                  System.out.println("" + n + "X" + "" + i + "=" + "" + n * i);
            }

      }
}
