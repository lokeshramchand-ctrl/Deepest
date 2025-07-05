import java.util.Scanner;

public class SwapDigits
{

public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b =  sc.nextInt();
            int temp = 0;
            temp = a ;
            a = b ;
            b = temp;
            System.out.println(a);
            System.out.println(b);
      }




}
}