import java.util.Scanner;

public class A_Chewbaсca_and_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            int digit = c - '0';
            if (i == 0 && digit == 9) {
                res.append('9');
            } else {
                int flipped = Math.min(digit, 9 - digit);
                res.append(flipped);
            }
        }
        System.out.println(res);
    }
}