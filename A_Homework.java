import java.util.Scanner;

public class A_Homework
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String a = sc.next();
            int m = sc.nextInt();
            String b = sc.next();
            String c = sc.next();

            StringBuilder sb = new StringBuilder(a);

            for (int i = 0; i < m; i++) {
                char ch = b.charAt(i);
                if (c.charAt(i) == 'V') {
                    sb.insert(0, ch); // Vlad adds at the beginning
                } else {
                    sb.append(ch);    // Dima adds at the end
                }
            }

            System.out.println(sb.toString());
        }
        sc.close();
    }
}